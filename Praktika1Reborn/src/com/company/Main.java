package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Kravtsov Andrii");
        int sz =0;
        System.out.println("array size:");
        Scanner sc = new Scanner(System.in);
        sz = sc.nextInt();
        // System.out.printf("size: %d", size);
        long array[][] = new long[sz][sz];
        System.out.println("unsorted:");
        for (int i=0;i<sz;i++){
            for (int j=0; j<sz;j++){

                array[i][j]=((long) (Math.random() * 10));
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int row = 0;
        System.out.println("sort by row:");
        sc = new Scanner(System.in);
        row = sc.nextInt();

        for(int i=0;i<sz-1;i++)
        {
            for (int j=0;j<sz-1;j++){
                if(array[row][j]>array[row][j+1]){



                    for(int f=0;f<sz;f++){

                        long temp=array[f][j+1];
                        array[f][j+1]=array[f][j];
                        array[f][j]=temp;
                    }
                }
            }


        }

        for (int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
