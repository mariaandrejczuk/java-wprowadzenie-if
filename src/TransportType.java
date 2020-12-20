public class TransportType {
    public static void main(String[] args) {
        int distance;
        distance = 2000000;

        if(distance <= 300) {
            System.out.println("Go on foot");
        } else if(distance <= 2700) {
            System.out.println("Choose a bike");
        } else if(distance <= 1000000) {
            System.out.println("Go by car");
        } else {
            System.out.println("Go by plane");
        }
    }
}
