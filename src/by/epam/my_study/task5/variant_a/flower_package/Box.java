package by.epam.my_study.task5.variant_a.flower_package;

public class Box extends FlowerPackage {
    private String name = "Box";
    private int boxLength;
    private int boxWidth;

    public Box(int boxLength, int boxWidth, Material material){
        if(boxLength > 0){
            this.boxLength = boxLength;
        }

        if(boxWidth > 0) {
            this.boxWidth = boxWidth;
        }

        super.setMaterial(material);
    }



    public String getName(){
        return name;
    }

    public int getBoxLength(){
        return boxLength;
    }

    public int getBoxWidth(){
        return boxWidth;
    }

    public String toString(){
        return name + ", size " + boxWidth + "x" + boxLength + ", material " + super.getMaterial();
    }

}
