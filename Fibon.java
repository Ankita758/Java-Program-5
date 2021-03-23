class Fibon
{
        public static void main(String args[])
        {
                    char ch=args[0].charAt(0);
                    int n=Integer.parseInt(args[0]);
                    int i,f1=0,f2=1,f3;
                    System.out.println("The Fibonacci Series containing "+n+" numbers is:");
                    System.out.print(f1);
                    System.out.print(" ");
                    System.out.print(f2);
                    System.out.print(" ");
                    for(i=1;i<=n-2;i++)
                    {
                            f3=f1+f2;
                            System.out.print(f3);
                            System.out.print(" ");
                            f1=f2;
                            f2=f3;
                    }
            }
} 





