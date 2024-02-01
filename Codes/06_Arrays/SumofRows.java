public class SumofRows {
    public static void main(String args[]){
        int arr[][] = {{3,-5,9},{-1,2,7},{-8,-7,1}};
        for (int row = 0; row< arr.length;row++){
            int sum = 0;
           for(int col = 0; col<arr.length;col++){
                sum += arr[row][col];
           }
           System.out.println(sum);
        }
    }
}
