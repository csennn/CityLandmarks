package com.ren.citylandmarks;

import java.io.Serializable;

public class Landmark implements Serializable {
    String name;
    String city;
    int image;

    //constructor (the first method called when creating an object from the class)

    public Landmark(String name, String city, int image){
        this.name = name;
        this.city = city;
        this.image = image;
    }

}
