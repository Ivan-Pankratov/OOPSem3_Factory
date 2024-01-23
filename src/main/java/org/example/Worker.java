package org.example;


/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {
    /**
     * Ставка заработной платы
     */
    protected double salary;

    @Override
    public double calculateSalary() {
        return salary;
    }

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f руб.; Возраст: %d",
                surName, name, calculateSalary(), age);
    }
}