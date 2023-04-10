package com.example.homepage;

public class Catigaryinfo
{
private String CatogaryType;
private String BakeryItem;

public Catigaryinfo()
{

}
    public Catigaryinfo(String catogaryType, String bakeryItem) {
        CatogaryType = catogaryType;
        BakeryItem = bakeryItem;
    }


    public String getCatogaryType() {
        return CatogaryType;
    }

    public void setCatogaryType(String catogaryType) {
        CatogaryType = catogaryType;
    }

    public String getBakeryItem() {
        return BakeryItem;
    }

    public void setBakeryItem(String bakeryItem) {
        BakeryItem = bakeryItem;
    }
}
