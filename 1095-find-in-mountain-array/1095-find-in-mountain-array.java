/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //Find Peak Element
        int l = 0;
        int h = mountainArr.length()-1;
        while(l<h)
        {
            int m = (l+h)/2;
            if(mountainArr.get(m)<mountainArr.get(m+1))
                l=m+1;
            else
                h=m;
        }
         int p=l;
        
        
        //Search in 1st Half
        l=0;
        h=p;
        while(l<=h)
        {
            int m = (l+h)/2;
            int e = mountainArr.get(m);
            if(e<target)
                l=m+1;
            else if(e==target)
                return m;
            else
                h=m-1;
        }
        
        //Search in 2nd Half
        l=p+1;
        h=mountainArr.length()-1;
        while(l<=h)
        {
            int m = (l+h)/2;
            int e = mountainArr.get(m);
            if(e>target)
                l=m+1;
            else if(e==target)
                return m;
            else
                h=m-1;
        }
        
        //If not found return -1
        return -1;
    }
}