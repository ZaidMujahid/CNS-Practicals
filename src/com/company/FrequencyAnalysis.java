package com.company;

public class FrequencyAnalysis {
    public static void main(String[] args) {
        String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ET = "UZQSOVUOHXMOPVGPOZPEVSGZWSZOPFPESXUDBMETSXAIZVUEPHZHMDZSHZOWSFPAPPDTSUPQUZWYMXVZUHSXEPYEPOPDZSZUFPOMBZWPFUPZHMDJUMTMOHMQ";
        float Prob[] = new float[26];
        System.out.println("Encrypted text: " + ET);
        System.out.println("\nFrequencies I:");
        for (int i = 0; i < Alpha.length(); i++) {
            Prob[i] = 0;
            for (int j = 0; j < ET.length(); j++) {
                if (ET.charAt(j) == Alpha.charAt(i)) {
                    Prob[i]++;
                }
            }
            Prob[i] = Prob[i] / ET.length() * 100;
            System.out.print(Alpha.charAt(i) + ": " + Prob[i] + ", ");
        }
        System.out.println();
        String DT = ET
                .replaceAll("P", "e")
                .replaceAll("Z", "t")
                .replaceAll("S", "a")
                .replaceAll("U", "i")
                .replaceAll("O", "s")
                .replaceAll("H", "c")
                .replaceAll("E", "r");
        System.out.println("\nDecrypted I:" + DT);
        ET = ET
                .replaceAll("P", "")
                .replaceAll("Z", "")
                .replaceAll("S", "")
                .replaceAll("U", "")
                .replaceAll("O", "")
                .replaceAll("H", "")
                .replaceAll("E", "");
        System.out.println("\nFrequencies II:");
        for (int i = 0; i < Alpha.length(); i++) {
            Prob[i] = 0;
            for (int j = 0; j < ET.length(); j++) {
                if (ET.charAt(j) == Alpha.charAt(i)) {
                    Prob[i]++;
                }
            }
            Prob[i] = Prob[i] / ET.length() * 100;
            System.out.print(Alpha.charAt(i) + ": " + Prob[i] + ", ");
        }
        System.out.println();
        DT = DT
                .replaceAll("X", "l")
                .replaceAll("V", "d")
                .replaceAll("M", "o")
                .replaceAll("Q", "w")
                .replaceAll("G", "y")
                .replaceAll("F", "v")
                .replaceAll("W", "h")
                .replaceAll("Y", "p")
                .replaceAll("D", "n")
                .replaceAll("B", "f")
                .replaceAll("T", "m")
                .replaceAll("A", "b")
                .replaceAll("I", "u")
                .replaceAll("J", "g");
        System.out.println("\nDecrypted II:" + DT);
    }
}
