public class SelectionSort {
    public static void selectionSort(double[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            double min = arr[i];
            int index = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            if (index!=i){
                double temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }

        }
    }
}
