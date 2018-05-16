public class HelloWorld{

     public static void main(String []args){
       int [] arr={4,1,3,2,5,7,6,9,100,10};
       int len=arr.length;
       insertionSort(arr,len);
       for(int i=0;i<len;i++)
       {
           System.out.println(arr[i]);
       }
       
     }
     public static void insertionSort(int [] arr, int len)
     {
         for(int i=1;i<len;i++)
         {
             int j=i-1;
             int cur=arr[i];
             while(j>=0 && arr[j]>cur)
             {
                 arr[j+1]=arr[j];
                 j=j-1;
             }
             arr[j+1]=curr;
            
         }
     }
}