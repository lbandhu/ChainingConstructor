package com.lokesh.tutorial;

public class Passenger {

    private int freeBags;

    private int checkedBags;

    public Passenger(){

    }

    public Passenger(int freeBags){
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags){
        this(freeBags); //Chaining constructors - Line 18 will execute line 13 , instead repeating like this e.g this.freeBags = freeBags;
        this.checkedBags = checkedBags;
    }
}
