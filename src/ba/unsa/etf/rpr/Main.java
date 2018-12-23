package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String ispisiGradove() {
        ArrayList<Grad> gradovi = GeografijaDAO.getInstance().gradovi();
        String spisak = "";
        for(Grad grad: gradovi) {
            spisak+= grad.getNaziv() + " (" + grad.getDrzava().getNaziv() + ")" + " - " + grad.getBrojStanovnika() + "\n";
        }
        return spisak;
    }

    public static void main(String[] args) {
        System.out.println("Gradovi su:\n" + ispisiGradove());
        glavniGrad();
    }
}
