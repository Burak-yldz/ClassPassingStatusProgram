package Giris;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int math,physic,turkish,chemical,music;
        int process=0;
        int total=0;
        double average=0;

        System.out.println("Math Point:");
        math=scan.nextInt();
        if (math>=0 && math<=100){
            process++;
            total+=math;
        }
        else{
            System.out.println("invalid value.");
        }
        System.out.println("physics Point:");
        physic=scan.nextInt();
        if (physic>=0 && physic<=100){
            process++;
            total+=physic;
        }
        else{
            System.out.println("invalid value.");
        }
        System.out.println("Turkish Point:");
        turkish=scan.nextInt();
        if (turkish>=0 && turkish<=100){
            process++;
            total+=turkish;
        }
        else{
            System.out.println("invalid value.");
        }
        System.out.println("Chemial Point:");
        chemical=scan.nextInt();
        if (chemical>=0 && chemical<=100){
            process++;
            total+=chemical;
        }
        else{
            System.out.println("invalid value.");
        }
        System.out.println("Music Point :");
        music=scan.nextInt();
        if (music>=0 && music<=100){
            process++;
            total+=music;
        }
        else{
            System.out.println("invalid value.");
        }

        average=total/process;
        System.out.println("Average: "+average);
        if (average>=55){
            System.out.println("CONGRULATIONS , YOU PASSED ");
        }
        else{
            System.out.println("FAIL");
        }



    }
}