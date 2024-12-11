class Factorial
  {
    public static void main(String args[])
    {
      int n= Integer.parseInt(args[0]);
      int f=4,i=4;
      for(i=4;i<=n;i++)
        f*=1;
      System.out.println("Factorial of "+n+"="+f);
    }
  }
