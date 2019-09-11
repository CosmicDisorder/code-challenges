// https://www.hackerrank.com/challenges/flipping-bits/problem


import java.io.IOException;

public class flippingBits {

    static long flippingBits(int n) {
        long j = 1010;
        String workDamnit = String.valueOf(n);
        //System.out.println(j + " converted is " + Long.toBinaryString(j) + " type is " + ((Object)j).getClass().getName());
        j = Long.parseLong(workDamnit);
        System.out.println("Number = " + j + ", variable type " + ((Object)j).getClass().getName());
        String flipMe = Long.toBinaryString(j);
        System.out.println("Binary (flipMe) is " + flipMe);
        //System.out.println("n is " + n + ", flipMe is " + flipMe + "\nLength of flipMe is " + flipMe.length());
        for(int i = flipMe.length(); i<32; i++){
            flipMe = "0" + flipMe;
            //System.out.println("Length of flipMe is " + flipMe.length());
        }
        System.out.println("32 digit long binary (flipMe) is " + flipMe);
        String flippedMe = "";
        for(int i = 0; i<32; i++){
            if (flipMe.charAt(i)=='0') { flippedMe += 1;}
            else flippedMe +=0;
            //System.out.println("Length of flippedMe is " + flippedMe.length());
        }
        System.out.println("32 digit long binary (flippedMe) is " + flippedMe);
        return Long.parseLong(flippedMe, 2);

    }

    public static void main(String[] args) throws IOException {
        int i = 3;
        int j = 2147483647;
        int k = 1;
        int l = 0;
        System.out.println(flippingBits(i));
        System.out.println(flippingBits(j));
        System.out.println(flippingBits(k));
        System.out.println(flippingBits(l));
    }
}



/*
// Correct Submission
static long flippingBits(long n) {
    String flipMe = Long.toBinaryString(n);
    for(int i = flipMe.length(); i<32; i++){
        flipMe = "0" + flipMe;
    }
    String flippedMe = "";
    for(int i = 0; i<32; i++){
        if (flipMe.charAt(i)=='0') { flippedMe += 1;}
        else flippedMe +=0;
    }
    return Long.parseLong(flippedMe, 2);
}*/
