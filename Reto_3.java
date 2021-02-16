import java.io.*;
import java.util.Scanner;
public class Reto_3 {
    public static BufferedReader entrada =
    new BufferedReader(new InputStreamReader(System.in));
    public static void main (String []args) throws IOException
    {
//System.out.println("Test"); //Prueba
System.out.println("Bienvenido al sistema de conversion\n\nQue conversion te gustaria realizar?");
int decision_general = 1;
while (decision_general != 0){
System.out.println("\n1: Convertir de decimal a binario\n2: Convertir de decimal a octar\n3: Convertir de binario a decimal\n4: Convertir de octal a decimal\n5: Convertir de hexadecimal a decimal\n");
int decision = 0;
int conversor = 0;
int operation = 0;
decision = Integer.parseInt(entrada.readLine());

switch (decision){

        case 1:
        System.out.println("Ingresa el numero que deseas convertir:\n");
        operation = Integer.parseInt(entrada.readLine());
       
        System.out.println("\nEl numero " + operation + " decimal en binario es: " + Integer.toBinaryString(operation));
        System.out.println("\nLe gustaria convertir algun otro numero?\n\n1:Si\n0:No\n");
        decision_general = Integer.parseInt(entrada.readLine());
        
        break;

        case 2:
        System.out.println("Ingresa el numero que deseas convertir:\n");
        operation = Integer.parseInt(entrada.readLine());
        System.out.println("\nEl numero " + conversor + " decimal en octal es: " + Integer.toOctalString(operation));
        System.out.println("\nLe gustaria convertir algun otro numero?\n\n1:Si\n0:No\n");
        decision_general = Integer.parseInt(entrada.readLine());
        break;

        case 3:
        System.out.println("Ingresa el numero que deseas convertir:\n");
        conversor = Integer.parseInt(entrada.readLine());
        operation = conversor;
        operation = Integer.parseInt(""+ conversor,2);
        System.out.println("\nEl numero " + conversor + " binario en octal es: " + Integer.toOctalString(operation));
        System.out.println("\nLe gustaria convertir algun otro numero?\n\n1:Si\n0:No\n");
        decision_general = Integer.parseInt(entrada.readLine());
        //System.out.println(Integer.parseInt("10101",2));
        break;

        case 4:
        System.out.println("Ingresa el numero que deseas convertir:\n");
        conversor = Integer.parseInt(entrada.readLine());
        operation = Integer.parseInt(""+conversor,8);
        
        System.out.println("\nEl numero " + conversor + " octal en decimal es: " + operation);
        System.out.println("\nLe gustaria convertir algun otro numero?\n\n1:Si\n0:No\n");
        decision_general = Integer.parseInt(entrada.readLine());
        break;

        case 5:
        System.out.println("Ingresa el numero que deseas convertir:\n");
        conversor = Integer.parseInt(entrada.readLine());
        operation = Integer.parseInt(""+conversor,16);
        System.out.println("\nEl numero " + conversor + " hexadecimal en decimal es: " + operation);
        System.out.println("\nLe gustaria convertir algun otro numero?\n\n1:Si\n0:No\n");
        decision_general = Integer.parseInt(entrada.readLine());
        break;

        default:
        System.out.println("Ingresa un numero valido:\n");
        break;

}

}
System.out.println("\nHa cerrado la calculadora satisfactoriamente");
}
}