package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] workers = EmployeeFabric.generateEmployees(15);

        System.out.println("***");
        System.out.println("Сортировка по алфавиту");
        Arrays.sort(workers);

        for (Employee worker : workers) {
            System.out.println(worker);
        }

        Arrays.sort(workers, new SalaryComparator());
        System.out.println("***");
        System.out.println("Сортировка по зарплате");

        for (Employee elem : workers) {
            System.out.println(elem);
        }

        Arrays.sort(workers, new AgeCompartor());
        System.out.println("***");
        System.out.println("Сортировка по возрасту");

        for (Employee elem : workers) {
            System.out.println(elem);
        }







    }
}