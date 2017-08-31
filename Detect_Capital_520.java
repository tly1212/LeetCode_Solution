class Detect_Capital_520 {
    public boolean detectCapitalUse(String word) {
        char[] s = word.toCharArray();
        if(s[0] >= 97){
            for(int i = 1; i <s.length; i++)
            if(s[i] < 97)
                return false;
        }else if(s[1] < 97 ){
            for(int i = 2; i <s.length; i++)
            if(s[i] < 97)
                continue;
            else
                return false;
        }
        else{
            for(int i = 2; i <s.length; i++)
            if(s[i] < 97)
                return false;
        }
        
        return true;
    }
}