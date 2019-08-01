package by.epam.my_study.task4.jewel;

import java.util.Objects;

public class Jewel {
    private String name;
    private int price;


    public Jewel(String name, int price){
        this.name = name;

        if(price > 0) {
            this.price = price;
        }else{
            System.out.println("Incorrect price: " + price + " of " + name + ", set default 0.");
        }
    }


    public String getName() {
        return name;
    }



    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return name + " " + price;
    }


}
