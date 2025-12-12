import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        String cliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Bienvenido " + cliente + " - Cuenta " + tipoDeCuenta);

        while(opcion != 9){

            System.out.println("*****************************");
            System.out.println("Escriba el número de la opcion deseada");
            System.out.println("""
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir""");
            opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Su saldo actual es de: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("Indique la cantidad a retirar");
                    double retiro = lectura.nextDouble();

                    while (retiro <= 0 || retiro > saldo) {
                        if (retiro <= 0) {
                            System.out.println("Ingrese un valor positivo");
                        } else {
                            System.out.println("Su saldo actual es insuficiente");
                        }
                        retiro = lectura.nextDouble();
                    }

                    saldo -= retiro;
                    System.out.println("Usted ha retirado " + retiro + "$");
                    System.out.println("Su saldo actual es de " + saldo + " $");
                    break;
                case 3:
                    System.out.println("Indique la cantidad a depositar");
                    double deposito = lectura.nextDouble();
                    while(deposito <= 0){
                        if(deposito <= 0){
                            System.out.println("Ingrese un monto positivo");
                        }
                        deposito = lectura.nextDouble();
                    }
                    saldo += deposito;
                    System.out.println("Usted a depositado " + deposito + "$");
                    System.out.println("Su saldo actual es de " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Gracias por usar la aplicacion. Adios! ");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            if(opcion == 9){
                break;
            }
            System.out.println("Desea realizar otra operacion?");
            System.out.println("""
                    1 - Si
                    9  - No""");
            int opcionFinal = lectura.nextInt();

            if (opcionFinal == 9){
                System.out.println("Gracias por usar la aplicacion. Adios! ");
                opcion = 9;

            }



        }








    }
}