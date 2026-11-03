class Solution {
    public boolean isAnagram(String s, String t) {
    
    int[] f1= new int[26];
    int[] f2= new int[26];
    // for(int i=0;i<f1.length;i++)
    // {
    //     f1[i]=0;
    //     f2[i]=0;
     
    // }
    // for(int i=0;i<s.length();i++)
    // {
        
    boolean f=true;
       
    //  }
    if(t.length()!=s.length())
    {
        f=false;
        return f;
    }
    for(int i=0;i<t.length();i++)
    {
         f1[s.charAt(i)-'a']++;
        f2[t.charAt(i)-'a']++;
    }
    for(int i=0;i<f1.length;i++)
    {
        if(f1[i]!=f2[i])
    f=false;
    }

    return f;
        
    

    
    
    }


    // HashMap<Character,Integer> h1 = new HashMap<>();
    // HashMap<Character,Integer> h2 = new HashMap<>();

    // for(int i=0;i<s.length();i++)
    // {
    //     h1.put(s.charAt(i), h1.getOrDefault(s.charAt(i),0)+1);
    //     char c = t.charAt(i);
    //     h2.put(c, h2.getOrDefault(c,0)+1);

    // }
    // return h1.equals(h2);
}
