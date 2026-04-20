import java.util.*;
public class Array {
    public static void reversed(int array[]){
        int first = 0, last = array.length-1;
        while ( first < last) {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
            
        }
    }
    public static void main(String[] args){
        int array[] ={2,3,4,5,6,7,8,9,10};
        reversed(array);
        for(int i =0; i < array.length; i++){
            System.err.print(array[i] +" ");
        }
        System.err.println();
    }
}
