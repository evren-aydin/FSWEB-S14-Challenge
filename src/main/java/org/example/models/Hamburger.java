package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice){
        this.addition1Name=additionName;
        this.addition1Price=additionPrice;
    }
    public void addHamburgerAddition2(String additionName, double additionPrice){
        this.addition2Name=additionName;
        this.addition2Price=additionPrice;
    }
    public void addHamburgerAddition3(String additionName, double additionPrice){
        this.addition3Name=additionName;
        this.addition3Price=additionPrice;
    }

    public void itemizeHamburger() {
        double toplam=price+addition1Price+addition2Price+addition3Price;
        String topStr=String.valueOf(toplam);
        System.out.println( "Hamburger{" +
                "Name='" + name + '\'' +
                "Meat='" + meat + '\'' +
                "BreadRollType='" + breadRollType + '\'' +
                "addition1Name='" + addition1Name + '\'' +
                ", addition2Name='" + addition2Name + '\'' +
                ", addition3Name='" + addition3Name + '\'' +
                '}'+"Price : "+ topStr);
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }
}
