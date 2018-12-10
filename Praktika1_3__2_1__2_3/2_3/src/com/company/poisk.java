package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class poisk {
   public poisk(Scanner sc,int count,Kvart[] flat){
        ser =sc;
        number=count;
        flats=flat;
    }
    Kvart[] flats;
    int number;
    Scanner ser ;
    int flag=0;
    public void Search(){

        int srch = 0;
        boolean helpme=false;
        while (helpme==false) {
            try {
                srch = ser.nextInt();
                helpme=true;


        if (srch==1) {
            int serch = ser.nextInt();
            for (int i = 0; i < number; i++) {
                if (flats[i].getArea()>serch) {
                    System.out.println(flats[i].toString());
                    flag++;
                }

            }
            if (flag < 1) {
                System.out.println("Нет результатов");
            }
        }
        if (srch==2) {
            int serch = ser.nextInt();
            for (int i = 0; i < number; i++) {
                if (flats[i].getFloor()==serch) {
                    System.out.println(flats[i].toString());
                    flag++;
                }

            }
            if (flag < 1) {
                System.out.println("Нет результатов");
            }
        }
        if (srch==3) {
            int serch = ser.nextInt();
            for (int i = 0; i < number; i++) {
                if (flats[i].getRoomcount()==serch) {
                    System.out.println(flats[i].toString());
                    flag++;
                }

            }
            if (flag < 1) {
                System.out.println("Нет результатов");
            }
        }
        if (srch==4) {
            String serch = ser.next();
            for (int i = 0; i < number; i++) {
                if (flats[i].getBuilding().equals(serch)) {
                    System.out.println(flats[i].toString());
                    flag++;
                }

            }
            if (flag < 1) {
                System.out.println("Нет результатов");
            }
        }
        if (srch==5) {
            int serch = ser.nextInt();
            for (int i = 0; i < number; i++) {
                if (flats[i].getUsetime()==serch) {
                    System.out.println(flats[i].toString());
                    flag++;
                }

            }
            if (flag < 1) {
                System.out.println("Нет результатов");
            }
        }
        if (srch==6) {
            int serch = ser.nextInt();
            for (int i = 0; i < number; i++) {
                if (flats[i].getNumber()==serch) {
                    System.out.println(flats[i].toString());
                    flag++;
                }

            }
            if (flag < 1) {
                System.out.println("Нет результатов");
            }

        }} catch (InputMismatchException e) {
                System.out.println("Bad input try again");
                Scanner re =new Scanner(System.in);
                ser=re;
            }
        }
    }

}
