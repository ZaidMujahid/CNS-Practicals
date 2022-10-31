package com.company;
import java.util.Scanner;

public class Playfair {
    public static void main(String[] args) {
        char[][] matrix = new char[5][5];
        String[] textarr;
        String alpha = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        String key;
        String data = "";
        String text;
        String encrypted = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Key for Encryption: ");
        key = s.nextLine().toUpperCase().replaceAll("J", "I") + alpha;
        for (int i = 0; i < key.length(); i++) {
            if (!data.contains("" + key.charAt(i))) {
                data += key.charAt(i);
            }
        }
        System.out.println("\n5 X 5 Matrix\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int index = i * 5 + j;
                matrix[i][j] = data.charAt(index);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\nEnter Plain Text for Encryption: ");
        text = s.nextLine().toUpperCase().replaceAll("J", "I");
        textarr = new String[text.length()];
        System.out.print("Diagraph of Plain Text: ");
        for (int i = 0; text.length() > 0 && i < textarr.length; i++) {
            if (text.length() == 1) {
                textarr[i] = text.substring(0, 1) + "X";
                text = "";
            }
            if(text.length() > 1) {
                if (text.substring(0, 1).equals(text.substring(1, 2))) {
                    textarr[i] = text.substring(0, 1) + "X";
                    text = text.substring(1, text.length());
                } else {
                    textarr[i] = text.substring(0, 1) + text.substring(1, 2);
                    text = text.substring(2, text.length());
                }
            }
            System.out.print(textarr[i] + " ");
        }
        System.out.println();
        for (int i = 0; !(textarr[i] == null); i++) {
            int index1 = data.indexOf(textarr[i].charAt(0));
            int index2 = data.indexOf(textarr[i].charAt(1));
            int a = index1 / 5;
            int b = index1 % 5;
            int c = index2 / 5;
            int d = index2 % 5;
            if (a == c) {
                encrypted += matrix[a][(b + 1) % 5] + "" + matrix[c][(d + 1) % 5];
            } else if (b == d) {
                encrypted += matrix[(a + 1) % 5][b] + "" + matrix[(c + 1) % 5][d];
            } else {
                encrypted += matrix[a][d] + "" + matrix[c][b];
            }
        }
        System.out.println("Encrypted Text is: " + encrypted);
    }

}
