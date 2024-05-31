package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        super.addHamburgerAddition1(additionName, additionPrice);
    }

    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        super.addHamburgerAddition2(additionName, additionPrice);
    }

    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        super.addHamburgerAddition3(additionName, additionPrice);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1Price=price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;
    }

    @Override
    public void itemizeHamburger() {
        double toplam= getAddition1Price()+getAddition2Price()+getAddition3Price()+ healthyExtra1Price+healthyExtra2Price+getPrice();
        String topStr= String.valueOf(toplam);
        System.out.println("HealthyBurger{" +
                "Name='" + getName() + '\'' +
                "Meat='" + getMeat() + '\'' +
                "BreadRollType='" + getBreadRollType() + '\'' +
                "healthyExtra1Name='" + healthyExtra1Name + '\'' +
                ", healthyExtra2Name='" + healthyExtra2Name + '\'' +
                '}'+"Price : "+topStr);
    }


}
