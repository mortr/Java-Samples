package by.htp.krozov.sample.reflection;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;

        String userClassName = userClass.getSimpleName();

        System.out.println("Поля класс " + userClassName);
        ClassUtils.print(userClass.getDeclaredFields());
        System.out.println();

        System.out.println("Конструкторы класса " + userClassName);
        ClassUtils.print(userClass.getDeclaredConstructors());
        System.out.println();

        System.out.println("Методы класса " + userClassName);
        ClassUtils.print(userClass.getDeclaredMethods());
        System.out.println('\n');


        System.out.println("Изменение значения поля с помощью рефлексии.");
        User user = new User("Test user");
        System.out.println(user);

        Field userActivatedField = userClass.getDeclaredField("activated");
        if (userActivatedField.isAccessible()) {
            userActivatedField.setBoolean(user, true);
        } else {
            userActivatedField.setAccessible(true);
            userActivatedField.setBoolean(user, true);
            userActivatedField.setAccessible(false);
        }
        System.out.println(user);
    }

}
