class Main {
    String nama;
    int harga;
    int jumlahBeli;

    public void isiData(String nama, int harga, int jumlahBeli) {
        this.nama = nama;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilData() {
        System.out.println("Nama Barang: " + this.nama);
        System.out.println("Harga Barang: " + this.harga);
        System.out.println("Jumlah Beli: " + this.jumlahBeli);
    }

    public int hitungTotal() {
        return this.harga * this.jumlahBeli;
    }
}

public class penjualantokokiki {
    public static void main(String[] args) {
        Main penjualan = new Main();

        penjualan.isiData("Pensil", 5000, 10);


        penjualan.tampilData();

        int totalHarga = penjualan.hitungTotal();
        System.out.println("Total Harga: " + totalHarga);
    }
}
