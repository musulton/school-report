package com.enigma.utils;

/*
Berisi fungsi utilitas untuk membantu operasi logika di banyak tempat
 */
public class Validation {
    public static double score(double score) {
        if (score > 100) {
            System.out.println("Score tidak valid");
            return 0;
        }

        return score;
    }
}
