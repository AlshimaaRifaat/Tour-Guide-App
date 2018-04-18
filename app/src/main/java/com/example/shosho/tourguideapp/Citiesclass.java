package com.example.shosho.tourguideapp;

/**
 * Created by shosho on 12/6/2017.
 */

public class Citiesclass {
    private String itemname;
    private String description;
    private int imgid = No_img_provided;
    private static final int No_img_provided = -1;


    public Citiesclass(String itemname, String description, int imgid) {
        this.itemname = itemname;
        this.description = description;
        this.imgid = imgid;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getItemname() {

        return itemname;
    }

    public String getDescription() {
        return description;
    }

    public int getImgid() {
        return imgid;
    }



}
