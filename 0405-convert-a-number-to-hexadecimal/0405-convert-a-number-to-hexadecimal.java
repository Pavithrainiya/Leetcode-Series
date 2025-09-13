class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        long n=num & 0xffffffffL;
        char[] hexChar="0123456789abcdef".toCharArray();
        StringBuilder str=new StringBuilder();

        while(n>0) {
            int hexValue=(int)(n%16);
            str.append(hexChar[hexValue]);
            n/=16;
        }
        return str.reverse().toString();
    }
}