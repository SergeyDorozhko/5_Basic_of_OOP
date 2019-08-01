package by.epam.my_study.task1;

public class TextFile extends File{
    private String fileContent = "";
    private TextFileExtation fileExtantion;

    TextFile(String fileName, String filePath, TextFileExtation fileExtantion){
        super(fileName, filePath);

        this.fileExtantion = fileExtantion;
    }

    public String getFileExtantion(){
        return fileExtantion.toString().toLowerCase();
    }


    public String getFileContent() {
        return fileContent;
    }

    public void showFile(){

        System.out.format("File path: %s%s.%s%n", getDirectory(), getName(), getFileExtantion());
        System.out.format("%10s File name: %10s%n%s%n", "", getName(), fileContent);

    }





    public void addContent(String content){
        this.fileContent += content;
    }






}
