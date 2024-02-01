public class ArrayDia {

    public static void main(String args[]){
        int arr[][] = {{1,2,3},{1,2,3},{1,2,3}};
        for (int row = 0; row< arr.length;row++){
            System.out.println();
            for(int col = 0;col < arr.length;col++){
                if(row == col || row< col){
                    System.out.print(arr[row][col] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
    }
}