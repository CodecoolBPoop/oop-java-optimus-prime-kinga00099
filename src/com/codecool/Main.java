package com.codecool;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numbersCount = reader.nextInt();

        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[numbersCount+1];
        for(int i=0;i<numbersCount;i++)
            prime[i] = true;

        for(int p = 2; p*p <=numbersCount; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p])
            {
                // Update all multiples of p
                for(int i = p*2; i <= numbersCount; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= numbersCount; i++)
        {
            if(prime[i])
                System.out.print(i + " ");
        }
    }
}
