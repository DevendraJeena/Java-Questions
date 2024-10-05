public class FindMinMaxOfMatrix {
    
    public static void main(String[] args) {
        
        
        int [][]arr= {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}

        };
        
        int min , max ;
        if(arr[0][0]>arr[0][1]){
            max = arr[0][0] ;
            min = arr[0][1];
          }else{
              min = arr[0][0];
              max = arr[0][1];
              
          }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
                else if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }

        System.out.println("max :"+ max);
        System.out.println("min :"+ min);


       
        }
    }

