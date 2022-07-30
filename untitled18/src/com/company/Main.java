package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 24, b=31;
        int count = 0;
        int sum = 0;

        for(int i=a; i<b; i++){
            if(i % 3 == 0){
                count ++;
                sum = sum + i;
            }
        }

        System.out.println("yig'indi = " + sum);
        System.out.println("soni = " + count);
    }
}
