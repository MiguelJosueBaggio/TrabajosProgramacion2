import java.util.Scanner;

public class punto9 {
    //Escribe un programa que pida un número y determine si es par o impar.
    public static void main(String[] args){
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num= intro.nextInt();

        if (num%2==0) {
            System.out.println("es par");

        }else{
            System.out.println("Es impar");
        }

    }





}
