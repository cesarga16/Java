import java.io.*;
public class Reto_1
{
    public static BufferedReader entrada =
    new BufferedReader(new InputStreamReader(System.in));
    public static void main (String [] args) throws IOException
    {
        int calc;
        float n1 = 1;
        float n2 = 2;
        float ans;
        System.out.println("Bienvendio a la calculadora \nQue operacion quieres realizar? \n 1:Suma \n 2:Resta \n 3:Division \n 4:Multiplicacion");
       calc = Integer.parseInt(entrada.readLine());
       System.out.println("Ingresar el primer numero:");
       n1 = Integer.parseInt(entrada.readLine());
       System.out.println("Ingresa el segundo numero:");
       n2 = Integer.parseInt(entrada.readLine());
        switch (calc){
            case 1:
            ans = n1+n2;
            System.out.println("El resultado de la operacion es: "+n1 +" + "+n2 +" = "+ans );
            break;
            case 2:
            ans = n1-n2;
            System.out.println("El resultado de la operacion es: "+n1 +" - "+n2 +" = "+ans );
            break;
            case 3:
            ans = n1/n2;
            System.out.println("El resultado de la operacion es: "+n1 +" / "+n2 +" = "+ans );
            break;
            case 4:
            ans = n1*n2;
            System.out.println("El resultado de la operacion es: "+n1 +" * "+n2 +" = "+ans );
            break;
            default:
            System.out.println("No ingresaste un valor de operacion valido, intenta nuevamente");
            break;
        }
    }
}