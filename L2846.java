//2846. Append Characters to String to Make Subsequence

class Solution {
    public int appendCharacters(String s, String t) {
        int tIndex = 0;
        int leftCharst = t.length();

        for(int i = 0; i < s.length(); i++)
        {
            if( s.charAt(i) == t.charAt(tIndex) )
            {
                tIndex++;
                {
                    if( tIndex == t.length() )
                    {
                        leftCharst = 0;
                        break;
                    }
                }
            }
        leftCharst = t.length() - tIndex;
        }
        return leftCharst;
    }
}
