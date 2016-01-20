package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, a1, b, b1, c, x0, x1, x, poch;
        System.out.println("Witaj! Program obliczy dla Ciebie pierwiastek rownania metoda stycznych" +
                " operacja powtarza sie 100 razy dla zapewnienia dużej dokładności.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz przy najwyzszej potedze");
        a = sc.nextDouble();
        System.out.println("Podaj najwyzsza potege");
        a1 = sc.nextDouble();
        System.out.println("Podaj wyraz przy kolejnej potedze");
        b = sc.nextDouble();
        System.out.println("Podaj kolejna potege");
        b1 = sc.nextDouble();
        System.out.println("Podaj wyraz wolny");
        c = sc.nextDouble();
        System.out.println("Podaj spodziewaną wartosc pierwiastka");
        x0 = sc.nextDouble();
        for (int i = 0; i < 100; i++) {
            x = a * Math.pow(x0, a1) + b * Math.pow(x0, b1) + c;
            poch = a * a1 * Math.pow(x0, (a1 - 1)) + b * b1 * Math.pow(x0, (b1 - 1));
            x1 = x0 - x / poch;
            x0 = x1;
            if (i == 99) {
                System.out.println(x1);
            }
        }
        //pierwotnie napisane dla x^3-2*x-5=0 x0=2
    }
}

