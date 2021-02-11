import java.io.*;
import java.util.Scanner;
public class Reto_21 {
    public static BufferedReader entrada =
    new BufferedReader(new InputStreamReader(System.in));
    public static void main (String [] args) throws IOException
    {
        int Adulto = 100;
        int Nino = 70;
        int Inapam = 50;
        int aBuelito = 100;
        int respuesta = 0;
        do{
                
                System.out.println("Quieres otro boleto?\n Si=1 \t No=0");
                //respuesta = Integer.parseInt(entrada.readLine());
                Scanner reader = new Scanner(System.in);
                char c = reader.next(".").charAt(0);
        } while (c == 's');
    }
}
