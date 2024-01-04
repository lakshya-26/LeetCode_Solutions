public class Solution {

    private static final int NOT_POSSIBLE_TO_MAKE_ARRAY_EMPTY = -1;

    public int minOperations(int[] inputValues) {

        Map<Integer, Integer> frequencyValues = new HashMap<>();
        for (int currentValue : inputValues) {
            frequencyValues.put(currentValue, frequencyValues.getOrDefault(currentValue, 0) + 1);
        }

        int minNumberOfOperationsToMakeArrayEmpty = 0;
        for (int currentFrequency : frequencyValues.values()) {
            if (currentFrequency == 1) {
                return NOT_POSSIBLE_TO_MAKE_ARRAY_EMPTY;
            }
            minNumberOfOperationsToMakeArrayEmpty += (currentFrequency + 2) / 3;
        }

        return minNumberOfOperationsToMakeArrayEmpty;
    }
}