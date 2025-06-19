import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercício 1

        /*
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem? ");
        var idade = scanner.nextInt();

        if (idade < 18){
            System.out.println("Menor de idade");
        } 
        else if ((idade >= 18) && (idade <= 64)) {
            System.out.println("Maior de idade");
        }
        else if (idade >= 65){
            System.out.println("Idoso");
        } 
        */

        // Exercício 2

        /* 
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        var numero2 = scanner.nextInt();
        
        System.out.printf("A soma entre eles é: %s \nA subtração é: %s\nA multiplicação é: %s\nA divisão inteira é: %s\nE o resto da divisão é: %s", (numero1 + numero2), (numero1 - numero2), (numero1 * numero2), (numero1 / numero2), (numero1 % numero2));
        */

        // Exercício 3

        var scanner = new Scanner(System.in);
        System.out.print("Qual foi a sua nota? ");
        var nota = scanner.nextFloat();

        if ((nota <= 4) && (nota >= 0)){
            System.out.println("Reprovado");
        }
        else if ((nota >= 5) && (nota <= 6.9)){
            System.out.println("Recuperação");
        }
        else if ((nota >= 7) && (nota <= 10)){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Nota inválida.");
        }
    }
}
