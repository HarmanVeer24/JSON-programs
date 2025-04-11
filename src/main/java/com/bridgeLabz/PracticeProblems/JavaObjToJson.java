package com.bridgeLabz.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
}

public class JavaObjToJson {
    public static void main(String[] args) throws Exception{
            Car car = new Car("Toyota", "Camry", 2022);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(car);
            System.out.println("com.bridgeLabz.PracticeProblems.Car in JSON format:\n" + json);

    }
}
