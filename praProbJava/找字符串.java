package day07;

public class 找字符串 {
    public int strStr(String haystack, String needle) {
        //如果haystack长度小于needle长度 直接返回-1;
        if (haystack.length() < needle.length()) return -1;
        //如果needle 是空字符串的话直接返回0;
        if (needle.length() == 0) return 0;
        int a = haystack.length();
        int b = needle.length();
        for (int i = 0; i < a - b + 1; i++) {
            int j = 0;
            for (; j < b; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == b)
                return i;
        }
        return -1;
    }
}
