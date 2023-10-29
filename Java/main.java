import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("NIM     :  ");
    String nim = input.nextLine();
    System.out.print("NAMA    :  ");
    String nama = input.nextLine();
    System.out.print("JK      :  ");
    String jk = input.nextLine();
    System.out.print("TAHUN LAHIR     :  ");
    int tahunLahir = input.nextInt();
    System.out.print("TAHUN SEKARANG      :  ");
    int tahunSekarang = input.nextInt();

    System.out.println("\n\n\nNIM     :  " + nim);
    System.out.println("Nama      :  " + nama);
    System.out.println("JK    :  " + jk);
    System.out.println("TAHUN LAHIR   :  " + tahunLahir);
    System.out.println("TAHUN SEKARANG    :  " + tahunSekarang);
    int umur = tahunSekarang - tahunLahir;
    System.out.println("UMUR -/+      :  " + umur);

    input.close();
  }
}