// Accept 5 numbers from command line argument and print it in the ascending order. (Use array)

import java.util.Arrays;
class Ascending{

    public void asc(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Numbers in increasing order : "+ Arrays.toString(arr));
    }
}
public class LineArgument3 {
    
    public static void main(String[] args) {
        
        if(args.length!=5){
            System.out.println("please provide exactly 5 input");
            return ;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4= Integer.parseInt(args[3]);
        int num5 =Integer.parseInt(args[4]);

        int arr[] = {num1,num2,num3,num4,num5};

        Ascending num = new Ascending();
        num.asc(arr);
    }
}
