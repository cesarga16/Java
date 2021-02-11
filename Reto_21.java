import java.io.*;
import java.util.Scanner;
public class Reto_21 {
    public static BufferedReader entrada =
    new BufferedReader(new InputStreamReader(System.in));
    public static void main (String [] args) throws IOException
    {
        int cerrar_programa = 0;
       while (cerrar_programa != 1) {
        int Adulto = 100;
        int Nino = 70;
        int Inapam = 50;
        int aBuelito = 100;
        int decision = 0;
        int decision_general = 0;
    

        System.out.println("Bienvenido al parque de diversiones:\n Que boleto deseas comprar?\n1:Adulto\n2:Nino\n3:Adulto con INAPAM\n4:Adulto sin INAPAM\n5:Terminar la maquina vende boletos(solo personal autorizado)\n");
        decision_general = Integer.parseInt(entrada.readLine());
        switch (decision_general){

            case 1:
            System.out.println("\nEl boleto de adulto cuesta 100$\nDeseas comrparlo?\n\n1:Si\t0:No");
            decision = Integer.parseInt(entrada.readLine());
            if (decision == 1){
                System.out.println("\nHaz comprado el boleto, se te anadira a tu cuenta");
            }else{System.out.println("\nNo compraste el boleto");
        }
            break;

            case 2:
            System.out.println("\nEl boleto de nino cuesta 70$\nDeseas comrparlo?\n\n1:Si\t0:No");
            decision = Integer.parseInt(entrada.readLine());
            if (decision == 1){
                System.out.println("\nHaz comprado el boleto, se te anadira a tu cuenta");
            }else{System.out.println("\nNo compraste el boleto");
        }
            break;

            case 3:
            System.out.println("\nEl boleto de adulto con INAPAM cuesta 100$\nDeseas comrparlo?\n\n1:Si\t0:No");
            decision = Integer.parseInt(entrada.readLine());
            if (decision == 1){
                System.out.println("\nHaz comprado el boleto, se te anadira a tu cuenta");
            }else{System.out.println("\nNo compraste el boleto");
        }
            break;

            case 4:
            System.out.println("\nEl boleto de adulto sin INAPAM cuesta 100$\nDeseas comrparlo?\n\n1:Si\t0:No");
            decision = Integer.parseInt(entrada.readLine());
            if (decision == 1){
                System.out.println("\nHaz comprado el boleto, se te anadira a tu cuenta");
            }else{System.out.println("\nNo compraste el boleto");
        }
            break;

            case 5:
            System.out.println("Es usted personal autorizado?\n\n1:Si\n0:No");
            cerrar_programa = Integer.parseInt(entrada.readLine());
            if (cerrar_programa == 1){
                System.out.println("\nSe cerrara el programa en un momento");
            }else{System.out.println("\nNo puede cerrar el programa a menos a que sea un personal autorizado");
        }
            break;

            default:
            System.out.println("Ingresa un valor valido");
            break;
        }
    }
}
 }

