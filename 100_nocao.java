package com.company;

import java.util.Scanner;

public class Main {
    public static double markOne(){

        Scanner read = new Scanner(System.in);
        double p=0,area = 0;
        double array[] = new double[2];
        System.out.println("Enter the measures of triangle X : ");
        for(int i = 0; i<3; i++){
            array[i] = read.nextDouble();
            p = p + array[i];
        }
        System.out.println("Enter the measures of triangle Y : ");
        for(int i = 0; i<3; i++){
            array[i] = read.nextDouble();
            area = ((p*p)-(p*array[0])) * ((p*p)-(p*array[1])) * ((p*p)-(p*array[2]));
        }
        p = p/2;
        Math.sqrt(area);
        return p;
    }
    public static double markTwo(){
        Scanner read = new Scanner(System.in);
        double p=0,area = 0;
        double array[] = new double[2];

        for(int i = 0; i<3; i++){
            array[i] = read.nextDouble();
            area = ((p*p)-(p*array[0])) * ((p*p)-(p*array[1])) * ((p*p)-(p*array[2]));
        }

        Math.sqrt(area);
        return area;
    }
    public static void main(String[] args) {
        Main classe = new Main();
        double p = markOne();
        double area = markTwo();
        System.out.print("p :: "+ p);
        System.out.print("area :: "+ area);
    }
}
