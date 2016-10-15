package kata2;
import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        String[] vector = {"Yo", "Tú", "Paprika", "Paprika", "Nestlé", "Tú", "Tú"};
        
        Histogram histo = new Histogram(vector);
        
        HashMap<Object, Integer> histogram = histo.getHistogram();
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + " -> " + histogram.get(key));
        }
    }
}
