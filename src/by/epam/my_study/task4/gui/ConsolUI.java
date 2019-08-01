package by.epam.my_study.task4.gui;

public class ConsolUI {
    public void startProgram(){

        ConsolLogic logic = new ConsolLogic();
        System.out.println("---Hello! You are in the game Dragon Jewels!!!---");

        do {
            System.out.println("\nChose You action:\n1)Show all Jewels of the dragon cave. \n2)Take the most expensive jewel.\n3)Take jewels for sum. \n4)Show Your jewels.\n0)exit.");

            int input = logic.scanInputOfMenu();
            switch (input){
                case 1:
                    logic.showAllJewels();

                    break;
                case 2:
                    logic.takeMostExpensiveJewel();
                    break;
                case 3:
                    System.out.println("For what summ You want to buy?");
                    logic.takeJewelsForSumm(logic.scanInputOfMenu());
                    break;
                case 4:
                    logic.showUserJewels();
                    break;
                case 0:
                    System.out.println("Goodbye!!! See You late!!!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Incorrect input");

            }

        }while (true);



    }
}
