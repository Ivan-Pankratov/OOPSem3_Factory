package org.example;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();
    public static Worker generateWorker() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(19,65);
        return new Worker(names[random.nextInt(names.length)],surnames[random.nextInt(surnames.length)], salary, age);
    }

    public static Freelancer generateFreelancer() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int bet = random.nextInt(1000, 3001);
        int age = random.nextInt(19,65);
        return new Freelancer(names[random.nextInt(names.length)],surnames[random.nextInt(surnames.length)], bet, age);
    }
    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * тип рабочего определяется рандомно
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++){
            int j = random.nextInt(4);
            if (j%2==1) workers[i] = generateWorker();
            else workers[i] = generateFreelancer();
        }
        return workers;
    }

}