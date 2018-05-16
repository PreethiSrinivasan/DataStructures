public class HelloWorld{

     public static void main(String []args){
       int [] arr={4,1,3,2,5,7,6,9,100,10};
       int len=arr.length;
       bubbleSort(arr,len);
       for(int i=0;i<len;i++)
       {
           System.out.println(arr[i]);
       }
       
     }
     public static void bubbleSort(int [] arr, int len)
     {
         for(int i=0;i<len-1;i++)
         {
             for(int j=0;j<len-i-1;j++)
             {
                 if(arr[j]>arr[j+1])
                 {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
     }
}