package com.company;

import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomNum = ThreadLocalRandom.current().nextInt(100000, 999999 + 1);
        System.out.println(randomNum);
        Stack<Integer> st = new Stack<>();
        while (randomNum !=0){
            st.push(randomNum % 10);
            randomNum = randomNum / 10;
        }
        int numb=0;
        for (int i=1; i<1000000;){
            numb+=i*st.pop();
            i=i*10;
        }
        System.out.println(numb);

    }
}
