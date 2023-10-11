class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        List<int[]> times = new ArrayList<>();
        for (int[] flower : flowers) {
            times.add(new int[]{flower[0], 1, 0});
            times.add(new int[]{flower[1], -1, 0});
        }
        for (int i = 0; i < persons.length; i++)
            times.add(new int[]{persons[i], 0, i});
        Collections.sort(times, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int curBloomFlower = 0;
        int[] res = new int[persons.length];
        for (int[] time : times) {
            if (time[1] == 0) res[time[2]] = curBloomFlower;
            else curBloomFlower += time[1];
        }
        return res;
    }
}