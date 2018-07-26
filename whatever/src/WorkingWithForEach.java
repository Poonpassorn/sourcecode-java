
public class WorkingWithForEach {

    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5 };
        // Old way
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        // For each
        for (int i : number) {
            System.out.println(i);
        }

    }

}
