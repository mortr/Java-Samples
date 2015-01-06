package by.htp.krozov.sample.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

/**
 * Utility class for reflection.
 * <p/>
 * Created by krozov on 23.12.14.
 */
public final class ClassUtils {

    private ClassUtils() {
    }

    public static void print(Field[] fields) {
        for (Field field : fields) {
            System.out.printf("\t%s %s %s",
                              getModifiersInfo(field),
                              field.getType().getSimpleName(),
                              field.getName())
                    .println();
        }
    }

    public static void print(Constructor<?>[] constructors) {
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

    public static void print(Method[] methods) {
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

    public static String getAnnotationMethodInfo(Method method) {
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

    public static String getModifiersInfo(Member member) {
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
