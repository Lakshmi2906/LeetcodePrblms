class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hp=new HashMap<>();
        for(String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!hp.containsKey(key)){
                hp.put(key,new ArrayList<>());
            }
            hp.get(key).add(word);
        }
        List<List<String>> ans=new ArrayList<>(hp.values());
        return ans;
    }
}