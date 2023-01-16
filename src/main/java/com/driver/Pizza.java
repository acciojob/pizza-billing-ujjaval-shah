package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean extraCheese = false;
    private Boolean extraToppings = false;
    private Boolean takeaway = false;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = this.isVeg ? 300 : 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (! this.extraCheese) this.price += 80;
        this.extraCheese = true;
    }

    public void addExtraToppings(){
        if (! this.extraToppings) this.price += this.isVeg ? 70 : 120;
        this.extraToppings = true;
    }

    public void addTakeaway(){
        if (! this.takeaway) this.price += 20;
        this.takeaway = true;
    }

    public String getBill(){
        this.bill = "Base Price Of The Pizza: " + this.price;
        this.bill += "\n";

        if (this.extraCheese) {
//            this.price += 80;
            this.bill += "Extra Cheese Added: 80";
            this.bill += "\n";
        }

        if (this.extraToppings) {
//            this.price += this.isVeg ? 70 : 120;
            this.bill += "Extra Toppings Added: " + (this.isVeg ? 70 : 120);
            this.bill += "\n";
        }

        if (this.takeaway) {
//            this.price += 20;
            this.bill += "Paperbag Added: 20";
            this.bill += "\n";
        }

        return this.bill + "Total Price: " + this.getPrice() + "\n";
    }
}
