import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("[ Input dan Operator Aritmatika ] \n");
    Scanner input = new Scanner(System.in);

    System.out.println("[+] Masukan angka kehadiran (0-16) : ");
    float absensi = input.nextFloat();
    float nilaiAbsen = absensi/16 * 10;

    System.out.println("[+] Masukan nilai rata-rata tugas (0-100) : ");
    float tugas = input.nextFloat();
    float nilaiTugas = tugas * 20/100;

    System.out.println("[+] Masukan nilai UTS (0-100) : ");
    float uts = input.nextFloat();
    float nilaiUTS = uts *30/100;

    System.out.println("[+] Masukan nilai UAS (0-100) : ");
    float uas = input.nextFloat();
    float nilaiUAS = uas * 40/100;

    System.out.println("\n[ Result ]");
    System.out.println("[+] Nilai kehadiran anda adalah "+nilaiAbsen+"%");
    System.out.println("[+] Nilai tugas keseluruhan anda adalah "+nilaiTugas+"%");
    System.out.println("[+] Nilai UTS anda adalah "+nilaiUTS+"%");
    System.out.println("[+] Nilau UAS anda adalah "+nilaiUAS+"%");

    System.out.println("\n[ Nilai Akhir ]");
    float nilaiAkhir = nilaiAbsen + nilaiTugas + nilaiUTS + nilaiUAS;
    System.out.println("[+] Nilai akhir anda adalah : "+nilaiAkhir);
    input.close();  
    }
}