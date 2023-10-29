import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        String[] nama = new String[jumlahMahasiswa];
        int[] nilai = new int[jumlahMahasiswa];
        String[] status = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            nama[i] = input.next();

            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();

            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

        System.out.println("========================");
        System.out.println("Data Nilai Mahasiswa");
        System.out.println("========================");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nama: " + nama[i]);
            System.out.println("Nilai: " + nilai[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("========================");
        }
    }
}