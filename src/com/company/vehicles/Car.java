package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

/*
Автомобили. Создать класс Car в пакете vehicles , Engine в пакете details и Driver в пакете professions.
Класс Driver содержит поля - ФИО, стаж вождения.
Класс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо"
или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
Пусть класс Driver расширяет класс Person.
 */
public class Car {
    private double weight;
    private String carClass;
    private String brand;
    Engine engine = new Engine();
    Driver driver = new Driver();

    public static void start() {
        System.out.println("Поехали");
    }

    public static void stop() {
        System.out.println("Останавливаемся");
    }

    public static void turnRight() {
        System.out.println("Поворот направо");
    }

    public static void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
