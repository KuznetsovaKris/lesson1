package ru.geekbrains.kuznetsova.lesson1;

public class MainApp {
    public static void main(String[] args) {
        byte k1 = 102;
        short k2 = -25648;
        int k3 = 287461;
        long k4 = -4555678L;
        float k5 = 14.57f;
        double k6 = -13.782;
        char k7 = 'm';
        boolean k8 = false;
    }

        static double task3 ( int a, int b, int c, int d) {
            if (d == 0) {
                System.out.println("Нельзя делить на ноль");
            }
                return a * (b + (c / d));
        }



        static boolean task4 (int a, int b) {
            int c = (a + b);
            boolean t = true;
            boolean f = false;
            if (c < 10 && c > 20) {
                System.out.println(f);
            }
                return t;
        }

        static void task5 (int a) {
           if (a >= 0) {
               System.out.println("Вы ввели положительное число");
           } else {
               System.out.println("Вы ввели отрицательное число");
           }
        }

        static boolean task6 (int a) {
            boolean t = true;
            boolean f = false;
            if (a >= 0) {
                System.out.println(f);
            }
            return t;
        }

        static void task7(String name) {
            System.out.println("Привет, " + name);
        }

        static void task8(int year ) {
            if (year %400 == 0) {
                System.out.println("Год является високосным");
            } else if(year %100 == 0) {
                System.out.println("Год не является високосным");
            } else if (year %4 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        }

    }
