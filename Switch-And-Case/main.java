import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Nama             : ");
    String nama = input.nextLine();
    System.out.print("Umur             : ");
    int umur = input.nextInt();
    System.out.print("Jenis Kelamin    : ");
    char jeniskelamin = input.next().charAt(0);

    System.out.println("Nama             : " + nama);
    System.out.println("Umur             : " + umur);
    System.out.println("Jenis Kelamin    : " + jeniskelamin);

    switch (umur) {
      case 1,2,3,4,5:
        System.out.println("Keterangan       : Balita");
        break;
      case 6,7,8,9,10,11:
        System.out.println("Keterangan       : Anak-Anak");
        break;
      case 12,13,14,15,16,17,18,19,20,21:
        System.out.println("Keterangan       : Dewasa");
        break;
      case 60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80:
        System.out.println("Keterangan       : Lansia");
        break;
    }
    input.close();
  }
}