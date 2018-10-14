
import sun.security.util.Length;


public class QuickSort {
    public static void quickSort(int[] list) {
       quickSort(list,0,listlength-1);
    }
    public static void main(String[] args) {
        if(last>first){
            int piovtIndex= partition(list,first,last);
            QuickSort(list,first,piovtIndex-1);
            QuickSort(list,piovtIndex+1,last); 
        }
    }
}
