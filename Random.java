import java.util.Random;

public class Random {

    public static void main(String[] args) {
        

        Random r = new Random();
        
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.err.println(result);
    }
    
}
