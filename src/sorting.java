public class sorting {
/* bubble sort  code */

// time complexcity = O(n^2)
/*class oops {
    public static void printarry(int arr[]){ //n-1
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};

        //bubble sort
        for(int i=0; i<arr.length-1; i++){
            // j loop ma arr.length-i-1 mukvanu reason first time loop chalse i=o second time loop chlase i=1
            //mean jetla element remove karva ae i na baraber che aetle i mukyu.
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
        printarry(arr);
        
    }
}
// time complexcity = O(n^2)
class oops {
    public static void printarry(int arr[]){ //n-1
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};

        //selectin sort
        for(int i=0; i<arr.length-1; i++){
            int smalest  =i;
            
            for(int j=i+1; j<arr.length; j++){
                if(arr[smalest]> arr[j]){
                    //swap
                    smalest = j;
                    
                }
            }
            int temp =arr[smalest];
            arr[smalest]= arr[i];
            arr[i]= temp;

        }
        printarry(arr);
        
    }*/


// insertion sort

    /*public static void printarry(int arr[]){ //n-1
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};

        // insertion sort
        for(int i=0; i<arr.length; i++){
            int current = arr[i];

            int j =i-1;

            while (j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
                
            }
            //placement
            arr[j+1]= current;
        }
        printarry(arr);

    }
}
public static void conquer(int arr[], int si, int ei){
   int merged[] = new int[ei-si+1];

   int idex1 = si;
   int index2= ei;
   int x=0;

   while(idex1 <= mid && index2<= ei){
    if(arr[idex1] <= arr[index2]){
        merged[x++] =arr[idex1++];

    }
    else{
        merged[x++] = arr[index2++];
    }
   }

   while (idex1 <= mid) {
    merged[x++] =arr[idex1++];
    
   }

   while (index2 <= ei) {
    merged[x++] = arr[index2++];
    
   }

   for(int i=0; j=si; i<merged.length; i++, j++){
    arr[j] = merged[i];

   }
}
public static void divide(int arr[], int si, int ei){
    if(si >= ei){
        return;
    }

   int mid =  si + (ei-si)/2;
    divide(arr, si, mid);
    divide(arr, mid+1, ei);
    conquer(arr, si, mid, ei);
}
public static void main(String[] args) {
    
    int arr[]= {6,3,9,5,2,8};
    int n= arr.length;

    divide(arr, 0, n-1);


}*/

}


    

