package com.company;

public class LCM {
    public static long lcm_array(int[] number_array)
    {
        long lcm= 1;
        int divisor = 2;

        while (true) {
            int counter = 0;
            boolean divisible = false;

            for (int i = 0; i < number_array.length; i++) {



                if (number_array[i] == 0) {
                    return 0;
                }
                else if (number_array[i] < 0) {
                    number_array[i] = number_array[i] * (-1);
                }
                if (number_array[i] == 1) {
                    counter++;
                }


                if (number_array[i] % divisor == 0) {
                    divisible = true;
                    number_array[i] = number_array[i] / divisor;
                }
            }


            if (divisible) {
                lcm = lcm * divisor;
            }
            else {
                divisor++;
            }

            if (counter == number_array.length) {
                return lcm;
            }
        }
    }


    public static void main(String[] args)
    {
        int[] number_array = { 2, 5, 311, 10, 40, 37 };
        System.out.println(lcm_array(number_array));
        int[] number_array2 = { 29, 54, 321, 50, 70, 77 };
        System.out.println(lcm_array(number_array2));
    }
}
