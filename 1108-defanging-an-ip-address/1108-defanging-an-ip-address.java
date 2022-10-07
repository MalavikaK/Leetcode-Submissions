class Solution {
    public String defangIPaddr(String address) {
        
        String ans = "";
        
        //convert the string to a char array
        //run a for loop through each characters
        //if c == . replace it with [.]
        //append the ans with the char
        //else return the ans
        
        for(char c : address.toCharArray()){
            if(c == '.'){
                ans += "[.]";
            }
            else
                ans += c;
        }
        return ans;
    }
}