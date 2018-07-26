
public class Sort {

    public int[] of(int[] input) {
        int tmp;

        int count = 1;
        while (count > 0) {
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    tmp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = tmp;
                    count++;
                }
            }
        }

        return input;
    }

}
