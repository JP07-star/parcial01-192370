public class Numeros {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //Definimmos el array.
        int[] numero = {12345};
        //variable para almacenar los datos del for.
        int cantidad = 0;
        int cantidadFinal = 0;
        //un for que busca recorrer la variable para saber cuantos numeros tiene .
        for (int i = 0; i < numero ; i++){
            
            cantidadFinal = cantidad + i; //almacenamos los restultados de i en la variable cantidad.

        }

        //imprimos por pantalla la variable en la que almacenamos los datos.
        System.out.println("La cantidad de numeros que tiene el entero es de: " + cantidadFinal);
    
    }
}