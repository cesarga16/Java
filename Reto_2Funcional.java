import java.io.*;
public class Reto_2{
    public static BufferedReader entrada =
    new BufferedReader(new InputStreamReader(System.in));
    public static void main (String [] args) throws IOException {
        int piramide;
        int i;
        int y;
        int spaces;

        System.out.println("Bienvenido al CreaPiramides 4000\n\nPorfavor ingresa el tamano de la piramide que te gustaria realizar:");
        piramide = Integer.parseInt(entrada.readLine());
        spaces = piramide;
        System.out.println("Tu piramide:\n\n");
        for(i=0; i<piramide; i++){
            for(y=0; y<=i; y++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}