package by.epam.my_study.task4.accounts;

import by.epam.my_study.task4.jewel.Jewel;

import java.util.ArrayList;
import java.util.List;

public class UserJewelAgrigation {

    private ArrayList<UserJewels> userJewels = new ArrayList<UserJewels>();

    public List<UserJewels> getUserJewels(){
        if(userJewels.size() == 0){
            System.out.println("List is empty.");
        }
        return userJewels;
    }



    public void addUserJewel(Jewel jewel){
        boolean isJewelExist = false;

        int index = 0;
        if(userJewels.size() > 0) {
            for (UserJewels el : getUserJewels()) {
                if (el.getUserJewel().getName().equals(jewel.getName()) && el.getUserJewel().getPrice() == jewel.getPrice()) {
                    isJewelExist = true;
                    break;
                }
                index++;
            }
        }

        if(isJewelExist) {
            int count = userJewels.get(index).getCountUserJewel();

            UserJewels userJewel = new UserJewels(jewel);
            userJewel.setCountUserJewel(count + 1);

            userJewels.set(index, userJewel);

        }else{
            UserJewels userJewel = new UserJewels(jewel);

            userJewels.add(userJewel);
        }
    }





}
