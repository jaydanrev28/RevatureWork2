package com.company;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        System.out.println(isHeteromecic(0));

        System.out.println(isHeteromecic(2));
        System.out.println(isHeteromecic(7));
        System.out.println(isHeteromecic(110));
        System.out.println(isHeteromecic(135));
        System.out.println(isHeteromecic(156));
    }

    static boolean isHeteromecic(int num) {
        double n = num;
        double formula = n + 1;

        if (n != formula)
            return ( n * formula == num );

        else

        return false;
    }
}
