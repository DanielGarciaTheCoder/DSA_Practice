public class BubbleSort {
    
    public static void bubble_sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            for(int j=0; j<array.length-1-i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1, 22, 4, 728, 13, 53};

        bubble_sort(array);

        for (int i: array) {
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
}
