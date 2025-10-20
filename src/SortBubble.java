public class SortBubble {
    public SortBubble(){

    }
    public void sortBubbleAvz(int[] numeros){
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j]>numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1]
                    numeros[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public void sortBubbleDecendente(int[] numeros){
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j]<numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
