package mobyDiction;

import java.util.*;

public abstract class LitText implements LitLyzer {
	
    protected String contents;
	
    public LitText() {

    }
    public LitText(String contents) {
        this.contents = contents;
    }

    @Override
	public String getContents() {
		return contents;
	}
	
	public Map<String, Integer> count(Counter counter, ArrayList<String> categories) {
		HashMap<String, Integer> countMap = new HashMap<>();
		for (String s : categories) {
			countMap.put(s,  counter.count(contents));
		}
		return countMap;
	}
}
