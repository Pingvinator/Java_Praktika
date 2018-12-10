package com.company;

import java.util.Scanner;


import org.apache.log4j.Logger;

public class Main {

    public static void main(String[] args) {
        // write your code here
         Logger log = Logger.getLogger(Main.class);
        log.info("Program start");
        System.out.println("Kravtsov Andrii");
        System.out.println("Number of flats:");
        int numb=0;
        boolean ctr=false;
        while (ctr==false) {
            try {


                Scanner ln = new Scanner(System.in);

                numb = ln.nextInt();
                if (numb < 0) {
                    log.error("less then 0");
                    throw new IllegalArgumentException("Can't be less then 0");

                }
                ctr=true;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }catch (java.util.InputMismatchException e){
                log.error("NaN");
                System.out.println("only numbers");
            }
        }
        Kvart[] flats = new Kvart[numb];

        if(numb==0) {
            log.info("Default values");
            numb =8;
            Kvart[] flat = new Kvart[numb];
            flat[0] = new Kvart(1, 45, 5, 2, "Сарай", 20);
            flat[1] = new Kvart(2, 45, 6, 3, "Башня", 24);
            flat[2] = new Kvart(3, 23, 1, 1, "Сарай", 5);
            flat[3] = new Kvart(4, 54, 7, 3, "дом", 12);
            flat[4] = new Kvart(5, 12, 1, 1, "Шалаш", 1);
            flat[5] = new Kvart(6, 130, 5, 3, "Небоскреб", 30);
            flat[6] = new Kvart(7, 45, 17, 2, "Небоскреб", 20);
            flat[7] = new Kvart(8, 123, 1, 4, "дом", 20);
            flats=flat;
        }else{
         System.out.println("Input flat info номер площадь Этаж кол-во комнат строение эксплуатация:");
            log.info("Manual values");
         ctr=false;
         while (ctr==false){
         try{
             Kvart[] flat = new Kvart[numb];
        for(int i=0;i<numb;i++){

            Scanner sent = new Scanner(System.in);
            String sentence = sent.nextLine();
            String[] words = sentence.split(" ");
            if(words.length!=6){
                log.error("Bad parameter format");
                throw new IllegalArgumentException("Ровно 6 параметров");
            }
            if(words[0].matches("[a-zA-Z]+") || words[1].matches("[a-zA-Z]+")||words[2].matches("[a-zA-Z]+")||words[3].matches("[a-zA-Z]+")||words[5].matches("[a-zA-Z]+")){
                log.error("Bad format");
                throw new BadFormatException("Bad format");
            }

            flat[i] = new Kvart(Integer.parseInt(words[0]),Integer.parseInt(words[1]),Integer.parseInt(words[2]),Integer.parseInt(words[3]),words[4],Integer.parseInt(words[5]));}
            flats=flat;

        ctr=true;
         }catch (IllegalArgumentException e){
             System.out.println(e.getMessage());
         }catch (BadFormatException e){
             log.error("Bad format");
             System.out.println("Bad format");
         }}}

             for(int i=0;i<numb;i++){
                 System.out.println(flats[i].toString());}



        System.out.println("Поиск по: 1. площади");
        System.out.println("2. этажу");
        System.out.println("3. кол-ву комнат");
        System.out.println("4. строению");
        System.out.println("5. эксплуатации");
        System.out.println("6. номеру");

        Scanner ser = new Scanner(System.in);
        poisk poi = new poisk(ser,numb,flats);
        poi.Search();
        log.info("Done");

    }
}
