package main;
import Exception.ValueException;
import code.Cliente;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Las excepciones son una manera en la que podemos responder a los errores en tiempo de ejecucion para que 
 * el programa no termine.
 * En esta clase principal simulamos el funcionamiento de un cajero y fuera de la clase main creamos dos metodos
 * deposito() y retiro().
 * @author Bryan alberto
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc; 
        Scanner tec = new Scanner(System.in);
        Cliente cliente = new Cliente(1234,"Jose Burgos");
        
        do{
            System.out.println("======Menu======");
            System.out.println("    1. Deposito.");
            System.out.println("    2. Retiro.");
            System.out.println("    3. Salir."); 
            
            try{
               opc = tec.nextInt();
            }catch(InputMismatchException e){
                tec = new Scanner(System.in); // con este codigo limpiamos el escaner.
                opc = 0;
            }
            
            switch(opc){
                case 1: deposito(cliente);
                    break;
                case 2: retiro(cliente);
                    break;
                case 3: System.out.println("Saliendo....");
                    break;
                default: System.out.println("Instruccion invalida...");
                    break;
            }
        }while(opc != 3);
    }
    
        public static void deposito(Cliente instance){
            double cant;
            Scanner tec = new Scanner(System.in);
            System.out.print("Ingrese la cantidad que desea depositar: ");
            try{
             cant = tec.nextDouble();
             instance.deposito(cant);
            }catch(InputMismatchException e){
                tec = new Scanner(System.in);
                System.out.println("Error: Formato invalido");
            }

        }
        
        public static void retiro(Cliente instance){
            double cant = 0;
            int nip = 0;
            Scanner tec = new Scanner(System.in);
            try{
               System.out.print("Ingrese su nip de cliente: ");
               nip = tec.nextInt();
               System.out.print("Ingrese la cantidad que desea retirar: ");
               cant = tec.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("Error: Formato invalido");
                tec = new Scanner(System.in);
            }
            if(instance.retiro(cant, nip)){
              System.out.println("Operacion exitosa!!");
            } else{
                System.out.println("Operacion fallida...");
            }
        }
}
