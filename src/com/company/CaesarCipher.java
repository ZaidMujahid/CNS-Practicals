package com.company;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        String text;
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to encrypt:");
        text = sc.nextLine();
        System.out.println("Enter key for encrypt:");
        key = sc.nextInt();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz 0123456789@#$%^&*!";

        String enc = "";
        for(int i=0; i< text.length(); i++) {
            enc += alphabet.charAt((alphabet.indexOf(text.charAt(i)) + key) % alphabet.length());
        }
        System.out.println("Encrypted string is: " + enc);

        String dec = "";
        for(int i=0; i<enc.length(); i++){
            int index = alphabet.indexOf(enc.charAt(i)) - key;
            if(index < 0){
                dec += alphabet.charAt(alphabet.length() + index);
            }else{
                dec += alphabet.charAt(index);
            }
        }
        System.out.println("Decrypted string is: " + dec);

    }
}
