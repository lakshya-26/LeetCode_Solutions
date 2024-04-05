public class Solution {
    public static List< Integer > majorityElement(int []v) {
        int cnt1 = 0, cnt2 = 0, ele1= Integer. MIN_VALUE, ele2 = Integer. MIN_VALUE;
        for(int i=0;i<v.length;i++){
            if(cnt1 == 0 && v[i] != ele2){
                cnt1 = 1;
                 ele1 = v[i];
            }else if(cnt2 == 0 && v[i] != ele1){
                cnt2 = 1;
                 ele2 = v[i];
            }else if(ele1 == v[i]) {
                cnt1++;
            }else if(ele2 == v[i]){
                cnt2++;
            }else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>();
        cnt1 = 0; 
        cnt2 = 0;
        for(int i=0;i<v.length;i++){
            if(ele1 == v[i]) cnt1++;
            if(ele2 == v[i]) cnt2++;
        }
        int mini = (int)((v.length)/3);
        if(cnt1 > mini) ls.add(ele1);
        if(cnt2 > mini ) ls.add(ele2);
        Collections.sort(ls);
        return ls;
    }
}