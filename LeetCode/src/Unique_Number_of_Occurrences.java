import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        Set<Integer> occurrences = new HashSet<>();

        for (final int a : arr)
            count.merge(a, 1, Integer::sum);

        for (final int value : count.values())
            if (!occurrences.add(value))
                return false;

        return true;
    }
}