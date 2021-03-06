package com.example.amanda.assignment_4;

import java.io.Serializable;
import android.graphics.drawable.Drawable;

/**
 * Created by Amanda on 2015-04-23.
 */
public class Planet implements Serializable {

    String name;
    Drawable image;
    String info;

    public Planet (String n, Drawable d, String i){
        this.name = n;
        this.image = d;
        this.info = i;
    }

    public Drawable getImage(){
        return image;
    }

    public void setImage(Drawable image){
        this.image=image;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getInfo(){
        return info;
    }
}
