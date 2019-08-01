package by.epam.my_study.task4.jewel;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JewelsAgrigation {

    private static ArrayList<Jewel> jewels = new ArrayList<Jewel>();  //т.к. это список всех доступных сокровищ, он общий для всех экземпляров класса


    public ArrayList<Jewel> getJewels() {
        return jewels;
    }

    private void addJewel(Jewel jewel) {
        jewels.add(jewel);
    }


    public void loadJewels(){

        try{
            File file = new File("Jewels.txt");
            FileReader read = new FileReader(file);
            Scanner scan = new Scanner(read);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] jewelNameCost = line.split(" ");
                Jewel jewel = new Jewel(jewelNameCost[0] , Integer.parseInt(jewelNameCost[1]));


                addJewel(jewel);
            }

            read.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void saveJewels(){
        try{
            File file = new File( "Jewels.txt");
            FileWriter save = new FileWriter(file);
            BufferedWriter buff = new BufferedWriter(save);

            for(Jewel el : jewels){
                buff.write(el + "\n");
            }

            buff.close();
            save.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}
