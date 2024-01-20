public class Switch2ndWay {
    public static void main(String args[]){
        String sky = "Sun";
        switch (sky) {
            case "Moon":
                System.out.println("Night"); 
                break;
            case "Sun":
                System.out.println("Day");
                break;
            case "Both":
                System.out.println("Evening");
                break;
            default:
                break;
        }
    }
}
