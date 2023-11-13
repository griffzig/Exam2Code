package mobyDiction;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		// specify destination file path
		String filePath = "C:/temp/path/placeholder/MobyDick.txt";
       
        try {
            // Read file contents
            String wholeText = new String(Files.readAllBytes(Paths.get(filePath)));
            
            LitText litText = new LitText(wholeText);

            // Trim unwanted sections
            // Remove Gutenberg info
            String trimmedText = wholeText.substring(796, wholeText.length() - 18870).strip();
            // Remove title and table of contents
            trimmedText = trimmedText.substring(4560, trimmedText.length()).strip();

            // remove Etymology and Extracts sections but store as variables
            String etymology = trimmedText.substring(0, 1390).strip();
            String extracts = trimmedText.substring(1391, 22090).strip();
            trimmedText = trimmedText.substring(22091, trimmedText.length()).strip();

            // Split remaining text into chapters, sentences, and words
            ArrayList<Chapter> chapters = new ArrayList<>();
            ArrayList<Sentence> sentences = new ArrayList<>();
            ArrayList<Word> words = new ArrayList<>();

            // Process the text
            // Map of all Chapters
            Map<String, Chapter> chapterMap = new HashMap<>();
            for (Chapter chapter : chapters) {
                chapterMap.put(chapter.getName(),  chapter);
            }

        } catch (IOException e) { // Exception handling
            e.printStackTrace();
        }

		

	}

}
