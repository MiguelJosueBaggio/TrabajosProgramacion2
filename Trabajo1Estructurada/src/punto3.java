import java.util.Scanner;

public class punto3 {
    public static void main(String[] args) {
        //- Escribe un programa que pida dos números al usuario y muestre su suma, resta,
        //multiplicación, división y módulo

        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese una opcion maracando el numero correspondiente:\n 1. Suma \n 2. Resta \n 3. Multiplicacion\n 4. División\n 5.Modulo" );
        int opcion = intro.nextInt();

        if (opcion >0&&opcion<6) {

            System.out.println("ingrese los numeros para realizar operaciones");
            double num1 = intro.nextDouble();
            double num2= intro.nextDouble();
            double total = 0;

            switch(opcion){

                case 1:
                    total=num1+num2;
                    break;
                case 2:
                    total=num1-num2;
                    break;
                case 3:
                    total= num1*num2;
                    break;
                case 4:
                    total=num1/num2;
                    break;
                case 5:
                    total=num1%num2;
                    break;
                default:
                    System.out.println("Fatal error");





            } System.out.println("El resultado es "+total);

        } else {
            System.out.println("fatal error");
        }



    }

}