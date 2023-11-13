package mobyDiction;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Chapter extends LitText {

    private String name;
    private ArrayList<Sentence> sentences;

    // getter for sentences
    public List<Sentence> getSentences() {
        return sentences;
    }

    public String name(String filePath) {
        try {
            // Read text file and store it in a string
            String fileText = new String(Files.readAllBytes(Paths.get(filePath)));       
            
            String[] lines = fileText.split("\n");

            return lines[0].trim();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return "Unknown Chapter";
    }

    // getter for name
    public String getName() {
        return name;
    }

    // return number of sentences
    public int numSentences() {
        return sentences.size();
    }

    // return average sentence length
    public List<Word> getAvgSentenceLength() {
        List<Word> avgSentence = new ArrayList<>();
        
        // find the words in each sentence and store in a list
        for (Sentence sentence : sentences){
            List<Word> wordsInSentence = sentence.getWords();
            avgSentence.addAll(wordsInSentence);
        } 

        // calculate sentence length in Words
        int totalWords = getWords(avgSentence);


    }

    // return average Word length
    public char getAvgWordLength() {

    }
}
