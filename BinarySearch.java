public class BinarySearch {

    public static int binary_search(int[] haystack, int needle) {
        int low = 0;
        int high = haystack.length;
        int middle, v;

        do {
            middle = low + (high - low) / 2;
            v = haystack[middle];

            if (v == needle) {
                return middle;
            } else if (v > needle) {
                high = middle;
            } else {
                low = middle + 1;
            }
        } while (low < high);

        return -1;
    }

    public static void main(String[] args) {
        int[] x = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println(binary_search(x, 12));
    }
}
