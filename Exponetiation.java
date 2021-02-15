package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        start();
        System.out.print("A number --->");
        Scanner num = new Scanner(System.in);
        int enter = num.nextInt();
        System.out.print("A rate --->");
        Scanner num2 = new Scanner(System.in);
        int enter2 = num2.nextInt();
        body( enter2,enter);


	}
	public static void start(){
        System.out.println("This code can exponents a number ");
    }
	public  static void ans(){
        System.out.println("Repeat the session?(Y/N)");
        Scanner str = new Scanner(System.in);
        String ank = str.nextLine();
        switch (ank){
            case "Y":
                start();
                break;
            case "N":
                System.out.println("Bye");
                break;
            default:
                System.out.println("Repeat Y or N");
                ans();

        }
    }


    public static void body(int enter2, int enter) {

        if(enter>0 && enter2>0){
            int res=1;
            for (int i = 1; i <= enter2; i++) {
                res = res * enter;
            }

            System.out.println("The answer is -->"+res);
            ans();

        }

        if( enter >0 && enter2<0 ){

            int res=1;
            enter2= Math.abs(enter2);
            for (int i = 1; i <= enter2; i++) {
                res = res * enter;
            }
            System.out.println("The answer is -->"+"1/"+res);
            ans();

        }
        if(enter<0 && enter2>0){
            int check = enter2%2;
            if(check==0){
                int res=1;
                enter2= Math.abs(enter2);
                for (int i = 1; i <= enter2; i++) {
                    res = res * enter;
                }
                System.out.println("The answer is -->"+res);
                ans();

            }else {

                int res=1;
                enter2= Math.abs(enter2);
                for (int i = 1; i <= enter2; i++) {
                    res = res * enter;
                }
                System.out.println("The answer is -->"+res);
                ans();

            }

        }
        if(enter<0 && enter2<0){

            int check = enter2%2;
            if(check==0){
                int res=1;
                enter2= Math.abs(enter2);
                for (int i = 1; i <= enter2; i++) {
                    res = res * enter;
                }
                System.out.println("The answer is -->"+"1/"+res);
                ans();

            }else {

                int res=1;
                enter2= Math.abs(enter2);
                for (int i = 1; i <= enter2; i++) {
                    res = res * enter;
                }
                System.out.println("The answer is -->"+"-1/"+(-1*res));
                ans();

            }



        }
        if(enter2==0) {
            System.out.println("The answer is -->"+1);
            ans();


        }


    }

}
// A little bit easier code
  /*    int res=1;
        Scanner num = new Scanner(System.in);
        int enter = num.nextInt();

        Scanner num2 = new Scanner(System.in);
        int enter2 = num2.nextInt();


        if(enter2>0){

            for (int i = 1; i <= enter2; i++) {
                res = res * enter;
            }
            System.out.print(res);

        }

        if(enter2<0){


            enter2= Math.abs(enter2);
            for (int i = 1; i <= enter2; i++) {
                res = res * enter;
            }
            System.out.print("1/"+res);



        }if(enter2==0) {
            System.out.print(1);


        }*/