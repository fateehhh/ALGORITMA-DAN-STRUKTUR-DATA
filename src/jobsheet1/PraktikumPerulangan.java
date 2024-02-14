package jobsheet1;

import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Masukkan NIM Anda: ");
        String nim = sc17.nextLine();
        System.out.println("=============================");

        String lastTwoDigits = nim.substring(Math.max(0, nim.length() - 2));
        int n = Integer.parseInt(lastTwoDigits);
        if (n < 10) {
            n += 10;
        }
        System.out.println("n: " + n);
        for (int i = 1; i < nim.length(); i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(n);
    }
}
