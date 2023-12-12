import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kac adet sayi gireceksiniz? ");
        int sayiAdedi = scanner.nextInt();

        int min = Integer.MAX_VALUE; // min değeri başlangıçta olabilecek en büyük değer
        int max = Integer.MIN_VALUE; // max değeri başlangıçta olabilecek en küçük değer

        for (int i = 0; i < sayiAdedi; i++) {
            System.out.println((i + 1) + ". sayiyi giriniz:");
            int sayi = scanner.nextInt();

            // Girilen sayıyı kontrol et ve min, max değerlerini güncelle
            if (sayi < min) {
                min = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }
        }

        System.out.println("En kucuk sayi: " + min);
        System.out.println("En buyuk sayi: " + max);

        scanner.close();// bu kodu da bir arkadasin kodunu incelerken gordum. Sonda anladigim kadar yaratilmis scaner ornegini kapatiyor
    }
}
