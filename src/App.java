import java.util.Scanner;
public class App {
    public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);
    
    double metro;
    double conversao;

    System.out.println("Escreva abaixo o valor em metros:");
    metro = teclado.nextDouble(); 

    conversao = metro * 100;

    System.out.print("O valor em centímetros é: " + conversao + " cm");
    

    teclado.close();

    }
}