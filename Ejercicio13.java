import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        while (salir == false) {
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Dividir dos numeros");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int num, num2,res;
                    System.out.println("Ingrese numero a sumar");
                    num = sc.nextInt();
                    System.out.println("Ingrese otro numero a sumar");
                    num2 = sc.nextInt();
                    res = num + num2;
                    System.out.println("El resultado de la suma es de: " + res);
                    break;
                case 2:
                      int num3, num4, res1;
                    System.out.println("Ingrese numero a restar");
                    num3 = sc.nextInt();
                    System.out.println("Ingrese otro numero a restar");
                    num4 = sc.nextInt();
                    res1 = num3 - num4;

                    if (num4 == 0) {
                        System.out.println("No se puede");
                    }
                    else{
                          System.out.println("El resultado de la resta es de: " + res1);
                    }
                    break;
                case 3:
                    salir = true;
                    break;
            }
        }
    }
}