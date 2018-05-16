public class HelloWorld{

     public static void main(String []args){
       int [] arr={4,1,3,2,5,7,6,9,100,10};
       int len=arr.length;
       selectionSort(arr,len);
       for(int i=0;i<len;i++)
       {
           System.out.println(arr[i]);
       }
       
     }
     public static void selectionSort(int [] arr, int len)
     {
         for(int i=0;i<len-1;i++)
         {
             int minIndex=i;
             for(int j=i+1;j<len;j++)
             {
                 if(arr[j]<arr[minIndex])
                 {
                     minIndex=j;
                     
                 }
                 
             }
             int temp=arr[minIndex];
                     arr[minIndex]=arr[i];
                     arr[i]=temp;
         }
     }
}