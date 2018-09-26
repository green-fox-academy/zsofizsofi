package com.greenfoxacademy.demo.models;

import java.util.List;

public class Fox {
    private String name;
    //private List tricks;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = "Fox";
        //this.tricks = tricks;
        this.food = "pizza";
        this.drink = "lemonade";
    }

    public String getName() {
        return name;
    }

//    public List getTricks() {
//        return tricks;
//    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setTricks(List tricks) {
//        this.tricks = tricks;
//    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}


//    create a Fox.class
//it should represent a virtual fox
//                it should have at least the followings: name, list of tricks, food and drink
//        consider using more classes or enums
//        add a new Fox (created with the received name) to a list of Foxes
//        find the actual fox based on the name and send it to the template model
//        use Thymeleaf to replace the data
//        if the fox does not know any tricks yet, display a message instead of an empty list
//        if the fox's name is Mr. Green, eats salad, drinks water and knows 0 trick, the updated information view should represent that