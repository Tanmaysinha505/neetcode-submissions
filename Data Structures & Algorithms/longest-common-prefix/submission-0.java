class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str=strs[0];
        StringBuilder s = new StringBuilder("");
        int n= strs[0].length();

        for(int i=0;i<n;i++)
        {
            int flag=1;
            for(int j=1;j<strs.length;j++)
{
if(i>=strs[j].length()){
flag=0;
break;}

    if(strs[j].charAt(i)!=strs[0].charAt(i))
    {
        flag=0;
        break;
    }
}
if(flag!=0)
{
        s.append(strs[0].charAt(i));

}
else
{
    break;
}
}
        return s.toString();
}
        }
    //     for(int i=0;i<strs.length;i++)
    //     {
            
    //         for(int j=0;j<n;j++){
    //          int flag=1;   
    //   if(strs[0].charAt(j)==strs[i].charAt(j) && flag==1)
    //   {
        
    //     s.append(strs[0].charAt(j));
        
    //   }
    //   else
    //   {
    //     break;
    //   }
    //  flag=0;
    //     }
    // }
    //   if(strs[0].charAt(0)==strs[i].charAt(0))
    //   {
    //     s.append(strs[0].charAt(0));
    //   }
    //   else
    //   {
    //     break;
    //   }
    //   if(strs[0].charAt(1)==strs[i].charAt(1))
    //   {
    //     s.append(strs[0].charAt(1));
    //   }
    //   else
    //   {
    //     break;
    //   }
    //   if(strs[0].charAt(2)==strs[i].charAt(2))
    //   {
    //     s.append(strs[0].charAt(2));
    //   }
    //   else
    //   {
    //     break;
    //   }
         
