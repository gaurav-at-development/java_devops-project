package org.example;

public class Main {
    public static void main(String[] args){
        System.out.println("fre work on java");
        int a = 1;
        for (int b = 1; b <10 ; b++){
            if (b == 2){
                System.out.println("this is number :" + a);
            }
            else{
                System.out.println("this is not a local version");
            }

        }
        System.out.println("this is in global version");
        while (a < 10){
            if (a <= 5 ){
                System.out.println("you r doing good by:"+ a);
            }
            else{
                System.out.println("this is while loop for begner");
            }
            a++;
        }
        System.out.println("here we RE going to write switch statement"+a);
        switch (a){
            case (9):{
                System.out.println("this is case 9");
            }
            case (10):{
                System.out.println("this is case 1");

            }
        }
        System.out.println("this going to use of break statement");
        for (int c = 1; c <10 ; c++) {
            if (c == 2) {
                continue;

            } else {
                System.out.println("this is not a local version"+c);
            }
        }
        System.out.println("this is nested loop of for");
        for(int i = 1 ; i <10 ; i++){it
            for (int j = 2 ; j<10 ; j++){
                System.out.println(j);
            }
            System.out.println(i);
            System.out.println("***********************");



        }
}