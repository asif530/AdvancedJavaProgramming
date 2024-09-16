package ImperativeVsDeclarative.Example2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Imperative {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello","world","Bangladesh","Dhaka","Hello","Jave","Dhaka","Lambda");

        Map<String,Long> wordFrequency = countFrequency(words);

        System.out.println(wordFrequency);
    }

    static Map<String,Long> countFrequency(List<String> words){
        Map<String,Long> wordFrequency = new HashMap<>();
        for(String word: words){
            if(wordFrequency.containsKey(word))
                wordFrequency.put(word, wordFrequency.get(word)+1);
            else
                wordFrequency.put(word,1L);
        }
        return wordFrequency;
    }
}
