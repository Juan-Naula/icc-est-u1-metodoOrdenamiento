public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros = {10, 0, -5, 5, 15, 2};
        String[] nombres ={"Juan","Maria","Pedro","Ana","Hector"};  
        SortBubble claseSortBubble = new SortBubble();
        SortSelection claseSortSelection = new SortSelection();
        SortInsertion claseSortInsertion = new SortInsertion();

        /*System.out.println("Array Original:");
        clasesortBubble.printArray(numeros);
        System.out.println("Ordenado Asendente:");
        clasesortBubble.sortBubbleAvz(numeros);
        clasesortBubble.printArray(numeros);
        System.out.println("Orenado Descendente:");
        clasesortBubble.sortBubbleDecendente(numeros);
        clasesortBubble.printArray(numeros);*/
        System.out.println("Estudiante: Juan Naula");
        
        /*System.out.println("Metodo Seleccion");
        System.out.println("Original");
        claseSortBubble.printArray(numeros);
        System.out.println("Ordenado Ascendente");
        claseSortSelection.sortAscendente(numeros);
        claseSortBubble.printArray(numeros);
        System.out.println("Ordenado Descendente");
        claseSortSelection.sortDecendente(numeros);
        claseSortBubble.printArray(numeros);*/

        System.out.println("Estudiante: Juan Naula");
        System.out.println("Metodo Sort Insertion");
        System.out.println("Original");
        claseSortInsertion.printArray(numeros);
        System.out.println("Ordenado Ascendente");
        claseSortInsertion.sortInsertion(numeros, false);
        claseSortInsertion.printArray(numeros);
        System.out.println("Ordenado Descendente");
        claseSortInsertion.sortInsertionDescendente(numeros, false);
        claseSortInsertion.printArray(numeros);

        System.out.println("Estudiante: Juan Naula");
        System.out.println("Sort Insertion Nombres");
        claseSortInsertion.printArrayNombres(nombres);
        System.out.println("Ordenado");
        claseSortInsertion.sortInsertion(nombres, false);
        claseSortInsertion.printArrayNombres(nombres);
        
        Persona [] personas = {
            new Persona("Juan", 25),
            new Persona("Pedro", 28),
            new Persona("Ana", 20),
            new Persona("Byron", 30)
        };       

        System.out.println("Estudiante: Juan Naula");
        System.out.println("Sort insertion Personas ordenado por Nombre");
        claseSortInsertion.printArrayPersonas(personas);
        System.out.println("Ordenado por nombre");
        claseSortInsertion.sortPersonasByName(personas);
        claseSortInsertion.printArrayPersonas(personas);
        
        System.out.println("Estudiante: Juan Naula");
        System.out.println("Sort insertion Personas ordenado por Edad");
        claseSortInsertion.printArrayPersonas(personas);
        System.out.println("Ordenado por edad");
        claseSortInsertion.sortPersonasByAge(personas);
        claseSortInsertion.printArrayPersonas(personas);
        
    }
}
