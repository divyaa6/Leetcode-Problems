class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;

        HashMap<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char now=t.charAt(i);

            if(!mp.containsKey(now))
            return false;

            int count=mp.get(now);
            if(count==1)
            mp.remove(now);
            else
            mp.put(now,count-1);
        }
        return mp.isEmpty();
        }
        
    }
