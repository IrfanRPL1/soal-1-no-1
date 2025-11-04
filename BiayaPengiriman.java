import java.util.Scanner;

public class BiayaPengiriman {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        // --- 1. Input Data Paket ---
        System.out.println("📦 KALKULATOR BIAYA PENGIRIMAN 📦");
        System.out.print("Berat (kg): ");
        double berat = inputScanner.nextDouble();
        System.out.print("Jarak (km): ");
        double jarak = inputScanner.nextDouble();
        System.out.print("Panjang (cm): ");
        double p = inputScanner.nextDouble();
        System.out.print("Lebar (cm): ");
        double l = inputScanner.nextDouble();
        System.out.print("Tinggi (cm): ");
        double t = inputScanner.nextDouble();
        inputScanner.close();

        // --- 2. Perhitungan Biaya Berat ---
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250; // Jarak <= 10 km
        } else {
            biayaPerKg = 6000; // Jarak > 10 km
        }
        double biayaBerat = berat * biayaPerKg;

        // --- 3. Perhitungan Biaya Volume Tambahan ---
        double volume = p * l * t;
        double biayaTambahanVolume = 0;
        
        if (volume > 100) {
            biayaTambahanVolume = 50000; // Biaya Rp 50.000 jika volume > 100 cm^3
        }
        
        // --- 4. Biaya Total ---
        double biayaTotal = biayaBerat + biayaTambahanVolume;

        // --- 5. Output Hasil ---
        System.out.println("\n====================================");
        System.out.println("   💰 RINCIAN BIAYA PENGIRIMAN 💰");
        System.out.println("====================================");
        System.out.printf("Biaya Berat (%.0f/kg): Rp %,.0f\n", biayaPerKg, biayaBerat);
        System.out.printf("Biaya Volume Tambahan: Rp %,.0f\n", biayaTambahanVolume);
        System.out.println("------------------------------------");
        System.out.printf("TOTAL BIAYA          : **Rp %,.0f**\n", biayaTotal);
        System.out.println("====================================");
    }
}
