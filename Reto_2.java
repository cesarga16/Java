import java.io.*;
public class Reto_2{
    public static BufferedReader entrada =
    new BufferedReader(new InputStreamReader(System.in));
    public static void main (String [] args) throws IOException {
        int Piramide;
        int i=1;
        int j=0;
        int space;

        System.out.println("Bienvenido al CreaPiramides 4000\n\nPorfavor ingresa el tamano de la piramide que te gustaria realizar:");
        Piramide = Integer.parseInt(entrada.readLine());
        System.out.println("Tu piramide:\n\n");
        for(i=1; i <= Piramide; i++, j=0){
            for(space=1; space<=Piramide - i; space++){
            System.out.print("  ");
        }

        while (j!=2 * i - 1){
            System.out.print("* ");
            j++;
        }
        //despues de la piramide
        System.out.println();
 }
 }
}