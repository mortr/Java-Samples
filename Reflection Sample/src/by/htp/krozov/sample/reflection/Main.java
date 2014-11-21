package by.htp.krozov.sample.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static class User {
        public final String name;
        private boolean activated;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean isActivated() {
            return activated;
        }

        @Deprecated
        public void setActivated(boolean activated) {
            this.activated = activated;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", activated=" + activated +
                    '}';
        }
    }

    public static void main(String[] args) throws Exception {
        String userClassName = User.class.getSimpleName();

        System.out.println("Поля класс " + userClassName);
        print(User.class.getDeclaredFields());
        System.out.println();

        System.out.println("Конструкторы класса " + userClassName);
        print(User.class.getDeclaredConstructors());
        System.out.println();

        System.out.println("Методы класса " + userClassName);
        print(User.class.getDeclaredMethods());
        System.out.println('\n');


        System.out.println("Изменение значения поля с помощью рефлексии.");
        User user = new User("Test user");
        System.out.println(user);

        Field userActivatedField = User.class.getDeclaredField("activated");
        if (userActivatedField.isAccessible()) {
            userActivatedField.setBoolean(user, true);
        } else {
            userActivatedField.setAccessible(true);
            userActivatedField.setBoolean(user, true);
            userActivatedField.setAccessible(false);
        }
        System.out.println(user);
    }

    private static void print(Field[] fields) {
        for (Field field : fields) {
            System.out.printf("\t%s %s %s",
                              getModifiersInfo(field),
                              field.getType().getSimpleName(),
                              field.getName())
                    .println();
        }
    }

    private static void print(Constructor<?>[] constructors) {
        for (Constructor<?> constructor : constructors) {
            List<String> methodParametersTypes = new LinkedList<>();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                methodParametersTypes.add(parameterType.getSimpleName());
            }

            System.out.printf("\t%s %s(%s)",
                              getModifiersInfo(constructor),
                              constructor.getDeclaringClass().getSimpleName(),
                              String.join(", ", methodParametersTypes))
                    .println();
        }
    }

    private static void print(Method[] methods) {
        for (Method method : methods) {
            List<String> methodParametersTypes = new LinkedList<>();
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                methodParametersTypes.add(parameterType.getSimpleName());
            }

            String annotationMethodInfo = getAnnotationMethodInfo(method);
            System.out.printf("\t%s%s %s %s(%s)",
                              "".equals(annotationMethodInfo) ? "" : annotationMethodInfo + " ",
                              getModifiersInfo(method),
                              method.getReturnType().getSimpleName(),
                              method.getName(),
                              String.join(", ", methodParametersTypes))
                    .println();
        }
    }

    private static String getAnnotationMethodInfo(Method method) {
        Annotation[] annotations = method.getAnnotations();
        if (annotations.length == 0) {
            return "";
        } else {
            List<String> annotationsName = new LinkedList<>();
            for (Annotation annotation : annotations) {
                annotationsName.add("@" + annotation.annotationType().getSimpleName());
            }
            return String.join(", ", annotationsName);
        }
    }

    private static String getModifiersInfo(Member member) {
        List<String> modifiersBuilder = new LinkedList<>();
        final int fieldModifiers = member.getModifiers();

        if (Modifier.isPrivate(fieldModifiers)) {
            modifiersBuilder.add("private");
        } else if (Modifier.isPublic(fieldModifiers)) {
            modifiersBuilder.add("public");
        } else if (Modifier.isProtected(fieldModifiers)) {
            modifiersBuilder.add("protected");
        }

        if (Modifier.isFinal(fieldModifiers)) {
            modifiersBuilder.add("final");
        }

        if (Modifier.isStatic(fieldModifiers)) {
            modifiersBuilder.add("static");
        }

        return String.join(" ", modifiersBuilder);
    }
}
