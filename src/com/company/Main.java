package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        quad_eq(a, b, c);
    }

    static void quad_eq(double a, double b, double c) {
        double addDelta;
        double minusDelta;
        double delta = sqrt(pow(b, 2) - (4 * a * c));
        if (delta > 0) {
            addDelta = (-b + delta) / (2 * a);
            minusDelta = (-b - delta) / (2 * a);
            System.out.println("Wynik x z dodawania " + addDelta);
            System.out.println("Wynik x z odejmowania " + minusDelta);
        } else if (delta == 0) {
            addDelta = -b / (2 * a);
            System.out.println("Wynik x z odejmowania " + addDelta);
        } else {
            System.out.println("Brak rozwiazan");
        }
    }
}
