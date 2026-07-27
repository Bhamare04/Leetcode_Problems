class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String ch = String.valueOf(x);
            if(words[i].contains(ch)){
                result.add(i);
            }
            
        }
        return result;
    }
}