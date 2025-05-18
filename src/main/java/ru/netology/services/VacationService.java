package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int vacationCount = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // отдыхаем
                money -= expenses;
                money = money / 3;
                vacationCount++;
            } else {
                // работаем
                money += income;
                money -= expenses;
            }
        }

        return vacationCount;
    }
}

