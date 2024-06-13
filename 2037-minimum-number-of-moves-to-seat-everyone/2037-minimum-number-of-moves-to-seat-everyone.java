class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        
        int res = 0;
        for(int i=0;i<students.length;i++){
            if(students[i]>seats[i] || students[i]<seats[i]){
                res += Math.abs(students[i]-seats[i]);
            }
        }
        return res;
    }
}