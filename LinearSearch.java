public class LinearSearch {
    public static int linear_search(int[] haystack, int needle) {
        for (int i=0; i<haystack.length; i++) {
            if (haystack[i] == needle) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] haystack = {0, 11, 22, 33, 44, 55, 66, 77, 88, 99};

        System.out.println(linear_search(haystack, 71));
        System.out.println(linear_search(haystack, 77));
        System.out.println(linear_search(haystack, 11));
    }
}
