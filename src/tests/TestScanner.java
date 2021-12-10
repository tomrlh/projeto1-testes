package tests;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor:");
        double parsedValue = Double.parseDouble(
            scanner.nextLine().replace(",",".")
        );

        System.out.println(parsedValue);
    }
}
