public class Main {
    public static void main(String[] args) {
         double[] list = {2, 3.8,1, 9, 5, 6.6, 5.7, -4};

        System.out.println("mang ban dau:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
         SelectionSort.selectionSort(list);

        System.out.println("mang sau khi sap xep:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
