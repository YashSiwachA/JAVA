public class Borderele {

    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        for (int row = 0; row< arr.length;row++){
            System.out.println();
            for(int col = 0;col < arr.length;col++){
                if (row == 0 || row == arr.length - 1){
                    
                    System.out.print(arr[row][col] + " ");
                }
                else{
                    if(col == 0 || col == arr.length - 1){
                        System.out.print(arr[row][col] + " ");}
                    else{

                    System.out.print("  ");}
                }
            }
        }
    }
}