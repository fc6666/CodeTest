package com.example.demo1.test;

/**
 * @author fangC
 * @date 2022/4/14 12:08
 */
public class CodeTest {
    public static void main(String[] args) {
        String str1= "zzzcgfffgeeegbtttbb";
        System.out.println(requirement1(str1));
        String str2 = "baaabbccddeefff";
        System.out.println(requirement2(str2));
    }

    /**
     * 给出一个字符串，把连续3次出现的字符串删掉，重复此过程直到没有超过3个相同的字符相邻
     *
     * @param str
     * @return
     */
    public static String requirement1(String str) {
        int length = str.length();
        int index = 1;
        int left = index - 1;
        int right = index + 1;
        while (left < length && right < length) {
            while (left >= 0 && left < length && right < length) {
                if (str.charAt(left) == str.charAt(index) && str.charAt(index) == str.charAt(right)) {
                    str = str.substring(0, left) + str.substring(right + 1, length);
                    index = 1;
                    left = index -1;
                    right = index+1;
                    length = str.length();
                } else {
                    index++;
                    left = index - 1;
                    right = index + 1;
                }
            }
        }
        return str;
    }

    /**
     * 给出一个字符串，把连续3次出现的字符用该字符在字母表的上一个字符代替，如果连续出现的字符串市a，则直接删掉
     *
     * @param str
     * @return
     */
    public static String requirement2(String str) {
        int length = str.length();
        int index = 1;
        int left = index - 1;
        int right = index + 1;
        while (left < length && right < length) {
            while (left >= 0 && left < length && right < length) {
                if (str.charAt(left) == str.charAt(index) && str.charAt(index) == str.charAt(right)) {
                    if (str.charAt(index) == 'a') {
                        str = str.substring(0, left) + str.substring(right + 1, length);
                    }else {
                        str = str.substring(0, left) +(char)(str.charAt(left)-1)+ str.substring(right + 1, length);
                    }
                    index = 1;
                    left = index -1;
                    right = index+1;
                    length = str.length();
                } else {
                    index++;
                    left = index - 1;
                    right = index + 1;
                }
            }

        }
        return str;
    }
}
