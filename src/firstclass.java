import java.util.Scanner;

class FirstClass{
    public static void main(String args[]){

        //OUTPUT MATE
        /*System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");*/

        //VARIABLE HOW  CAN USE
        /*int a=10;
        int b=25;
        int sum=a+b;
        System.out.println(sum);

        int div =a / b;
        System.out.println(div);*/

        // USER THI INPUT LEVA MATE
        //ADD TWO NUM    

        //Scanner sc=new Scanner(System.in);
        /*int a= sc.nextInt();
        int b= sc.nextInt();
        int sum =a+b;
         System.out.println(sum);
        
        String name=sc.next();
        nextline();
        nextInt();
        nextFloat();
        System.out.println(name);*/

        // CONDITIONAL STATEMENT USE

        /*Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
         else{
            System.out.println("not adult");
        }*/

        // CHECK NUM EVEN OR ODD

       /*  Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();

        if(x % 2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }*/

        // CONDITION CHECK EQUAL EVEN AND ODD

        /*Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        if(a==b){
            System.out.println("equal");
        }
        else{
            if(a%b==0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
         }*/

       /* Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        if(a==b){
            System.out.println("equal");
        }
        else if(a>b){
            System.out.println("even");
        } 
        else{
            System.out.println("odd");
        }*/

        /*Scanner sc= new Scanner(System.in);
        int button =sc.nextInt();*/

        /*if(button==1){
            System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("namste");
        }
        else if(button==3){
            System.out.println("bonjour");
        }
        else{
            System.out.println("invalid button");
        }*/

        /*switch (button) {
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("Namste");
            break;
            case 3:System.out.println("bonjomor");
            break;
            default:System.out.println("invalid button");
            

        }*/

        // FOR LOOP 
        // i = i+1 => i++

        /*for(int i=0; i<11; i++){
           System.out.println(i);
        }*/

        // WHILE LOOP
        
        /* int i=0;
        while (i<11) {
            System.out.println(i);
            i=i++;
        }*/

        // DO WHILE LOOP

       /*  int i=0;
        do{
            System.out.println(i);
            i=i+1;
        } while(i<11);*/

       /* Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

       /*  int sum=0;
        for(int i=1; i<=n; i++){
            sum =sum+i;
            
        }
        System.out.println(sum);*/
        

        /*for(int i=1; i<11; i++){
            System.out.println(i+n); 
        }*/


        // String declration

        /*Scanner sc =new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println("your name is: "+ name);*/

        // concatenation
       /*  String firstname ="Meet";
        String lastname ="Sathvara";
        String fullname = firstname+lastname;

        //length check karva mate
        System.out.println(fullname.length());

        //charAt single character print karse
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }*/

        // compare string
        //String name ="beet";
        //String name2 ="Mhaumik";

        // 1 s1 > s2 : +ve value
        // 2 s1 = s2 : 0 value
        // 3 s1 < s2 : -ve value

       // name.compareTo(name2);
        //System.out.println(name.compareTo(name2));

        /*if(name.compareTo(name2)==0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }*/

        /*if(new String("Meet") == new String("Meet")){
            System.out.println("String are equal");
        }
        else{
            System.out.println("string are not equal");
        }
        */

        // substring

       // String sencence ="My name is Meet sathvara";
       // String name = sencence.substring(11);
        //String name2 = sencence.substring(11,14);

        //System.out.println(name2);

        // String are imutable always remainder

        // string mathi int karva mate
        // parseint method of integer class
          /*String str = "123";
          int number = Integer.parseInt(str);
          System.out.println(number);*/


          // int mathi string convert karva
          /*int number = 123;
          String str = Integer.toString(number);
          System.out.println(str.length());*/


          /*Scanner sc =new Scanner(System.in);
          int size = sc.nextInt();

          String [] array = new String[size];
          int totLength =0;

          for(int i=0; i<size; i++){
            array[i]= sc.next();
            totLength += array[i].length();

          }
          System.out.println(totLength);*/

          // String builder how can use

         /*  StringBuilder sb =new StringBuilder("h");
          System.out.println(sb);

          // char at index 0
          System.out.println(sb.charAt(0));

          // set char at index 0
          sb.setCharAt(0,'n');
          System.out.println(sb);

          // insert 
          sb.insert(0,'s');
          System.out.println(sb);
          sb.insert(2,'s');
          System.out.println(sb);

         // delete
        // sb.delete(2, 3);
         //System.out.println(sb);

         // append end ma add karva 
        /*  sb.append("i");
         sb.append("r");
         sb.append("e");
         sb.append("n");
         System.out.println(sb.length());*/
         

         // reverse string lava mate
         /*StringBuilder sb =new StringBuilder("Meet");

         for(int i=0; i<sb.length()/2; i++){
            int front =i;
            int back = sb.length()-1-i; // 5-1-0 = > 4

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

         }
         System.out.println(sb);
          }*/
        }
        }

        
        


