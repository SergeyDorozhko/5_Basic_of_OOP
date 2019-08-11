package by.epam.my_study.task5.variant_a;
/*
Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции (объект представляющий собой цветочную
композицию). Cостовляющими цветочной композиции являются цветы и упаковка.
 */

import by.epam.my_study.task5.variant_a.flower.Flower;
import by.epam.my_study.task5.variant_a.flower.FlowerType;
import by.epam.my_study.task5.variant_a.flower_composition.FlowerComposition;
import by.epam.my_study.task5.variant_a.flower_package.Box;
import by.epam.my_study.task5.variant_a.flower_package.FlowerPackage;
import by.epam.my_study.task5.variant_a.flower_package.Material;

public class Main {
    public static void main(String[] args){
        FlowerPackage box = new Box(5, 6, Material.WOOD);

        Flower rose = new Flower("Rose", 50, FlowerType.BUSH);

        Flower chamomile = new Flower("Chamomile", 20, FlowerType.SINGLE);


        FlowerComposition composition = new FlowerComposition();
        composition.setFlowerPackage(box);
        composition.addFlower(rose);
        composition.addFlower(chamomile);
        composition.addFlower(rose);
        composition.addFlower(chamomile);
        composition.addFlower(rose);


        System.out.println(composition.toString());

    }
}
