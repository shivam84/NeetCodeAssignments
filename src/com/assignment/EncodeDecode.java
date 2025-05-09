package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encode(List<String> strs) {
        //encode
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        //decode
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            String decodedStr = str.substring(j + 1, j + 1 + length);
            result.add(decodedStr);
            i = j + 1 + length;
        }
        return result;
    }
    public static void main(String[] args) {
        EncodeDecode obj = new EncodeDecode();
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String encodedStr = obj.encode(list);
        System.out.println("Encoded: " + encodedStr);
        List<String> decodedList = obj.decode(encodedStr);
        System.out.println("Decoded: " + decodedList);
    }
}
