package com.company;

public class Itemgrocery {


    private String item;
    private double price;
    private int quantity;
    private double cost;


    public Itemgrocery() {
    }


    public Itemgrocery(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public double getCost(){
        double Cost = (price*quantity);

        return Cost;
    }


    }




