package by.epam.my_study.task5.variant_a.flower;

public class Flower {
    private String name;
    private int height;
    private FlowerType type;

    public Flower(String name, int height, FlowerType type){
        this.name = name;

        if(height > 0){
            this.height = height;
        }

        this.type = type;
    }


    public int getHeight(){
        return height;
    }

    public FlowerType getFlowerType(){
        return type;
    }

    public void setHeight(int height){
        if(height > 0) {
            this.height = height;
        }
    }

    public void setFlowerType(FlowerType type){
        this.type = type;
    }


    public String toString(){
        return name + " " + height + " " + type;
    }
}
