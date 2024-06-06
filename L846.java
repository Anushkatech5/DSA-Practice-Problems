//Hand Of Straights

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
      Arrays.sort(hand);
      Map<Integer, Integer> cntMap = new HashMap();

      for(int card : hand)
      {
        cntMap.put(card, cntMap.getOrDefault(card, 0) +1);
      }  

      for (int card : hand) 
      {
            if (cntMap.get(card) == 0) continue;

            for (int i = 0; i < groupSize; i++) 
            {
                int currentCard = card + i;
                if (cntMap.getOrDefault(currentCard, 0) == 0) 
                {
                    return false;
                }
                cntMap.put(currentCard, cntMap.get(currentCard) - 1);
            }
        }
        
        return true;
    }
}
