/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class HeapSort {
    public static <E extends Comparable<E>> void heapSort(E[] list){
        Heap<E> heap=new Heap<>();
        for(int i=0; i<list.length;i++){
            heap.add(list[i]);
        }
        for(int i=list.length-1;i>=0;i--){
            list[i]=heap.remove();
    }
    
    }
    public static void main(String[] args) {
        Integer[] list={
    }
}
