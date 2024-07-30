import java.util.Scanner;


/*[1] public class Practice {
    public static int average(int a,int b, int c){
        int avg= (a+b+c)/3;
        return avg;
    }
    
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.print("The Average is "+average(a, b, c));
    }
}*/

/* [2] public class Practice {
    public static void printsum(int n){
        int sum=0;

        for(int i=1; i<=n;i++){
            if(i%2!=0){
                sum= sum+i;
            }
        }
            System.out.println(sum);

        }
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        printsum(n);
    }
}*/

 /*  [3]  public class Practice{
     public static int getgrater(int x,int y){

        if(x>y){
           return x;
        }
        else{
            return y;
        }
     }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        System.out.println(getgrater(x, y));

    }
}*/

/* [4] public class Practice{
    public static double getcircumference(Double radius){
        return 2* 3.14 * radius;
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       Double radius= sc.nextDouble();
       
       System.out.println(getcircumference(radius));

   }}*/

   /*[5] public class Practice{
    public static Boolean iseligable(int a){
        
        if(a>18){
            return true;
        }
        else{
           return false;
        }
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
       
       System.out.println(iseligable(a));

   }}*/

   /*[6] public class Practice{

    public static void main(String[] args) {
         int positive=0, negative=0, zeros=0;
         System.out.println("Press 1 to continue amd 0 to stop");
          
        Scanner sc= new Scanner(System.in);
       int input= sc.nextInt();

       while (input==1) {
        System.out.println("Enter your number: ");
        int number= sc.nextInt();
        if(number>0){
            positive++;
        }
        else if(number<0){
            negative++;
        }
        else{
            zeros++;
        }
        System.out.println("Press 1 to continue amd 0 to stop");
         number= sc.nextInt();
         System.out.println("Positives "+positive);
         System.out.println("Negatives "+negative);
         System.out.println("Zeros "+zeros);


        }
        
       }}*/

       /* X TO THE POWER OF X REST TO N */

      /* [8] public class Practice{

        public static void main(String[] args) {
            System.out.println("Enter x: ");
            Scanner sc= new Scanner(System.in);

            int x= sc.nextInt();
            System.out.println("Enter n: ");
            int n= sc.nextInt();

            int result= 1;

            for(int i=0; i<n; i++){
                result = result *x;
            }
            System.out.println("x to the power of n is: "+ result);

        }}*/

        /* GRATER COMMON DIVISOR VALUE PROGRAM */

          public class Practice{

            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                int n1= sc.nextInt();
                int n2= sc.nextInt();

                while(n1!=n2){
                    if(n1>n2){
                        n1= n1-n2;
                    }
                    else{
                        n2=n2-n1;
                    }
                }
                System.out.println("GCD is: "+ n2);


            }}

            /* FIBONACI SERIES PROGRAM */
          
           /* [10] public class Practice{

                public static void main(String[] args) {
                    Scanner sc= new Scanner(System.in);
                    int n= sc.nextInt();

                    int a=0, b=1;

                    System.out.println(a + " ");

                    if(n>1){
                        for(int i=2; i<=n; i++ ){
                            System.out.println(b +" ");

                            int temp =b;
                            b= a+b;
                            a= temp;

                        }
                        System.out.println();
                    }
                }
            }*/



