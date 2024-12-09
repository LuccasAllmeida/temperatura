package conversao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double Fahrenheit = 9;

        System.out.println("Informe a temperatura em Celsius: ");
        double Celsius = scanner.nextDouble();

        System.out.println("A temperatua em Fahrenheit é: " +((Fahrenheit*Celsius+160)/5));

    }
}