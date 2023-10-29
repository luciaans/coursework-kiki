import java.util.Scanner;

public class mesinkopi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
      // Menampilkan menu
        System.out.println("Menu Kopi:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("4. Mocha");
        System.out.println("5. Americano");
        System.out.println("Pilih menu kopi (1-5): ");
        
      // Membaca input dari pengguna
        int menu = scanner.nextInt();
        
      // Menghitung harga kopi sesuai menu
        double harga = 0;
        switch (menu) {
            case 1:
                harga = 25000;
            break;
            case 2:
                harga = 15000;
            break;
            case 3:
                harga = 20000;
            break;
            case 4:
                harga = 10000;
            break;
            case 5:
                harga = 22000;
            break;
            default:
            System.out.println("Menu tidak valid.");
            System.exit(0);
        }
        
      // Meminta input jumlah kopi yang diinginkan
        System.out.println("Berapa banyak kopi yang ingin Anda pesan? ");
        int jumlah = scanner.nextInt();
        
      // Menghitung total harga
      double total = harga * jumlah;
        
      // Menampilkan total harga
        System.out.println("Total harga: " + total);
        scanner.close();
    }
}
