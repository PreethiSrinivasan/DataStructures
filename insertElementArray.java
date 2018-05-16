import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int arr[] = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
       int len=arr.length;
       int item=3;
       insertElement(arr,item);
     
       }
       
      
     public static void insertElement(int [] arr, int val)
     {
         for(int i = arr.length - 1; i > 0; i--) {
        if (arr[i] == 0) continue; /
        arr[i + 1] = arr[i];       
        if (arr[i] <= val) {       
            arr[i] = val;          
            break;                 
        }
    }
    System.out.println(Arrays.toString(arr));
}
    
}
     