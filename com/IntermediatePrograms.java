package com;

import java.util.Arrays;
import java.util.Scanner;

public class IntermediatePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        String str = "hello";

//        int n = sc.nextInt();
//        int r = sc.nextInt();

//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();

//        factorialOfANum(num);
//        averageOfNNums(num);
//        distanceBetweenTwoPoints(num1,num2);
//        armstrongNumber(num);
//        nCr(n, r);
//        nPr(n,r);
//        reverseAString(str);
//        palindromeNum(num);
//        hcfLcm(a,b);
//        perfectNum(num);
    }

//    private static void perfectNum(int num) {
//        int sum = 0;
//        for (int i = 1; i < num; i++) {
//            if(num % i == 0){
//                sum += i;
//            }
//        }
//        if(sum == num){
//            System.out.println("Yes, it is a Perfect Number");
//        }else{
//            System.out.println("No, it's not a Perfect Number");
//        }
//    }

//    private static void hcfLcm(int a, int b) {
//        int hcf= 0, lcm = 0;
//        for(int i = 1,j = 1; i < a && j < b; i++, j++){
//            if((a % i == 0) && (b % j == 0)){
//                hcf = i;
//            }
//        }
//        lcm = (a * b) / hcf;
//        System.out.println(hcf + " " + lcm);
//    }

//    private static void palindromeNum(int num) {
//        int temp = num;
//        int rev = 0;
//        while(temp > 0){
//            int rem = temp % 10;
//            rev = rev * 10 + rem;
//            temp /= 10;
//        }
//        if(rev == num){
//            System.out.println("Yes, it is a Palindrome Number");
//        }else{
//            System.out.println("No, it's not a Palindrome Number");
//        }
//    }

//    private static void reverseAString(String str) {
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i) + " ");
//        }
//    }

//    private static void nPr(int n, int r) {
//        float nPr = 0;
//        nPr = factorialOfANum(n)/factorialOfANum(n-r);
//        System.out.println(nPr);
//    }

//    private static void nCr(int n, int r) {
//        float nCr = 0;
//        nCr = factorialOfANum(n)/(factorialOfANum(r)*factorialOfANum(n-r));
//        System.out.println(nCr);
//    }

//    private static void armstrongNumber(int num) {
//        int count = (int) Math.log10(num) + 1;
//        int res = 0;
//        int temp = num;
//        while(temp > 0){
//            int rem = temp % 10;
//            res += Math.pow(rem,count);
//            temp /= 10;
//        }
//        if(res == num){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not an Armstrong Number");
//        }
//    }

//    private static void distanceBetweenTwoPoints(int num1, int num2) {
//        float dis = 0;
//        dis = num1*num1 + num2*num2;
//        System.out.println(Math.sqrt(dis));
//    }

//    private static void averageOfNNums(int num) {
//        float avg = 0;
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            sum += i;
//        }
//        avg = (float) (sum / num);
//        System.out.println(avg);
//    }

//    private static int factorialOfANum(int num) {
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }
}
