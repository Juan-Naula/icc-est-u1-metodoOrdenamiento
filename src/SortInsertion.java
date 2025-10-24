public class SortInsertion {
    public SortInsertion(){

    }
    
    public static void sortInsertion(int [] numeros, boolean pasos){
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int temp = numeros[i];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", temp: " + temp);
            }
            while (j >= 0 && numeros[j] > temp) {
                if (pasos)
                    System.out.println("Compara temp: " + temp + " con numeros [" + j + "]" + numeros[j]);
                numeros[j+1] = numeros[j];
                if (pasos)
                    printArray(numeros);
                j--;
                if (pasos)
                    System.out.println("Mueve numeros["+(j+1)+"] a numeros["+(j+2)+"]");
                    
            }
            numeros[j+1] = temp;
            if (pasos) {
                System.out.println("Inserta temp: " + temp + "en la posicion " + (j+1));
                System.out.println("Estado actual");
            }
        }
    }
    public static void sortInsertionDescendente(int [] numeros, boolean pasos){
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int temp = numeros[i];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", temp: " + temp);
            }
            while (j >= 0 && numeros[j] < temp) {
                if (pasos)
                    System.out.println("Compara temp: " + temp + " con numeros [" + j + "]" + numeros[j]);
                numeros[j+1] = numeros[j];
                if (pasos)
                    printArray(numeros);
                j--;
                if (pasos)
                    System.out.println("Mueve numeros["+(j+1)+"] a numeros["+(j+2)+"]");
                    
            }
            numeros[j+1] = temp;
            if (pasos) {
                System.out.println("Inserta temp: " + temp + "en la posicion " + (j+1));
                System.out.println("Estado actual");
            }
        }
    }


    public static void sortInsertion(String [] nombres, boolean pasos){
        for (int i = 1; i < nombres.length; i++) {
            int j = i - 1;
            String aux = nombres[i];
            while (j >= 0 && nombres[j].compareTo(aux) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = aux;
        }
    }

    public static void sortPersonasByAge(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && aux.getAge() < personas[j].getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    } 

    public static void sortPersonasByName(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0 ) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    } 

    public static void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i<numeros.length-1) {
                System.out.print(numeros[i] + ", ");
            }
            else{
                System.out.print(numeros[i]);
            }
        }
        System.out.println("]");
    }

    public static void printArrayNombres(String[] nombres){
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            if (i < nombres.length-1) {
                System.out.print(nombres[i] + ", ");
            }
            else{
                System.out.print(nombres[i]);
            }
        }
        System.out.println("]");
    }

    public static void printArrayPersonas(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getName() + ", Edad: " + personas[i].getAge());
        }
    }

}
