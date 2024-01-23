package org.example;

/**
 * Рабочий (базовый тип)
 */
public abstract class Employee implements Comparable<Employee> {

    //region Публичные методы
//implements Comparable<Employee>

    @Override
    public int compareTo(Employee o) {

        int res = surName.compareTo(o.surName);
        if (res == 0){
            return name.compareTo(o.name);
        }
        return res;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    //endregion

    //region Конструкторы

    public Employee(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    //endregion

    //region Поля

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;



    /**
     * Возраст
     */
    protected int age;

    //endregion

}
