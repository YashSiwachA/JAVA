public class Sumoffloat {
    public static void main(String[] args) {
        
        float arr[] = {2.1f,2.52f,30.54f,8.85f,8.525f};
        float sum = 0;
        for(float i:arr){
            sum+= i;
        }
        System.out.println(sum);
    }
}
