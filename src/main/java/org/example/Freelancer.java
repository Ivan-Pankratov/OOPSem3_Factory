package org.example;

/**
 * Фрилансер (работник с почасовой оплатой)
 * Фрилансеру определена почасовая ставка.
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    private  int bet;
    /**
     * Ставка заработной платы
     */
    protected double salary;

    public Freelancer(String name, String surName, int bet,int age ) {
        super(name, surName, age);
        this.salary = 20.8 * 8 * bet;
    }




    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f руб.; Возраст: %d",
                surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
