package com.company.vehicles;

public class SportCar extends Car {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "engine=" + engine +
                ", driver=" + driver +
                ", speed=" + speed +
                '}';
    }
}
