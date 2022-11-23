import java.util.Scanner;


public class Main { 
    

    public static void main(String args[]) {
        
    
        Scanner scan = new Scanner(System.in) ;
        System.out.println("pls enter the array size: ");
        int l = scan.nextInt();
		int[] arr = new int[l];


        System.out.println("pls enter the array: ");
        for (int i = 0; i < l; i++) {
        int b = scan.nextInt();
        arr[i] = b;
       
        }

       int max=arr[0]; //int min=arr[0];
       fm(arr,max);  // fm(arr,min); 
     
    }

    public static void fm(int[] arr1,int max1){ 

        for(int j=0;j<arr1.length;j++){
        
            if(max1<arr1[j]){  //if(min1>arr1[j]) { 
                               //min1=arr1[j];
            max1=arr1[j];

         }
        } 
        System.out.println("the max num in arr is "+max1);
       

    }
   
}