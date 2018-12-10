package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here
        System.out.println("Kravtsov Andrii");
        System.out.println("Input line:");

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();


        int wordCount =0;
        String trim = sentence.trim();
        if (trim.isEmpty())
            wordCount= 0;
        else
        wordCount =trim.split("\\s+").length; // separate string around spaces



        String[] words = sentence.split(" ");
        String shortestword = words[0];
        for (int i = 0; i < wordCount; i++){
            if (words[i].length() < shortestword.length()) {
                shortestword = words[i];

            }
        }
        //System.out.println(shortestword);
        System.out.println("Word list:");

        for(int i=0;i<wordCount;i++){

            if (words[i].length()==shortestword.length()){

                System.out.println(words[i]);
            }
        }



    }
}
