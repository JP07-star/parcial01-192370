import java.util.Scanner; //incorporamos la libreria
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in); //llamamos a la libreria

        String frase = scanner.nextLine(); //solicitamos una frase y se guarda en la variable

        String texto = frase;
        texto = texto.trim().replaceAll("\\s+", " "); //para elminar los espacios

        String[] palabras = texto.split(" "); //parqa divir la cadena en un arreglo

        for (i = 0; i < palabras; )

        //imprimir por pantalla resultados
        
        System.out.println(palabras);

        

    
    }
}