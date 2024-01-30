package com.study;

import com.test.User;

import java.lang.reflect.Field;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 17:52
 * @Description
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User("三十",30);

        System.out.println(user.toString());

        Class<User> userClass = User.class;
        Field field = userClass.getDeclaredField("name");

        field.setAccessible(true);
        System.out.println(field.get(user));
    }
}
