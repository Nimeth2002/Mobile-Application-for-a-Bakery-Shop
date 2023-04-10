package com.example.homepage;

public class CupcakeInfo
{
    private String Make;
    private String Model;
    private String Icing;
    public CupcakeInfo()
    {

    }
    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getIcing() {
        return Icing;
    }

    public void setIcing(String icing) {
        Icing = icing;
    }

    public String getDecoration() {
        return Decoration;
    }

    public void setDecoration(String decoration) {
        Decoration = decoration;
    }

    private String Decoration;
}
