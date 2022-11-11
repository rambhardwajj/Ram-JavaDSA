public class ArrayCC
{
    public static int LinearSearch(int [] a, int key)
    {
        int n = a.length;
        for(int i = 0 ; i<n ; i++)
        {
            if(a[i]== key)
            {
                return i;
            }
        }
        return -1;
    }

    public static int Binarysearch(int a[], int key)
    {
         int s=0;
         int e=a.length -1;
            while(s<=e)
            {
                int mid = (s+e)/2;
                if(a[mid] == key)
                {
                    return mid;
                }
                else if ( a[mid] < key)
                {
                    s= mid+1;
                }
                else
                {
                    e= mid-1;
                }
            }
        return -1;
    }
       


    public static void reverse(int a[])
    {
        int s=0;
        int e=a.length-1;
        while(s<=e)
        {
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    public static void print(int a[])
    {
        for (int i =0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
    }
    

    public static void PrintallPairs(int a[])
    {
        // simple 
        for(int i =0; i< a.length ; i++)
        {
            int curr= a[i];
            for(int j = 0 ; j<a.length; j++)
            {
                System.out.print("(" + curr + "," + a[j] + ")");
            }
            System.out.println(" ");
        }
    }
    public static void PrintUniquePairs(int a[])
    {
        // simple 
        for(int i =0; i< a.length ; i++)
        {
            int curr= a[i];
            for(int j = i+1 ; j<a.length; j++)
            {
                System.out.print("(" + curr + "," + a[j] + ")");
            }
            System.out.println(" ");
        }
    }

    public static int TrapRainwater(int a[])
    {
        int n = a.length;
         int RM[] = new int[n];
         int LM[] = new int[n];
         RM[n-1]= a[n-1];
         LM[0]= a[0];
         for (int i=1; i<n ; i++)
         {
            LM[i]= Math.max(LM[i-1], a[i]);
         }
         for(int i = n-2 ; i>=0; i--)
         {
            RM[i]= Math.max(RM[i+1], a[i]);
         }
         int TW=0;
         for(int i = 0 ; i<n ; i++)
         {
            int WL = Math.min(RM[i], LM[i]);
            TW =TW + (WL-a[i]);
         }
         return TW;
    }


    public static int maxprofit(int a[])
    {
        int bp = Integer.MAX_VALUE;
        int maxprofit = 0 ;
        
        for (int i=0; i<a.length; i++)
        {
            if(bp > a[i])
            {
                bp = a[i]; 
            }
            else if (bp < a[i])
            {
                int profit = a[i] -bp ;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }


    // BUBBLE SORT
    // SELECTION SORT
    // INSERTION SORT
    // COUNTING SORT
        

    public static void main( String args [])
    {
        int a[]= { 8,4,8,9,5,8};
        System.out.print(maxprofit(a));
    }
}