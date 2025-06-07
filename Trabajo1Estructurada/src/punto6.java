import java.util.Scanner;

public class punto6 {//Crea un programa que pida dos números y determine cuál es mayor o si son iguales.

    public static void main(String[] args) {

        Scanner into= new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        int num1 = into.nextInt();
        System.out.println("Ingrese el numero 2 ");
        int num2= into.nextInt();                                               //ingreso de datos
        boolean esMayor = false;
        boolean esIgual=false;
        if (num1==num2) { esIgual=true;    //Condicional para ver si ambos numeros son iguales


        } else { esMayor=true;



        }

        if (esIgual == true) {
            System.out.println("Ambos son iguales");

        }
        if (esMayor==true) {
            if (num1>num2) {
                System.out.println("El numero 1 es mayor");       //en el caso quew sean diferebnttes se determina cual de los dos es mayor

            }else {
                System.out.println("El numero 2 es mayor");
            }


        }





    }








}
