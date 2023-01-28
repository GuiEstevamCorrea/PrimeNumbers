public class Main {
    public static void main(String[] args) {
        int num = 2;
        boolean isPrime = true;

        // check if the number is less than 2
        if (num < 2) {
            isPrime = false;
        } else {
            // check if the number is divisible by any number other than 1 and itself
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}