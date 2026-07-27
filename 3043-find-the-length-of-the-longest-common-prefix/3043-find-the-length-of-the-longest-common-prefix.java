import java.util.HashSet;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<String> set = new HashSet<>();

        // Store all prefixes of arr1 numbers
        for(int i = 0; i < arr1.length; i++) {

            String s = String.valueOf(arr1[i]);

            String prefix = "";

            for(int j = 0; j < s.length(); j++) {

                prefix = prefix + s.charAt(j);

                set.add(prefix);
            }
        }

        int max = 0;

        // Check prefixes of arr2 numbers
        for(int i = 0; i < arr2.length; i++) {

            String s = String.valueOf(arr2[i]);

            String prefix = "";

            for(int j = 0; j < s.length(); j++) {

                prefix = prefix + s.charAt(j);

                if(set.contains(prefix)) {

                    max = Math.max(max, prefix.length());
                }
            }
        }

        return max;
    }
}