import java.util.*;
public class javabasicsfoundations
{
 public static boolean IsPrime(int n)
 {
  if(n==2)
  {
    return true;
  }
  else
  {
    for (int i =2 ; i<n; i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
 }
  public static void PrimeinRange(int n)
  {
    for(int i =1 ; i<=n ; i++)
    {
      if(IsPrime(i))
      {
        System.out.print(i+" ");
      }
    }
  }

public static int avg5()
{
  int s=0;
  for (int i =0; i <5; i++)
  {
    Scanner sc= new Scanner (System.in);
  int n = sc.nextInt();
    s+=n;
  }
  int avg=s/5;
  return avg ;
}

// public static void Calculator();
// {
// // Use of Switch case
// Scanner sc = new Scanner (System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// char operator = sc.next().charAt(0);
// switch(operator)
// {
//   case '+' : System.out.print(a+b);
//   break;
//   case '-' : System.out.print(a-b);
//   break;
// }
// }

 public static void LeapOrNot(int year)
 {
  if(year%4==0)
  {
    if(year % 100!=0 || (year % 100==0 && year % 400==0))
    {
       System.out.print("leap");
    }
  else 
  {
  System.out.print("not leap");
  }
 }
 else
 { 
   System.out.print("not leap");
 }
 }

public static int Reverse(int n)
{
int rev=0;
  while(n>0)
  {
    int ld= n%10;
   rev= (rev*10) + ld;
    n=n/10;
  }
  return rev;
}


 public static int BintoDec(int binNum)
 {
  int pow=0;
  int mynum = binNum ;
  int decNum=0;

   while(binNum>0)
   {
     int ld=binNum%10;
     decNum= decNum + ( ld * (int)Math.pow(2, pow));
     pow++;
     binNum=binNum/10;        
   }
   return decNum;
 }

 public static int dectobin(int dec)
{
  int pow=0;
  int bin = 0;
   while ( dec>0 )
   {
     int rem = dec%2;
     bin = bin + (rem* (int)Math.pow(10, pow));
     pow++;
     dec=dec/2;
   }
   return bin;
} 
public static void main( String args[])
 {
  System.out.print(dectobin(7));
 }
}

