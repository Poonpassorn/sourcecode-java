
public class PrimeFactor {

    public String of(int number) {
        /*
         * 4 => 22 4%2 == 0 -> 2 4/2  => 2 2%2 == 0 -> 2
         */
        String result = "";
        int start = 2;
        while (number > 1) {
            while (number % start == 0) {
                result = result + start;
                number = number / start;
            }
            start++;
        }
        return result;
    }

}
