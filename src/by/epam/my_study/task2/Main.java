package by.epam.my_study.task2;
/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных
днях.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Payment payment = new Payment();
//        Payment.Product milk = payment.new Product("Milk", 10);
//
//        payment.new Product("Bread", 15);
//
//        System.out.println(payment.getTotalPay());
//        System.out.println(payment.getPurchase().get(1));
//
//        payment.removeProduct("Bread");
//
//        for(Payment.Product el : payment.getPurchase()){
//            System.out.println("---" + el);
//        }

        payment.addProduct("Bread" , 20);
        payment.addProduct("Rise" , 50);



        System.out.println("-----------------------RESULT---------------");



        payment.addProduct("Cheese", 18);

        payment.cashVoucher();


        payment.removeProduct("Rise");

        payment.cashVoucher();
    }
}
