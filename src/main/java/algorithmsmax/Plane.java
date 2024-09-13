package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {

        int longestOcean = 0;
        int currentOcean = 0;

        for (char c : map.toCharArray()) {
            if (c == '0') {
                currentOcean++;
            } else {
                currentOcean = 0;
            }

            if (currentOcean > longestOcean) {
                longestOcean = currentOcean;
            }
        }

        return longestOcean;
    }
}
