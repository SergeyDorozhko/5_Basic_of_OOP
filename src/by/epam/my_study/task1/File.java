package by.epam.my_study.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Создать объект класса текстовый файл, используя классы Файл и Дериктория. Методы создать, переименовать, вывести на консоль содержимое,
дополнить удалить.

 */
public abstract class File {
    private String name;
    private String directory;

    File(String name, String directory){
        Pattern nameTemplate = Pattern.compile("^[^!><?,./\\\\]+$");
        Matcher checkName = nameTemplate.matcher(name);
        if(checkName.find()) {
            this.name = name;
        }else{
            System.out.println("Incorrect name, name couldn't contain such symbols as .,!><?/\\, set empty name.");
            this.name = "";
        }

        this.directory = directory;
    }

    public String getName(){
        return name;
    }

    public String getDirectory(){
        return directory;
    }


    public void setName(String name){
        Pattern nameTemplate = Pattern.compile("^[^!><?/\\\\]+$");
        Matcher checkName = nameTemplate.matcher(name);
        if(checkName.find()) {
            this.name = name;
        }else{
            System.out.println("Incorrect name, name couldn't contain such symbols as .,!><?/\\, name didn't change.");
        }
    }

    abstract void showFile();

}
