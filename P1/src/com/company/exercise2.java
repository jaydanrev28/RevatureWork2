package com.company;

import java.util.HashSet;
import java.util.Set;

public class exercise2 {


    public static void main(String[] args) {

            int num =0;
            System.out.println(isHappy(1 )? "Happy" :"Unhappy");
            System.out.println(isHappy(203 )? "Happy" :"Unhappy");
            System.out.println(isHappy(11)? "Happy" :"Unhappy");
            System.out.println(isHappy(107 )? "Happy" :"Unhappy");
            System.out.println(isHappy(180)? "Happy" :"Unhappy");

        }

        static boolean isHappy(int n) {

            Set<Integer> num = new HashSet<Integer>();

            while (num.add(n))
            {
                int value = 0;
                while (n > 0)
                {
                    value += Math.pow(n % 10, 2);
                    n /= 10;
                }
                n = value;
            }

            return n == 1;
        }

    }
