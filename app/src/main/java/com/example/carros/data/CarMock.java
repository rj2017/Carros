package com.example.carros.data;

import com.example.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    private List<Car> mlistCars;

    public CarMock(){
        this.mlistCars = new ArrayList<>();
        for (int i = 0; i <= 100; i++ ){
            this.mlistCars.add(new Car(i, String.valueOf(i),i*10, Double.valueOf(i*100)));
        }
    }

    public List<Car> getList(){
        return this.mlistCars;
    }

    public Car get(int id){
        return this.mlistCars.get(id);
    }
}
