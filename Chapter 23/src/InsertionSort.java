
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6};
        for (int j : InsertionSort.arr) {
            System.out.println(j + " ");
        }
    }

    public static void InsertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {.
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                System.out.println(k + 1 + " No Index= " + list[k]);
            }
            list[k + 1] = currentElement;
            System.out.println(k + 1 + " No Index= " + currentElement);
        }
        return list;
    }

}
