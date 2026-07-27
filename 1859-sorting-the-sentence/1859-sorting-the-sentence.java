class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {

            char ch = words[i].charAt(words[i].length() - 1);
            int position = ch - '0';

            String actualWord = words[i].substring(0, words[i].length() - 1);

            result[position - 1] = actualWord;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);

            if (i != result.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}