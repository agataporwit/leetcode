//Agata P. 10/19/21
//Find Common Characters

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> finalCount = new ArrayList();
        List<int[]> howManyCharactersInEachWord = new ArrayList();
        for(String eachWord: words) {
            howManyCharactersInEachWord.add(countChar(eachWord));
        }
        for (int i = 0; i < 26; i++){
            int min = Integer. MAX_VALUE;
            for (int j = 0; j<howManyCharactersInEachWord.size();j++){
                min = Math.min(min, howManyCharactersInEachWord.get(j)[i]);
            }
        for (int n =0; n <min; n++){
            char curr = (char)('a' + i);
            finalCount.add(Character.toString(curr));
        }
    }
    return finalCount;
}
private int[] countChar(String s){
    int[] counted = new int[26];
    for (char i : s.toCharArray()){
        counted[i - 'a']++;
    }
    return counted; 
  }
}