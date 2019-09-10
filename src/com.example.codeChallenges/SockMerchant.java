// The question https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
package com.example.codeChalenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int solution(int[] ar) {
        int pairs = 0;
        Set<Integer> arSingles = new HashSet();
        for (int i = 0; i < ar.length; i++) {
            if (arSingles.contains(ar[i])) {
                pairs++;
                arSingles.remove(ar[i]);
            }
            else {
                arSingles.add(ar[i]);
            }
        }
/*        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
*//*                System.out.println("ar[i] = " + ar[i] + ", i = " + i + ", ar[j] = " + ar[j] + ", j = " + j);*//*
                if (ar[i] == ar[j] && i != j) {
                    System.out.println("ar[i] = " + ar[i] + ", i = " + i + ", ar[j] = " + ar[j] + ", j = " + j);
                    pairs++;
                    int[] arNew = new int[ar.length-2];
                    int pos = 0;
                    for (int k = 0; k < ar.length; k++) {
                        if (k!=j && k!= i) {
                            System.out.println("k = " + k + ", ar[k] = " + ar[k]);
                            arNew[pos] = ar[k];
                            pos++;
                        }
                    }
                    ar = arNew;
                    i=-1;
                    System.out.print("the new array is: ");
                    for (int x = 0; x < ar.length; x++){ System.out.print(ar[x] + ", ");}
                    System.out.println("i= " + i + " time to break out");
                    break;
                }
            }
            System.out.println("Hey, it's an iteration, i= " + i + ",ar.length = " + ar.length + ", pairs = " + pairs);
        }*/
        return pairs;

    }


    public static void main(String[] args) {
        int ar[] = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
/*        int ar[] = new int[]{4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};*/
        /*int ar[] = new int [] {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};*/
        System.out.println("the array's length is " + ar.length);

        int result = solution(ar);

        System.out.println("The result is " + result);
    }
}


/*
    // My Submission
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if (ar[i] == ar[j] && i != j) {
                    pairs++;
                    int[] arNew = new int[ar.length-2];
                    int pos = 0;
                    for (int k = 1; k < ar.length; k++) {
                        if (k!=j) {
                            arNew[pos] = ar[k];
                            pos++;
                        }
                    }
                    ar = arNew;
                    i=-1;
                    break;
                }
            }
        }
        return pairs;

    }*/
