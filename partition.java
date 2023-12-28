import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int partitionSize = 2;
        int[] partitionOrder = {3, 2, 1};

        List<List<Integer>> partitions = partitionArray(array, partitionSize);
        List<List<Integer>> rearrangedPartitions = rearrangePartitions(partitions, partitionOrder);
        int[] mergedArray = mergePartitions(rearrangedPartitions);

        System.out.println(Arrays.toString(mergedArray));
    }

    private static List<List<Integer>> partitionArray(int[] array, int partitionSize) {
        List<List<Integer>> partitions = new ArrayList<>();

        for (int i = 0; i < array.length; i += partitionSize) {
            int end = Math.min(i + partitionSize, array.length);
            List<Integer> partition = new ArrayList<>();
            for (int j = i; j < end; j++) {
                partition.add(array[j]);
            }
            partitions.add(partition);
        }

        return partitions;
    }

    private static List<List<Integer>> rearrangePartitions(List<List<Integer>> partitions, int[] partitionOrder) {
        List<List<Integer>> rearrangedPartitions = new ArrayList<>();

        for (int order : partitionOrder) {
            rearrangedPartitions.add(partitions.get(order - 1));
        }

        return rearrangedPartitions;
    }

    private static int[] mergePartitions(List<List<Integer>> partitions) {
        List<Integer> mergedList = new ArrayList<>();

        for (List<Integer> partition : partitions) {
            mergedList.addAll(partition);
        }

        return mergedList.stream().mapToInt(Integer::intValue).toArray();
    }
}
