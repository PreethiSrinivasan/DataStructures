public class HelloWorld{

     public static void main(String []args){
       int [] arr={1,2,5,4};
       int len=arr.length;
       int item=5;
       insertionSort(arr,len);
       for(int i=0;i<len;i++)
       {
           System.out.println(arr[i]);
       }
            int result = binarySearch(arr, item);
            System.out.println("found at" +result);
       
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
             arr[j+1]=cur;
            
         }
     }
     public static int binarySearch(int [] arr, int item)
     {
         int start=0;
         int end=arr.length-1;
        
         
         while(start<=end)
         {
             int mid=(start)+(end-start)/2;
            if(arr[mid]==item)
            {
                
                return mid;
            }
            else if(arr[mid]<item)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
         }
         return -1;
         
     }

}