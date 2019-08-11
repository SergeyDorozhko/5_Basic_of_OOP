package by.epam.my_study.task5.variant_a.flower_package;

public class Basket extends FlowerPackage {
    private String name = "Basket";
    private  int diameter;

    public Basket(int diameter, Material material){
        if(diameter > 0){
            this.diameter = diameter;
        }

        super.setMaterial(material);
    }



    public String getName(){
        return name;
    }

    public int getDiameter(){
        return diameter;
    }

    public String toString(){
        return name + ", size " + diameter + ", material " + getMaterial();
    }
}
