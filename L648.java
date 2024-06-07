//Replace Words

class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[] words = sentence.split(" ");
        // Sort the dictionary by word length
        Collections.sort(dict, Comparator.comparingInt(String::length));
        StringBuilder ans = new StringBuilder();

        // Iterate through each word in the sentence
        for (String word : words) 
        {
            boolean replaced = false;

            // Iterate through the sorted dictionary
            for (String root : dict) 
            {
                
                if (word.startsWith(root)) 
                {
                    ans.append(root).append(" ");
                    replaced = true;
                    break;
                }
            }
            if (!replaced) 
            {
                ans.append(word).append(" ");
            }
        }
        
        // Deleting extra space at the end
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}

