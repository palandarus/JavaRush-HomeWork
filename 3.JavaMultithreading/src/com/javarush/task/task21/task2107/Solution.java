package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);
            System.out.println(solution.users.equals(clone.users));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new User(age, name);
        }

        @Override
        public int hashCode() {
            int k=31;
            int result=31*age+name.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj.getClass() != getClass() || obj == null) return false;
            if (this == obj) return true;
            if (!(obj instanceof User)) return false;

            User user = (User) obj;

            if (age != user.age) return false;
            if (name != null ? !name.equals(user.name) : user.name != null) return false;
            return true;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution clone = new Solution();
        for (Map.Entry<String, User> x : users.entrySet()) {
            clone.users.put(x.getKey(), (User) x.getValue().clone());
        }
        return clone;
    }
}
