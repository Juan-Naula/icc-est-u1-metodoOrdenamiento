public class SortSelection {
    public SortSelection(){

    }

    public void sortAscendente(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int posMenor = i;
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j]<numeros [posMenor]) {
                 posMenor = j;
                }
            }
            if (i!= posMenor) {
                int temp = numeros [posMenor];
                numeros [posMenor] = numeros[i];
                numeros[i] = temp;
            }
        }
    }

    public void sortDecendente(int[] numeros){
         for (int i = 0; i < numeros.length; i++) {
            int posMenor = i;
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j]>numeros [posMenor]) {
                 posMenor = j;
                }
            }
            if (i!= posMenor) {
                int temp = numeros [posMenor];
                numeros [posMenor] = numeros[i];
                numeros[i] = temp;
            }
        }
    }

}
