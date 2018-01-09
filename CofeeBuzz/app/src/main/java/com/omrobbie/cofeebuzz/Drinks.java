package com.omrobbie.cofeebuzz;

/**
 * Created by omrobbie on 10/01/2018.
 */

public class Drinks {

    public static final Drinks[] drinsk = {
            new Drinks("Latte", "This ini a description for latte", R.drawable.coffee)
    };

    private String name;
    private String desc;
    private int imageId;

    public Drinks(String name, String desc, int imageId) {
        this.name = name;
        this.desc = desc;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
