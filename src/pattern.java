public class pattern {
    public static void main(String args[]){

        // [1] solid pattern
        /*int n=4;
        int m=5;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
            System.out.print('*');
        }
        System.out.println();
         }*/

         //[2] hollow pattern
        /* int l=4;
         int k=5;

         for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++ ){
                // cell -> (i,j)
                if(i==1 || j==1|| i==l || j==k){
                    System.out.print(" *");
                }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }*/

            //[3] half piramid

           /* int n=4;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }*/

           //[4] inverted half piramid
         /* int n=4;
           for(int i=n; i>=1; i--){
           for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
           }*/


            //[5] inverted half piramid (180) rotate
          /* int n=4;

           for(int i=1; i<=n; i++){
            // inner loop for space mate
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                // inner loop star print
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
           }*/

           // [6] half pyramid with number

        /*  int n=5;
           for(int i=1; i<=n; i++){
               for(int j=1; j<=i; j++){
                System.out.print(j+" ");
               }
               System.out.println();
           }*/

             // [7]invrted half pyramid with number

            /*  int n=5;

             for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print(j);
                }
                System.out.println();
             }*/


             // [8] floyd pattern
             /*int n=5;
             int number=1;

             for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(number+" ");
                    number++;
                }
                System.out.println();
             }*/

             // [9] 0-1 triangle



             /*int n=5;

             for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    int sum= i+j;
                    if(sum %2 == 0) { ///even
                        System.out.print("1 ");
                    }
                    else {   // odd
                        System.out.print("0 ");
                    }
                    
                }
                System.out.println();
                
             }*/

             /*int n = 5;
             for (int i = n; i >= 1; i--) {
                 for (int j = 1; j <= n-i; j++) {
                     System.out.print(" ");
                 }
                 for (int k = 1; k <= i; k++) {
                     System.out.print("*");
                 }
                 System.out.println();
             }

       /*  int H=4;
        int m=5;
        
        for(int i=1; i<=H; i++){
            for(int j=1; j<=m; j++){
            System.out.print('*');
        }
        System.out.println();
         }*/


        /* int n=4;
         
         for(int i=0; i>=n; i--){
              for(int j=1; j<=n-1; j++)
              System.out.print("a");
         }
         System.out.println();*/



        

         /*int n=8;
         
         for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("a");
            }
            System.out.println();
        }
         }*/

         
         /*int n=4;
         int number=1;
         

         for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
            
         }*/


         int n=5;
         int m=6;
         
;         

         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if(sum %2== 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
             }
             System.out.println();
         }

         


         


         

         


         
        }

    }
        
    
         
        

        




    
    
