class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean spe=false;
        String special = "!@#$%^&*()-+";
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isLowerCase(ch)){
                lower=true;
            }
            if(Character.isUpperCase(ch)){
                upper=true;
            }
            if(Character.isDigit(ch)){
                digit=true;
            }
            if(special.contains(Character.toString(ch))){
                spe=true;
            }
            if (i < password.length() - 1 && password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
        }
        return lower && upper && digit && spe;
    }
}