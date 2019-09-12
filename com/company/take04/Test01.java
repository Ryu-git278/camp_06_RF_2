package com.company.take04;

import java.util.ArrayList;

public class Test01 {
    public static void main(String args[]){
        ArrayList<String> array = new ArrayList<String>();

        array.add("日本");
        array.add("ブラジル");
        array.add("イングランド");
        array.add("ポルトガル");
        array.add("フランス");

        String country = array.get(2);
        System.out.println(country);
    }
}
