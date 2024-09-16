package ImperativeVsDeclarative.Example2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Declarative {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello","world","Bangladesh","Dhaka","Hello","Jave","Dhaka","Lambda");

        Map<String,Long> wordFrequency = countFrequency(words);

        System.out.println(wordFrequency);
    }
    static Map<String,Long> countFrequency(List<String> words){
        Map<String,Long> wordFrequency = new HashMap<>();

        for (String word:words){
            wordFrequency.merge(word,1L,(oldValue,value)-> oldValue+value);
            //wordFrequency.merge(word,1L, Long::sum);
        }
        return wordFrequency;
    }
}
