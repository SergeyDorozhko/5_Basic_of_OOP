package by.epam.my_study.task4.gui;

import by.epam.my_study.task4.accounts.UserJewelAgrigation;
import by.epam.my_study.task4.accounts.UserJewels;
import by.epam.my_study.task4.jewel.JewelLogic;
import java.util.Scanner;

public class ConsolLogic {

    private JewelLogic jLogic = new JewelLogic();
    private UserJewelAgrigation userJewelAgrigation = new UserJewelAgrigation();



    protected int scanInputOfMenu(){
        Scanner scan = new Scanner(System.in);
        int input = -1;
        if(scan.hasNextInt()) {
            input = scan.nextInt();
            String line = scan.nextLine();
        }else{
            System.out.println("Incorrect input, Your input is:" + scan.nextLine());
        }

        return input;
    }


    public void showAllJewels(){
        jLogic.showAllJewels();
    }


    public void takeMostExpensiveJewel(){
        System.out.println("You take: " + jLogic.getMostExpencive());
        userJewelAgrigation.addUserJewel(jLogic.getMostExpencive());
    }


    public void takeJewelsForSumm(int summOfMoney){


        do {

            System.out.println("You have " + summOfMoney + " pounds. Select Jewel:");
            showAllJewels();

            int indexOfSelectedJewel = scanInputOfMenu();
            if(indexOfSelectedJewel < jLogic.getAllJewels().getJewels().size() && summOfMoney >= jLogic.getJewel(indexOfSelectedJewel).getPrice()) {
                userJewelAgrigation.addUserJewel(jLogic.getJewel(indexOfSelectedJewel));
                summOfMoney -= jLogic.getJewel(indexOfSelectedJewel).getPrice();
            }else{
                System.out.println("You don't have enough money.");
            }
        }while(summOfMoney >= jLogic.getCheapest().getPrice());
    }


    public void showUserJewels(){

        for (UserJewels el: userJewelAgrigation.getUserJewels()){
            System.out.println("You have " + el.getCountUserJewel() + " pieces, of " + el.getUserJewel().getName());
        }

    }

}
