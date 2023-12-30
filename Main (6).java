class PrimeNumberFinder implements Runnable {
    private int start;
    private int end;

    public PrimeNumberFinder(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        System.out.print("Prime numbers from " + start + " to " + end + " : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeNumberFinder implements Runnable {
    private int start;
    private int end;

    public PalindromeNumberFinder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.print("Palindrome numbers from " + start + " to " + end + " : ");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
public class Main {
    public static void main(String[] args) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder(0, 10);
        PalindromeNumberFinder palindromeNumberFinder = new PalindromeNumberFinder(10, 50);
        Thread t1 = new Thread(primeNumberFinder);
        Thread t2 = new Thread(palindromeNumberFinder);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
