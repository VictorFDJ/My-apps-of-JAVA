import java.util.Scanner;

public class CalculadoraApp
{
    public static void main(String[] args)
    {
        Scanner consola = new Scanner(System.in);
        System.out.println("Aplicacion calculadora");
       while (true)
       {
         try {
             mostrarMenu();
             var operacion = Integer.parseInt(consola.nextLine());

             if (operacion >= 1 && operacion <= 4) {
                 System.out.print("Introduce el primer numero: ");
                 var operando1 = Integer.parseInt(consola.nextLine());
                 System.out.print("Introduce el segundo numero: ");
                 var operando2 = Integer.parseInt(consola.nextLine());
                 int resultado;

                 switch (operacion) {

                     case 1 -> {
                         resultado = operando1 + operando2;
                         System.out.println("La suma de los numeros es: " + resultado);
                     }
                     case 2 -> {
                         resultado = operando1 - operando2;
                         System.out.println("La resta de los numeros es: " + resultado);
                     }
                     case 3 -> {
                         resultado = operando1 * operando2;
                         System.out.println("La multiplicacion de los numeros es: " + resultado);
                     }
                     case 4 -> {
                         resultado = operando1 / operando2;
                         System.out.println("La divicion de los numeros es: " + resultado);
                     }

                     default -> System.out.println("Operacion erronea:" + operacion);
                 }
                 System.out.print("\n");
             } else if (operacion == 5) {
                 System.out.println("Chao");
                 break;
             } else {
                 System.out.println("Opcion erronea:" + operacion);
             }
         }catch (Exception e)
         {

             System.out.println("Ocurrio un error: " + e.getMessage());
         }
       }





    }
    public static void mostrarMenu(){
        System.out.println("""
                     1- Suma
                     2- Resta
                     3- Multiplicacion
                     4- Division
                     5- salir
                     """);

        System.out.print("Eliga la operacion a realizar: ");


    }
}
