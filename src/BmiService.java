public class BmiService {
    public int calculate(float height, int weight) {
        int result = (int) (weight / (Math.pow((height / 100), 2)));
        return result;
    }

}
