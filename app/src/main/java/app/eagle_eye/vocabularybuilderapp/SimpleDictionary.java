package app.eagle_eye.vocabularybuilderapp;

/**
 * Created by ADMIN on 22-Oct-16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SimpleDictionary
{
    int ind = 0;
    private String[] words = new String[51];;
    private HashMap<String,Pair> map;
    public SimpleDictionary(InputStream wordListStream) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(wordListStream));
        String line = null;
        map = new HashMap<>();
        while((line = in.readLine()) != null) {
            String wordAndMean = line.trim();
            String word = wordAndMean.split("-")[0];
            words[ind++] = word;
            String meaning = wordAndMean.split("-")[1];
            map.put(word,new Pair(meaning,false));
        }
    }

    public HashMap<String,Pair> getDatabase()
    {
        return map;
    }
    public String[] getWordList()
    {
        return words;
    }
    public int getSize()
    {
        return ind;
    }
}

class Pair
{
    String meaning;
    Boolean isMastered;
    public Pair(String meaning,Boolean isMastered)
    {
        this.meaning = meaning;
        this.isMastered = isMastered;
    }

}


