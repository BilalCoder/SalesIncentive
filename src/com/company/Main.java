package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int basic = 500;
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales person ID");
        String id = sc.nextLine();
        System.out.println("Enter monthly target achieved");
        float target = sc.nextFloat();
        float total = 0;
        if(target<=10000 && target>=1000){
            total = basic;
        }
        else if(target<=20000 && target>=1000){
            total += (basic + ((target - 10000)*20/100));
        }
        else  if(target<=30000 && target>=1000){
            total += (basic + ((target - 10000)*30/100));
        }
        else if(target<=50000 && target>=1000){
            total += (basic + ((target - 10000)*40/100));
        }
        else {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Total Incentive earned Rs. "+String.format("%.2f", total));

    }
}
