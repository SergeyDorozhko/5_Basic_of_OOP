package by.epam.my_study.task5.variant_a.flower_composition;

import by.epam.my_study.task5.variant_a.flower.Flower;
import by.epam.my_study.task5.variant_a.flower_package.FlowerPackage;

import java.util.ArrayList;
import java.util.Arrays;


public class FlowerComposition {

    private FlowerPackage flowerPackage;
    private ArrayList<Flower> flowers = new ArrayList<>();


    public void setFlowerPackage(FlowerPackage flowerPackage){
        this.flowerPackage = flowerPackage;
    }

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public FlowerPackage getFlowerPackage(){
        return flowerPackage;
    }

    public ArrayList<Flower> getFlowers(){
        return flowers;
    }

    public String toString(){
        String flowersOfComposition = "";
        for(Flower el: flowers){
            flowersOfComposition += el + "\n";
        }
        return "Package: " + flowerPackage + "\nFlowers: " + flowersOfComposition;
    }
}
