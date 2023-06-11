package Tugas_1;

import java.util.ArrayList;
import java.util.List;

public class Hewan<T> {
    ArrayList<String> namaHewan = new ArrayList<>(
            List.of("Angsa","Bebek","Cicak","Domba","Elang","Gajah"));

    public static void main(String[] args) {
        Hewan<String> hewan = new Hewan<>();

        System.out.println("=== Tahap 1 ===");
        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 2 Tambahkan elemen lagi “Badak” dan ”Bebek”, hitung jumlah elemen “Bebek” dan
        //tampilkan posisi index dari elemen “Bebek” pada object kosong yang telah dibuat.
        System.out.println("\n=== Tahap 2 ===");
        hewan.namaHewan.add("Badak");
        hewan.namaHewan.add("Bebek");

        int totalBebek = 0;
        for (String h : hewan.namaHewan) {
            if (h.equals("Bebek")) {
                totalBebek++;
            }
        }

        System.out.println("Total Bebek: " + totalBebek);
        System.out.println(
                "Posisi Index Bebek: " + hewan.namaHewan.indexOf("Bebek") + " dan "
                        + hewan.namaHewan.lastIndexOf("Bebek"));

        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 3 Hapus posisi “Bebek” yang pertama.
        System.out.println("\n=== Tahap 3 ===");
        hewan.namaHewan.remove(hewan.namaHewan.indexOf("Bebek"));

        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 4 Tampilkan elemen pada index ke-0 dan ke-2, selanjutnya hapus index ke-0.
        System.out.println("\n=== Tahap 4 ===");
        System.out.println("Index ke-0: " + hewan.namaHewan.get(0));
        System.out.println("Index ke-2: " + hewan.namaHewan.get(2));
        hewan.namaHewan.remove(0);
        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 5 Ubahlah index ke-0 dari “Cicak” Menjadi “Ular”, selanjutnya tambahkan elemen baru
        //pada index ke-2 dengan “Itik”.
        System.out.println("\n=== Tahap 5 ===");
        System.out.println("Nama Hewan: " + hewan.namaHewan);

        hewan.namaHewan.set(0, "Ular");
        hewan.namaHewan.add(2, "Itik");

        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 6 Hapus elemen diantara index ke-1 dan ke-5.
        System.out.println("\n=== Tahap 6 ===");
        hewan.namaHewan.subList(2, 5).clear();

        System.out.println("Nama Hewan: " + hewan.namaHewan);

        // tahap 7 Tampilkan elemen pertama dan terakhir
        System.out.println("\n=== Tahap 7 ===");
        System.out.println("Elemen pertama  : " + hewan.namaHewan.get(0));
        System.out.println("Elemen terakhir : " + hewan.namaHewan.get(hewan.namaHewan.size() - 1));

        // tahap 8 Tampilkan jumlah elemen pada ArrayList.
        System.out.println("\n=== Tahap 8 ===");
        System.out.println("Total elemen hewan : " + hewan.namaHewan.size());

        // tahap 9 Carilah posisi index dari “Badak”.
        System.out.println("\n=== Tahap 9 ===");
        System.out.println("Posisi index badak : " + hewan.namaHewan.indexOf("Badak"));
    }
}
