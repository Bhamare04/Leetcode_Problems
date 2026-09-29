class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int n:nums1){
            set.add(n);
        }
        for(int num:nums2){
        if (set.contains(num)) {
        result.add(num);
        }
}
int[] answer = new int[result.size()];
int i=0;
for(int num:result){
    answer[i++]= num;
}
return answer;
    }
}