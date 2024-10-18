package com.example.app;

import java.util.HashMap;
import java.util.Map;

public class HelloController {
    //Расчет по функции
    public Map<Double, Double> func(double a1, double b1, double a2, double b2, double a3, double b3, double xn, double xk, double dx) {
        double y = 0;
        Map<Double, Double> result = new HashMap<>();

        for (;xn <= xk ; xn += dx) {
            y = a1 * Math.sin(b1 * xn) + a2 * Math.sin(b2 * xn) + a3 * Math.sin(b3 * xn);
            result.put(xn,y);
        }

        return result;
    }

    //Функция для вывода значений в консоль
    public void printTable(Map<Double, Double> result) {
        System.out.println("-------------------------");
        System.out.println(" x                   y ");
        for (Map.Entry<Double, Double> entry : result.entrySet()) {
            System.out.printf("|%5.2f      |      %5.2f|\n" , entry.getKey(), entry.getValue());
            System.out.println("-------------------------");
        }
    }
}