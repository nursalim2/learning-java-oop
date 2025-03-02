package com.nursalim.application;

import static com.nursalim.data.Constant.*;
import com.nursalim.data.Country;
import com.nursalim.data.StaticBlock;
import com.nursalim.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(10, 20, 30, 40));

        Country.City city = new Country.City();
        city.setName("Indonesia");
        System.out.println(city.getName());

        System.out.println(StaticBlock.PROCCESSOR);

    }
}
