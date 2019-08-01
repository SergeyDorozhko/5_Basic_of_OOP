package by.epam.my_study.task2;
/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных
днях.
 */

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private double totalPay;
    private ArrayList<Product> purchase = new ArrayList<Product>();

    public double getTotalPay(){
        return totalPay;
    }

    public List<Product> getPurchase(){
        return purchase;
    }

    public void addProduct(String productName, double price){
        new Product(productName, price);
    }


    public void removeProduct(String productName){

        int indexOfProduct = -1;

        for(Product el: purchase){
            if (el.getProductName().toLowerCase().equals(productName.toLowerCase())){
                indexOfProduct = purchase.indexOf(el);
            }
        }

        if(indexOfProduct >= 0){
            totalPay -= purchase.get(indexOfProduct).getPrice();
            System.out.println("Del: " + purchase.get(indexOfProduct));
            purchase.remove(indexOfProduct);
        }

    }

    public void cashVoucher(){
        System.out.format("%n---------------------%nProduct %7s price: %10s%n%n","","");
        for (Product el: purchase){
            System.out.format("%-10s %10.2f%n", el.getProductName(), el.getPrice());
        }

        System.out.format("%n%10s %10.2f%n---------------------%n", "Total:", totalPay);
    }



    private class Product{
        private String productName;
        private double price;

        Product(String productName, double price){
            this.productName = productName;
            this.price = price;
            purchase.add(this);
            totalPay += price;
        }

        public void setPrice(double price){
            this.price = price;
        }

        public double getPrice(){
            return price;
        }

        public String getProductName(){
            return productName;
        }

        @Override
        public String toString(){
            return productName + ", price:" + price;
        }
    }



}

