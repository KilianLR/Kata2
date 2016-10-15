package kata2;
import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] vector = {2, 1, 3, 1, 4, 6, 100, 100, 2, 100};
        
        Histogram histo = new Histogram(vector);
        
        HashMap<Integer, Integer> histogram = histo.getHistogram();
        
        for (int key : histogram.keySet()) {
            System.out.println(key + " -> " + histogram.get(key));
        }
    }
}

