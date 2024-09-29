
package attempt1;

import java.util.Scanner;

public class Pembelian {
    double totalPembelian;
    double potongan;
    double jumlahBayar;

    public Pembelian(double totalPembelian) {
        this.totalPembelian = totalPembelian;
        hitungPotongan();
        hitungJumlahBayar();
    }

    private void hitungPotongan() {
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05; 
        } else {
            potongan = totalPembelian * 0.20; 
        }
    }

    private void hitungJumlahBayar() {
        jumlahBayar = totalPembelian - potongan;
    }

    public double getTotalPembelian() {
        return totalPembelian;
    }

    public double getPotongan() {
        return potongan;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }
    
    //main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian: Rp. ");
        double totalPembelian = input.nextDouble();

        Pembelian pembelian = new Pembelian(totalPembelian);

        System.out.println("Total pembelian: Rp. " + pembelian.getTotalPembelian());
        System.out.println("Besarnya potongan: Rp. " + pembelian.getPotongan());
        System.out.println("Jumlah yang harus dibayarkan: Rp. " + pembelian.getJumlahBayar());

        input.close();
    }
}




