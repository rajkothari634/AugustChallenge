class Solution {
    public boolean detectCapitalUse(String word) {
        int i=1;
        for(;i<word.length();i++){
            boolean previousLetter = word.charAt(i-1) >= 'a' && word.charAt(i-1) <= 'z';
            boolean currentLetter = word.charAt(i) >= 'a' && word.charAt(i) <= 'z';
            if((!currentLetter && previousLetter) || (!previousLetter && currentLetter && i>=2)){
                 return false;
            }
        }
        return true;
    }
}

//Given a word, you need to judge whether the usage of capitals in it is right or not.
//We define the usage of capitals in a word to be right when one of the following cases holds:
//All letters in this word are capitals, like "USA".
//All letters in this word are not capitals, like "leetcode".
//Only the first letter in this word is capital, like "Google".
//Otherwise, we define that this word doesn't use capitals in a right way.