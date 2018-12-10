package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Fileworks {
    int n;
    String path;
    String pathout;
    List<String> lines = new LinkedList<String>();

    public  Fileworks(int num, String way, String wayout){
        n=num;
        path=way;
        pathout=wayout;
    }

    public void disp(){

        try {
            FileReader fr = new FileReader(path);
            FileWriter fw = new FileWriter(pathout);
            Scanner scan = new Scanner((fr));
            while(scan.hasNextLine()){
            String tmp = scan.nextLine();
                if (lines.add(tmp) && lines.size() > n)
                    lines.remove(0);
            }
            for(int i=0; i<lines.size();i++){
                String[] words = lines.get(i).split(" ");


                    if(words.length<n ){
                        for (int k=0;k<words.length;k++){
                        fw.write(words[k]);
                        fw.write(" ");


                        }

                    }else {
                        for (int j=n;j>0;j--) {
                            fw.write(words[words.length - j]);
                            fw.write(" ");

                        }
                    }

                fw.write(System.lineSeparator());

            }
            fw.close();
            fr.close();
            FileReader fr2 =new FileReader(pathout);
            Scanner out = new Scanner(fr2);
            while (out.hasNextLine()){
                System.out.println(out.nextLine());
            }

        }catch (FileNotFoundException e){
            System.out.println("файл " + path + " не знайдено");
        }catch (Exception e){
            System.out.println("bruh");

        }



    }
}
