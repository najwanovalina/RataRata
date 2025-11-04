import java.util.Scanner;

public class RataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Maasukkan jumlah siswa:");
        int jumlahSiswa = input.nextInt();

        int totalNilai = 0;
        for (int i = 1; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ":");
            int nilai = input.nextInt();
            totalNilai += nilai;

            int rataRata = totalNilai / jumlahSiswa;
            System.out.println("Rata rata siswa :" + rataRata);

        }
        input.close();
    }

}
