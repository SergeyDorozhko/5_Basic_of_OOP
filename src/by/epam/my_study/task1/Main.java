package by.epam.my_study.task1;

public class Main {
    public static void main(String[] args){
        Directory dir = new Directory("d","sdf\\sdfsdsdf\\sdf\\kjkln njnjkn" );

        File test = new TextFile("asddsf1",dir.getFilePath() ,TextFileExtation.DOCX);

        test.showFile();

        ((TextFile) test).addContent("Hi, how are you?\n Fine");

        test.showFile();

        dir.addTextFile(test);

        dir.newTextFile("Hello", TextFileExtation.DOCX);


        System.out.println("---------------------------------------------------");
        for (File el: dir.showAllFiles()){
            System.out.println(el.getName());
        }


        dir.newTextFile("Hi", TextFileExtation.DOC);

        System.out.println("---------------------------------------------------");
        for (File el: dir.showAllFiles()){
            System.out.println(el.getName());
        }

        dir.addTextFile(test);

        dir.removeTextFile("Hi");

        System.out.println("---------------------------------------------------");
        for (File el: dir.showAllFiles()){
            System.out.println(el.getName());
        }


        System.out.println("---------------------SHOW FILE---------------------------");

        dir.showFile("Hello");


        dir.changeContentTextFile("Hello", "asfdd");

        dir.showFile("Hello");

    }
}
