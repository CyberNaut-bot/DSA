class Solution {
    Map<String,Boolean>map=new HashMap();
  //List<String> wordDict is used to create a list of type String
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s))// checks whether the specific set of characters are part of the given string or not
        return true;
        if(map.containsKey(s))// is used to check whether a particular key is being mapped into the Hashmap or not. It takes 
          //key elements as a parameter and returns true if that element is mapped in the map or not.
        return map.get(s);//return the value to which the specified key is mapped, or 
      //null if this map contains no mapping for the key.
        for(int i=1;i<=s.length();i++)
        {
            String left = s.substring(0,i);
            if(wordDict.contains(left) && wordBreak(s.substring(i),wordDict))
            {
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
        
    }
}
