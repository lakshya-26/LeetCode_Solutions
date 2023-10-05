class Solution 
{
    public List<Integer> majorityElement(int[] A)
    {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int n : A)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(int n : A)
        {
            if(map.get(n) > A.length / 3)
                set.add(n);
        }
        list.addAll(set);
        return list;
    }
}