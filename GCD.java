public class GCD{
int c; int r;
    public int findGCD(int a,int b)
    {
        if(a>b)
        {
            
            r=a%b;
            if(r==0)
            {
                System.out.println(r + "is the remainder");
            }
            else
            {
                a=n;
                b=r;
                findGCD(a,b);
            }
        }
        else{
            System.out.println("a is smaller than b");
        }
        return r;
    }
    public static void main(String args[])
    {
        int a=5, int b=3;
        findGCD(a,b);

    }
}