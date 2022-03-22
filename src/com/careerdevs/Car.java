package com.careerdevs;

public class Car {

    private String make;
    private String model;
    private int year; //int is primitive, Integer is a class type

    //setters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    } //getters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int year() {
        return year;
    }

    //constructor
    Car() {
        System.out.println("Car is a");
        make = "Toyota";
        model = "Corolla";
        year = 2020;
    }
}

