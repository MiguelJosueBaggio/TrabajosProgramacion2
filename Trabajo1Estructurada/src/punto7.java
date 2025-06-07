import java.util.Scanner;

public class punto7 { // Crea un programa que pida la edad de una persona y determine si es un niño (0-12),
    //adolescente (13-17) o adulto (18 en adelante).

    public static void main(String[] args){
        Scanner intro=new Scanner(System.in);

       while (true){
           System.out.println("Ingrese la edad de la persona");
           int edad= intro.nextInt();
           if (edad >=18 && edad <125) {
               System.out.println("la persona es adulta"); break;

           } else if (edad>=13 && edad <18) {
               System.out.println("la persona es adolecente"); break;


           } else if(edad>=0 && edad<13){  System.out.println("la persona es un niño");break;

           }else {
               System.out.println("es una edad negativa o mayor a 125 años");
           }




       }


    }








}
