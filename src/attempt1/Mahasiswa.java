
package attempt1;


public class Mahasiswa {
     String npm;
     String nama;
     double nilaiKehadiran;
     double nilaiTugas;
     double nilaiUTS;
     double nilaiUAS;

    public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungNilaiAkhir() {
        return (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);
    }

    public String hitungGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            return "A";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            return "B";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            return "C";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            return "D";
        } else {
            return "E";
        }
    }

    public String hitungKeterangan(String grade) {
        switch (grade) {
            case "A":
                return "ISTIMEWA";
            case "B":
                return "BAIK";
            case "C":
                return "CUKUP";
            case "D":
                return "KURANG";
            case "E":
                return "KURANG SEKALI";
            default:
                return "";
        }
    }

    public void tampilkanOutput() {
        double nilaiAkhir = hitungNilaiAkhir();
        String grade = hitungGrade(nilaiAkhir);
        String keterangan = hitungKeterangan(grade);

        System.out.println("\nNPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}



