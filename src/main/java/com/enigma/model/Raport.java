package com.enigma.model;

import com.enigma.utils.Validation;

public class Raport {
    private double bIndonesia;
    private double bInggris;
    private double matematika;
    private double IPA;

    public double getbIndonesia() {
        return bIndonesia;
    }

    public void setbIndonesia(double bIndonesia) {
        this.bIndonesia = Validation.score(bIndonesia);
    }

    public double getbInggris() {
        return bInggris;
    }

    public void setbInggris(double bInggris) {
        this.bInggris = Validation.score(bInggris);
    }

    public double getMatematika() {
        return matematika;
    }

    public void setMatematika(double matematika) {
        this.matematika = Validation.score(matematika);
    }

    public double getIPA() {
        return IPA;
    }

    public void setIPA(double IPA) {
        this.IPA = Validation.score(IPA);
    }

    public double getGPA() {
        return (this.bIndonesia + this.IPA + this.bInggris + this.matematika) / 4;
    }
}
