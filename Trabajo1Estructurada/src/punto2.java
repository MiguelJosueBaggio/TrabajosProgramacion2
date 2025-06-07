import java.util.Scanner;

public class punto2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        //Crea un programa que solicite al usuario su nombre y edad, y luego muestre un
        //mensaje con esos datos
        Scanner intro = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = intro.next();
        System.out.print("Ingres la edad: ");
        int edad= intro.nextInt();
        System.out.println("El nombre del usuario es " + nombre + " y su edad es de " + edad );


    }
}