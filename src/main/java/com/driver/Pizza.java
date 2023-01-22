package com.driver;

public class Pizza {
    int che=0;
int paper =0;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            price=300;
            bill="Base Price Of The Pizza: 300\n";
        }else{
            price=400;
            bill="Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (che==0){
            bill+="Extra Cheese Added: 80\n";
            price+=80;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true &&che==0){
            bill+="Extra Toppings Added: 70\n";
            price+=70;
        }else if(che==0){
            bill+="Extra Toppings Added: 120\n";
            price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(paper==0){
            bill+="Paperbag Added: 20\n";
            price+=20;
            paper=1;
        }

    }

    public String getBill(){
        // your code goes here
        bill+="Total Price:"+price+"\n";
        return this.bill;
    }
}
