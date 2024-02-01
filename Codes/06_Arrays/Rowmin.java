public class Rowmin {
    public static void main(String args[]){
        int arr[][] = {{3,-5,9},{-1,2,7},{-8,-7,1}};
        for (int row = 0; row< arr.length;row++){
            System.out.println();
            int min = arr[row][0];
            for(int col = 0;col < arr.length;col++){
                if(min>arr[row][col]){
                    min = arr[row][col];
                }

               
            }
            System.out.println(min);
        }
    }
}
