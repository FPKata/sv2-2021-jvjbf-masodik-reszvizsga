package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Words {
    private List<String> words = new ArrayList<>();

    public void addWord(String word){

        if (!word.trim().contains(" ") && word.equals(word.toLowerCase())){
            words.add(word);
        }

        if(!word.equals(word.toLowerCase())){
            throw new IllegalArgumentException("Word should be lower case!");
        }

        if (word.trim().contains(" ")){
            throw new IllegalArgumentException("It should be one word!");
        }
    }

    public boolean isThereAWordTwice(){
        List<String> once = new ArrayList<>();
        boolean hasOnlyOne = true;
        for (String actual : words){
            if (!once.contains(actual)){
                once.add(actual);
            }
        }
        if (words.size() == once.size()){
            hasOnlyOne = false;
        }
        return hasOnlyOne;
    }

    public List<String> getWords() {
        return words;
    }
}
