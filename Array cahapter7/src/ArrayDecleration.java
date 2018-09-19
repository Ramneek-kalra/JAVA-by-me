
public class ArrayDecleration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array index start from 0 zero
        // Array is fixed in size
        // Array work with homogenius (same type like int or string or double) data

        int[] x = new int[2]; //one or single dimentional erray
        x[0] = 10;
        x[1] = 25;

        System.out.println("x[0]: " + x[0]);
        System.out.println("x[1]: " + x[1]);

        for (int i:x) {           //use to easily print one or single dimentional erray
            System.out.println(i);
        }
        
        int p[]= {10, 4, 45, 98, 1, 32, 5};
        System.out.println("Length of p: "+p.length);
        
        for (int i : p){
            System.out.print(i+" ");    
        }
        
        System.out.println();
        //Single diementional Array
        int q[]=  {40,33,55,66,34};
         for (int j : q){
             System.out.println(j+" ");
       }
        
        
    }

}
