package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    //////////////////////////////////////

        int A;
        A = (int)Math.round((Math.random() * 12) * (Math.random() * 43));
double B, C;
        B = Math.round((Math.random() * 23) * (Math.random() * 43));
        C = Math.round((Math.random() * 12) * (Math.random() * 6));

        System.out.println("Число А = " + A);
        System.out.println("Число B = " + B);
        System.out.println("Число C = " + C + "\n");
    //////////////////////////////////////

    ////////////////№1//////////////////////

       if(A%2==0){
           System.out.println("Число " + A + " является четным." + "\n");
       }
       else {
           System.out.println("Число " + A + " не является четным." + "\n");
       }

    ////////////////№2//////////////////////

        if(A%3 == 0){
            System.out.println("Число " + A + " делится на три без остатка." + "\n");
        }
        if(A%5 == 0){
            System.out.println("Число " + A + " делится на пять без остатка." + "\n");
        }
        if(A%7 == 0){
            System.out.println("Число " + A + " делится на семь без остатка." + "\n");
        }
        ////////////////№3//////////////////////

        if(B == 0 || C == 0){
            System.out.println("Операция нахождения частного невозможна" + "\n");
        }
        else{
            double res;
           res = B / C;
            System.out.println("Операция нахождения частного = " + res +"\n");
        }
        ////////////////№4//////////////////////
        System.out.println("Крутой? В каком году была основанна Одесса?\uD83D\uDE0E Ответы писать ниже ↓" + "\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Год основания Одессы: ");
        A = in.nextInt();
        if(A == 1794){
            System.out.println("А ты крутой, реально шаришь \uD83E\uDD13");
        }
        else{
            System.out.println("Подводишь паренек, Одесса была основана в другом году. \uD83E\uDD28");
        }

        ////////////////№5//////////////////////
        System.out.print("Введи любой год, для проверки на высокосность: ");
        A = in.nextInt();

        if ((A%4==0) && A % 100 !=0) {
            System.out.println(A + " - высокосный год.");
        }
        if ((A % 4==0) && (A % 100==0)&&(A % 400==0)) {

        System.out.println(A + " - высокосный год.");
    }
    else {
        System.out.println(A + " - не высокосный год.");
    }

    ////////////////№6//////////////////////
        System.out.print("Введите цену за ваш товарчик: ");
        B = in.nextInt();

        if (B >= 500 && B < 1000){
            B = B - (B * 0.03);
            System.out.print("Скидка в 3%: " + B + "\n");
        }
        else {
            if (B >= 1000) {
                B = B - (B * 0.05);
                System.out.print("Скидка в 5%: " + B + "\n");
            }
        }

        ////////////////№7//////////////////////

        int time, day;
        double schet;
        System.out.print("Введите день разговора 1-7: ");
        day = in.nextInt();
        System.out.print("Введите врмея разговора в минутах: ");
        time = in.nextInt();

        if(day == 6 || day == 7){
            schet = (time * 0.7) - ((time * 0.7) * 0.2);
            System.out.print("Вы наговорили вот столько гривен: " + schet + "\n");
        }else {
            schet = time * 0.7;
            System.out.print("Вы наговорили вот столько гривен: " + schet + "\n");
        }

        ////////////////№8//////////////////////
        int thz = 561;

        int frst = thz / 10;
        frst = frst / 10;
        int scnd = thz / 10;
        scnd = scnd % 10;
        int thrd = thz % 10;

        if(frst > thrd){System.out.print("Первая цифра числа " + thz + " больше последней." + "\n");}
        else{System.out.print("Последняя цифра числа " + thz + " больше первой." + "\n");}

        if(frst > scnd){System.out.print("Первая цифра числа " + thz + " больше второй." + "\n");}
        else{System.out.print("Вторая цифра числа " + thz + " больше первой." + "\n");}

        if(scnd > thrd){System.out.print("Вторая цифра числа " + thz + " больше последней." + "\n");}
        else{System.out.print("Последняя цифра числа " + thz + " больше второй." + "\n");}

        ////////////////№9//////////////////////

        // 🚧Under construction🚧

        ////////////////№10//////////////////////
        double x, y, res;
        x = 2.0;
        y = 3.0;

        res = x > y ? x+y/2 : (x*y)*2  ;
        System.out.println("Ответик при x > y = " + res + "\n");

        res = x < y ? x+y/2 : (x*y)*2 ;
        System.out.println("Ответик при x < y = " + res + "\n");

    }
}
