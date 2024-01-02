class Solution {
public int maxOperations(int[] nums, int k) {
    int res = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for(int n : nums){
        if(map.containsKey(k - n)){
            map.put(k - n, map.get(k-n) - 1);
            if(map.get(k - n) == 0)
                map.remove(k - n);
            res++;
        }else {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
    }
    return res;
}
}