package pr5_7;

// Вариант 5.7. Разложение на множители

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("N: ");
            int N;
            Scanner scanner = new Scanner(System.in);
            N = scanner.nextInt();
            System.out.print("N's prime decompose: ");
            PrimeDecomposer pDec = new PrimeDecomposer();
            pDec.PrimeDecompose(N, 2);
            System.out.println();
        }
    }
}