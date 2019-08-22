package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileReader file = new FileReader(reader.readLine());
//            FileReader file=new FileReader("C://1.txt");
            BufferedReader readfile = new BufferedReader(file);
            String line = null, liner = "";
            while ((line = readfile.readLine()) != null) {
                //stringBuilder.append(line+" ");
                liner += line + " ";
            }
            String[] words = liner.split(" ");
            for (int i = 0; i < words.length - 1; i++) {
                boolean flag = true;
                for (int j = i + 1; j < words.length; j++) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(words[i]);
                    if (words[j].equals((stringBuilder.reverse().toString())) & !words[i].equals(" ") & flag) {
                        Pair pair = new Pair();
                        pair.first = stringBuilder.toString();
                        pair.second = stringBuilder.reverse().toString();
                        result.add(pair);
                        flag = false;
                    }
                    if (words[i].equals(words[j])) words[j] = " ";
                }
            }

            System.out.println(result);
        } catch (Exception e) {
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
