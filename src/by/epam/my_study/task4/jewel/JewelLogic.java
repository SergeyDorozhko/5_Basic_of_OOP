package by.epam.my_study.task4.jewel;

public class JewelLogic {
    private JewelsAgrigation allJewels = new JewelsAgrigation();

    public JewelLogic(){
        allJewels.loadJewels();
    }


    public JewelsAgrigation getAllJewels() {
        return allJewels;
    }

    public void showAllJewels(){
        int i = 0;
        for(Jewel el : allJewels.getJewels()){
            System.out.println(i + ")" + el.getName() + ", price:" + el.getPrice());
            i++;
        }
    }

    public Jewel getMostExpencive(){
        int index = 0;
        int maxPrice = allJewels.getJewels().get(0).getPrice();
        int indexOfMostExpesive = 0;
        for (Jewel el: allJewels.getJewels()){
            if(el.getPrice() > maxPrice){
                maxPrice = el.getPrice();
                indexOfMostExpesive = index;
            }
            index++;
        }

        return allJewels.getJewels().get(indexOfMostExpesive);
    }


    public Jewel getCheapest(){
        int index = 0;
        int minPrice = allJewels.getJewels().get(0).getPrice();
        int indexOfCeapest = 0;
        for (Jewel el: allJewels.getJewels()){
            if(el.getPrice() < minPrice){
                minPrice = el.getPrice();
                indexOfCeapest = index;
            }
            index++;
        }

        return allJewels.getJewels().get(indexOfCeapest);
    }


    public Jewel getJewel(int index){
        return allJewels.getJewels().get(index);
    }
}
