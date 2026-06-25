package bagian2.arraylist;

import java.util.ArrayList;

public class Soal3 {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Agus");
        nama.add("Citra");
        nama.add("Ayu");
        nama.add("Deni");

        System.out.println("Nama diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}