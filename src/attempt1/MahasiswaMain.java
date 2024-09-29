
package attempt1;

import java.util.Scanner;

public class MahasiswaMain {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM : ");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();
        
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UTS : ");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Nilai UAS : ");
        double nilaiUAS = input.nextDouble();
        
        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        
        mahasiswa.tampilkanOutput();
    }
}
