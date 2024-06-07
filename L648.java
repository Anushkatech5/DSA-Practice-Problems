//Replace Words

class Solution {
    //solve it with tries instead
    public String replaceWords(List<String> dict, String sentence) {
        Set<String> s = new HashSet<>(dict);
        StringBuilder ans = new StringBuilder();
        List<String> temp = new ArrayList<>(
            Arrays.asList(sentence.split(" "))
        );
        
        for (String t : temp) {
            int i = 0;
            while (i <= t.length()) {
                String curr = t.substring(0, i++);
                if (s.contains(curr)) {
                    ans.append(curr).append(" ");
                    break;
                }

                if (i == t.length() + 1) ans.append(t).append(" ");
            }
        }
        
        ans.deleteCharAt(ans.length() - 1); 
        return ans.toString();
    }
