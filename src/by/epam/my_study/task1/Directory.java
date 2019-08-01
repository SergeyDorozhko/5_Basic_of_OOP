package by.epam.my_study.task1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Directory {

    private String disk;
    private String filePath;
    private File[] files = new File[20];

    Directory(String disk, String filePath){
        Pattern diskTemplate = Pattern.compile("^[A-Z]{1}$");
        Matcher checkDisk = diskTemplate.matcher(disk.toUpperCase());

        Pattern filePathTemplate = Pattern.compile("^([^/\\\\!.,><?]+\\\\?)++$");
        Matcher checkFilePath = filePathTemplate.matcher(filePath);


        if(checkDisk.find() && checkFilePath.find()){
            this.disk = checkDisk.group();
            this.filePath = checkFilePath.group();
        }else{
            System.out.println("Incorrect directory, directory couldn't contain such symbols as ,.!><?/\\, saved to default C:\\my files.");
            this.disk = "C";
            this.filePath = "my files";
        }


    }

    public String getFilePath(){
        return disk + ":\\" + filePath + "\\";
    }

    public void newTextFile(String fileName,  TextFileExtation fileExtantion){
        if(emptyArrayPlace(files) >= 0) {
            files[emptyArrayPlace(files)] = new TextFile(fileName, getFilePath(), fileExtantion);
        }else{
            System.out.println("HDD memory is full, file did not add.");
        }
    }

    public void addTextFile(File file){
        if(findFile(file.getName()) >= 0 ) {
            if (emptyArrayPlace(files) >= 0) {
                files[emptyArrayPlace(files)] = file;
            } else {
                System.out.println("HDD memory is full, file did not add.");
            }
        }else{
            System.out.println("File with this name already exist");
        }

    }


    public void removeTextFile(String fileName){
        if(findFile(fileName) >= 0){
            files[findFile(fileName)] = null;
        }else{
            System.out.println("File not found.");
        }
    }


    public void changeContentTextFile(String fileName, String content){
        if(findFile(fileName) >= 0) {
            ((TextFile) files[findFile(fileName)]).addContent(content);
        }else{
            System.out.println("File not found.");
        }
    }

    public File[] showAllFiles(){

        int countFiles = 0;
        for (int i = 0; i < files.length; i++){
            if(files[i] != null){
                countFiles++;
            }
        }

        File[] allfiles = new File[countFiles];

        for(int i = 0, j = 0; i < files.length; i++){
            if(files[i] != null){
                allfiles[j] = files[i];
                j++;
            }
        }
        return allfiles;
    }

    public void showFile(String fileName){
        if(findFile(fileName) >= 0) {
            files[findFile(fileName)].showFile();
        }else{
            System.out.println("File not found.");
        }
    }


    private int emptyArrayPlace(File [] array){
        int freeElement = -1;
        for(int i = 0; i < array.length; i++){
            if (array[i] == null){
                freeElement = i;
                break;
            }
        }

        return freeElement;
    }

    private int findFile(String fileName){
        int isFind = -1;
        for(int i = 0; i < files.length; i++){
            if(files[i] != null && files[i].getName().equals(fileName)){
                isFind = i;
                break;
            }
        }
        return isFind;
    }
}
