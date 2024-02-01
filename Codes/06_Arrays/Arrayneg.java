public class Arrayneg {
    public static void main(String args[]){
        int arr[][] = {{3,-5,9},{-1,2,7},{-8,-7,1}};
        for (int row = 0; row< arr.length;row++){
            System.out.println();
            for(int col = 0;col < arr.length;col++){
                if(arr[row][col]> 0){
                    System.out.print(arr[row][col] + " ");
                }
                else{
                    System.out.print("0 ");
                }
            }
        }
    }
}
