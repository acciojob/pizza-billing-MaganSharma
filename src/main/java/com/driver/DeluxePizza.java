package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(che==0){
            addExtraCheese();
            addExtraToppings();
            che=1;
        }


    }
}
