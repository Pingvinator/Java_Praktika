package com.company;

import java.util.Scanner;

public class UserInteraction {
    Scanner scanner = new Scanner(System.in);
    public UserInteraction(){
        System.out.println("N=   ?");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("У якому файлі шукати ?");
        String fileToRead = scanner.nextLine();
        System.out.println("До якого файлу записати результат ?");
        String fileToWrite = scanner.nextLine();

        Fileworks process = new Fileworks(n,fileToRead,fileToWrite);
        process.disp();
    }
}
