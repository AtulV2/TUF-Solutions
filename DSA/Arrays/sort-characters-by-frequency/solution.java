class Solution {    
    public List<Character> frequencySort(String s) {
                Map<Character, Integer> f = new HashMap<>();

        for(char ch : s.toCharArray()){
            f.put(ch,f.getOrDefault(ch,0) + 1);
        }

        List<Character> l =  new ArrayList<>(f.keySet());

        l.sort((a,b)-> {
            
            int f_a = f.get(a);
            int f_b =  f.get(b);
            
            if(f_a != f_b){
                return Integer.compare(f_b, f_a);
            }

            return Character.compare(a,b);
            
        
        });



        return l;
    }
}