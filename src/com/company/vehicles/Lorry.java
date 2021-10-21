package com.company.vehicles;

public class Lorry extends Car {
    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "engine=" + engine +
                ", driver=" + driver +
                ", carrying=" + carrying +
                '}';
    }
}
