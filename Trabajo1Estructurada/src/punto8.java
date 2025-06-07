import java.util.Scanner;

public class punto8 { // Crea un programa que pida un número del 1 al 7 y muestre el día de la semana
   // correspondiente.

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        String dia =" ";
        while (true) {
            System.out.println("Ingrese el numero de dia");
            int num = intro.nextInt();
            if (num <1|| num>7) {
                System.out.println("Intente de nuevo por que hay error");

            }else {
                switch (num) {

                    case 1:
                        dia = "Lunes";
                        break;
                    case 2:
                        dia = "Martes";
                        break;
                    case 3:
                        dia = "Miercoles";
                        break;
                    case 4:
                        dia = "Jueves";
                        break;
                    case 5:
                        dia = "Viernes";
                        break;
                    case 6:
                        dia = "Sabado";
                        break;
                    case 7:
                        dia = "Domingo";
                        break;




                }System.out.println("el dia de la semana es " + dia); break;}


        }


    }




}
