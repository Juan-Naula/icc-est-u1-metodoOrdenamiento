public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros = {10, 0, -5, 5, 15, 2};
        SortBubble claseSortBubble = new SortBubble();
        SortSelection claseSortSelection = new SortSelection();

        /*System.out.println("Array Original:");
        clasesortBubble.printArray(numeros);
        System.out.println("Ordenado Asendente:");
        clasesortBubble.sortBubbleAvz(numeros);
        clasesortBubble.printArray(numeros);
        System.out.println("Orenado Descendente:");
        clasesortBubble.sortBubbleDecendente(numeros);
        clasesortBubble.printArray(numeros);*/
        System.out.println("Estudiante: Juan Naula");
        
        System.out.println("Metodo Seleccion");
        System.out.println("Original");
        claseSortBubble.printArray(numeros);
        System.out.println("Ordenado Ascendente");
        claseSortSelection.sortAscendente(numeros);
        claseSortBubble.printArray(numeros);
        System.out.println("Ordenado Descendente");
        claseSortSelection.sortDecendente(numeros);
        claseSortBubble.printArray(numeros);
    }
}
