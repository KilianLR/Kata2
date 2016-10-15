package kata2;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] vector = {2, 1, 3, 1, 4, 6, 100, 100, 2, 100};
        
        Histogram <Object> histogram = CalculateHistogram.computeHistogram(vector);
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + " -> " + histogram.get(key));
        }
    }
}
