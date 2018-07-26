
public class FizzBuzz {
    public String sendAndReturn(int number) {
        String result = "";
        if (หาร3ลงตัว(number)) {
            result = result + "Fizz";

        }
        if (หาร5ลงตัว(number)) {
            result = result + "Buzz";

        } else if (หาร3และ5ไม่ลงตัว(number)) {
            result = String.valueOf(number);
        }

        return result;
    }

    private boolean หาร3และ5ไม่ลงตัว(int number) {
        return (number % 3 != 0) && (number % 5 != 0);
    }

    private boolean หาร5ลงตัว(int number) {
        return number % 5 == 0;
    }

    private boolean หาร3ลงตัว(int number) {
        return number % 3 == 0;
    }
}
