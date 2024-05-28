public class main{
    public static void main(){
        String word = "Hannah";
        char[] wordList = word.toCharArray();
        for (i = wordList.length -1, i >= 0, i--){
            String word2 += wordList[i]; 
        }
        if (word == word2){
            System.out.println("The word is the same backword");
        }
        else{
            System.out.println("The word is not the same backword");
        }
    }
}