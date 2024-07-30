import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class code {
    public static void main(String[] args) {

      /*  Program-1 [Swap two number]
         int a=10, b=20;

        System.out.println("before swapping number.."+a+"  "+b);

        
        //Logic-1 Third variable
        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping number.."+a+"  "+b);

        // Logic-2 Use  + & - without using third variable

        a=a+b;  // 10+20=30
        b=a-b;  // 30-20=10
        a=a-b;  // 30-10=20

        // Logic-3 Use  * & / without using third variable
        // a and b should not zero

        a=a*b;  // 10*20=200
        b=a/b;  //200/20=10
        a=a/b;  //200/10=20

        // Logic-4 bitwise XOR (^)

        a=a^b; //30
        b=a^b;  //10
        a=a^b;  //20

        //Logic-5 Single statement

        b=a+b-(a=b); //  30-20=10*/


      //Program-2. [Reverse number]

     /*  Scanner sc =new Scanner(System.in);
    
      System.out.println("Enter a number: ");

      int num= sc.nextInt();

      // 1st method Using algorithm

      /*int rev=0;
      while (num!=0) {
        rev= rev*10+num%10;
        num = num/10;
        }
      System.out.println("Reverse number is: "+rev);*/

      //  2nd Method using Stringbuffer class

      /*StringBuffer sb= new StringBuffer(String.valueOf(num));
      StringBuffer rev= sb.reverse();
      System.out.println("Reverse number is: "+rev);

      // 3rd method using StringBuilder class

      StringBuilder sn= new StringBuilder();
      sn.append(num);
     StringBuilder rev= sn.reverse();
      System.out.println("Reverse number is: "+rev);*/

      // Program-3 [Reverse Steing] USing concatenation operator

      /*String str= "Bhaumik";
      String rev= "";

      int len= str.length(); // 4
      
      for(int i=len-1; i>=0; i--){ //3
        rev= rev+str.charAt(i); // D
      }
      System.out.println("revese String: "+rev);

      // 2nd method using character array

      char a []= str.toCharArray();
      int len =a.length; //4 

      for(int i=len-1; i>=0; i--){
        rev= rev+a[i];
      }
      System.out.println("revese String: "+rev);

      // 3rd method using Stringbufffer
      StringBuffer sb= new StringBuffer(str);
      System.out.println(sb.reverse());

     // Program-4 [Palindrome number]

     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the Number");

     int num= sc.nextInt();
     int org_num= num;
     int rev=0;

     while (num!=0) {
      rev= rev*10+ num%10;
      num= num/10;
    }
    if(org_num==rev){
      System.out.println(org_num+" palindrome number");
    }
    else{
      System.out.println(org_num+" not palindrome number");
    }

    // palindrome String [MADAM]=> [MADAM]

    Scanner sc =new Scanner(System.in);
     System.out.println("Enter a string");

     String str= sc.next();
     String org_str= str;
     String rev="";

     int len= str.length(); // 4
      
      for(int i=len-1; i>=0; i--){ //3
        rev= rev+str.charAt(i); // D
      }
      if(org_str.equals(rev)){
        System.out.println(org_str+" Palindrome String");
      }
      else{
        System.out.println(org_str+ "not a Palindrome String");
      }

      program-5 [count number it how many diigit in number]

      int num=1234567;
      int count=0;

      while (num>0) {
        num= num/10;
        count++;
      }
      System.out.println(count);


      //program-6 [given numbe odd & even number]

      int num= 134567;
      int even_count =0;
      int odd_count =0;

      while (num>0) { //134567
       int rem= num%10; // 7
       if(rem %2==0){ 
        even_count++;
       }
       else{
        odd_count++; //1
       }
    num= num/10; //13456
       }

      System.out.println("Even number"+ even_count);
       System.out.println("Odd number"+ odd_count);

       // program-7 [sum of given number]
       
       int num=1578;
       int sum=0;

       while (num>0) {
        sum=sum+num%10; // 0+8
        num= num/10; // 157
       }
       System.out.println("sum of nummber"+sum);   
       
      // program -8[ Largest number find]     
      
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter first number");
      int num1= sc.nextInt();

      
      System.out.println("Enter second number");
      int num2= sc.nextInt();
 

    
      System.out.println("Enter third number");
      int num3= sc.nextInt();
      
      /*if(num1>num2  && num1>num3){
        System.out.println("Largest number"+num1);
      
      }else if (num2>num1 && num2>num3) {
        System.out.println("Largest number"+num2);
      
      } else {
        System.out.println("Largest number"+num3);
      }

      
      // Ternary operator use 
     // int largest= num1>num2?num1:num2;  // 10>20 ? 20
      //int largest2= num3>largest?num3:largest;; // 30>50 ? 30

      int largest = num3>(num1>num2?num1:num2)? num3:(num1>num2?num1:num2);
                  // 103>(75)?103:(75)
      System.out.println(largest);


      // program-9 [fibonacci series]
      
      int num= 10,n1=0, n2=1, sum=0;

      System.out.println("Fibonacci series in 10 terms: ");

      for(int i=1; i<num; i++){
      
       System.out.println(n1+", ");
        sum= n1+n2;
       n1=n2;
       n2=sum;*/

      

      // program-10 [prime number]

     /* int num=19;
      int count=0;

      if(num>1){
        for(int i=1; i<=num; i++)
          if(num%i==0){
            count++;
          }
          if(count==2){
            System.out.println("Prime number");
          }
          else{
            System.out.println("Not a prime number");
          }
        }
        else{
        System.out.println("not a prime number");
      }*/


      // program-11 [Generate random number and  string]

     /*  Random rand =new Random();
      for(int i=1; i<=10; i++){
     int rand_int= rand.nextInt(i);
     System.out.println(rand_int);
      }

      // String rand_num= RandomStringUtils.randomnNumeric(5);

    double rand_dbl= rand.nextDouble(); // Range 0.0 to less than 1.0
     System.out.println(rand_dbl);*/


     //String rand_num= RandomStringUtils.randomNumeric(5);
     //System.out.println(rand_num);

      // program-12 [Factorial number]

      /*int num=6;

      long Factorial =1;

      for(int i=1; i<=num; i++){
        Factorial =Factorial * i;
      }
      System.out.println(Factorial);*/


      // program-13 [ sum of given Array num]

     /*  int a[] = {5,7,9,4,2};
      int sum = 0;
      for(int i=0; i<=a.length-1; i++)
      {
        sum =sum+a[i];
        

      }
      System.out.println(sum);

    // 2nd way Array sum

      int a[] = {5,7,9,4,2,7};
      int sum = 0;
      for(int valueOf: a)
      {
        sum =sum+valueOf;
        

      }
      System.out.println(sum);

      // program-14 [ Even and odd num print given array]

      int a[] = {1,2,3,4,5,6};

      for(int i=0; i<=a.length-1; i++){

         if(a[i]%2==0)
          System.out.println("Even num"+ a[i]);
        } 

      for(int i=0; i<=a.length-1; i++){

          if(a[i]%2!=0)
           System.out.println("odd num:"+a[i]);
          } 

          / 2nd way 

          int a[]= {1,12,45,9,4,8,36,29,38};
        
          for(int valueOf: a){
            if(valueOf%2==0){
            System.out.println("even: " +valueOf);}
            else{
              System.out.println("odd: "+ valueOf);}
            }

            program-15 [ two Array are Equal or not check]

            int a1[]= {1,2,3,4,5};
            int a2[]= {1,2,3,4,5};

            boolean status =Arrays.equals(a1,a2);

            if(status == true){
              System.out.println("Array are euqal");
            }
            else{
              System.out.println("Array are not equal");
            }

            // 2nd way Array equality
            boolean status =true;

            if(a1.length == a2.length){

              for(int i=0; i<a1.length; i++){
                if(a1[i]!= a2[i]){
                  status = false;
                }
                
              }
            }
            else{
              status = false;
            }


            if(status == true){
              System.out.println("array are equal");
            }
            else{
              System.out.println("Arra not equal");
            }*/



           
      

      


 
        
        
      






      




      
      

     

    }}

      
      
     

      

      

 




      


























     
    
    

