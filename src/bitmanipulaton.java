import java.util.Scanner;

public class bitmanipulaton {
    public static void main(String[] args) {
        // 1. Get manipulation
       /*  int n=5;
        int pos=2;
        int bitmask= 1<<pos;

        if((bitmask & n)== 0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }*/

        // 2 set manipulation
      /*  int n=5;
        int pos=1;
        int bitmask= 1<<pos;

        int newnumber = bitmask | n ;
        System.out.println(newnumber);*/

        // 3 clear manipulation
        /*int n=5;
        int pos=2;
        int bitmask= 1<<pos;
        int notbitmask = ~(bitmask);

        int newnumber = notbitmask & n;
        System.out.println(newnumber);*/

        // 4 update manipulation
        Scanner sc = new Scanner(System.in);
        int oper =sc.nextInt();
        int n=5;
        int pos=1;
         // upadte bit 1 else update  bit to 0
         int bitmask = 1<<pos;
        // set oper
        if(oper == 1){
           
            int newnumber = bitmask | n;
            System.out.println(newnumber);

        }
        else{
            // clear oper
            int newbitmask = ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);
        }
       }
    
}
