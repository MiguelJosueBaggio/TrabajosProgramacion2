import java.util.Scanner;

public class punto4 {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

       //Crea un programa que solicite dos números y determine si ambos son positivos y
        //mayores que 10.

        Scanner intro = new Scanner(System.in);
        System.out.print("Ingrese el primer numero");   //Ingreso el numero
        int num1= intro.nextInt();
        System.out.print("Ingrese el segundo numero");
        int num2= intro.nextInt();


        if (esPositivo( num1, num2) == true) {esMayorDeDiez(num1,num2); //si la funcion esPositivo es true llamamos a la funcion esMayorDeDiez

        }

        else {
            System.out.println("Hay al menos un numero negativo");
        }








    }


    public static boolean esPositivo(int num1,int num2){ //Funcion que pureba que es positivo
        boolean positivo=false;
        if (num1 >0&&num2>0) { positivo=true;

            return positivo;


        }else {
        return positivo;}
    }




    public static void esMayorDeDiez (int num1, int num2) {//funcion que preuba que ambos numeros son mayores de 10

        if ( num1>10 ) {
            if (  num2>10) {
                System.out.println("Ambos son positivos y mayor que 10");}
            else{
                System.out.println("solo uno es verdadero");



        }



    }   else {
            System.out.println("Ambos son falsos");
                                                 }


}

}
