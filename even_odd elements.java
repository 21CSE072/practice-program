public class Main{
    public static void main(String[] args) {
        int[] inputArray = {10, 3, 5, 12, 17, 22};
        int[] evenArray = getEvenElements(inputArray);
        int[] oddArray = getOddElements(inputArray);
        System.out.print("Even Array: ");
        printArray(evenArray);
        System.out.print("Odd Array: ");
        printArray(oddArray);
    }
    private static int[] getEvenElements(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                count++;
            }
        }
        int[] evenArray = new int[count];
        int index = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenArray[index++] = element;
            }
        }
        return evenArray;
    }
    private static int[] getOddElements(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                count++;
            }
        }
        int[] oddArray = new int[count];
        int index = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                oddArray[index++] = element;
            }
        }
        return oddArray;
    }
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
