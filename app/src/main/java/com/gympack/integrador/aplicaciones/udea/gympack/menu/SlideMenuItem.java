package com.gympack.integrador.aplicaciones.udea.gympack.menu;

import com.gympack.integrador.aplicaciones.udea.gympack.menu.Resourceble;

/**
 * Created by PINEDA on 21/05/2015.
 */
public class SlideMenuItem implements Resourceble {

    private String name;
    private int imageRes;

    public SlideMenuItem(String name, int imageRes) {
        this.name = name;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}
