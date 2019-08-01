package by.epam.my_study.task4.accounts;

import by.epam.my_study.task4.jewel.Jewel;
import by.epam.my_study.task4.jewel.JewelsAgrigation;

import java.util.ArrayList;

public class UserJewels {
    private int countUserJewel = 1;
    private Jewel userJewel;

    UserJewels( Jewel userJewel){
        this.userJewel = userJewel;

    }

    public int getCountUserJewel(){
        return countUserJewel;
    }


    public Jewel getUserJewel() {
        return userJewel;
    }

    public void setCountUserJewel(int countUserJewel){
        this.countUserJewel = countUserJewel;
    }
}
