package by.htp.krozov.sample.customannotation;

import java.lang.reflect.Method;

/**
 * Created by krozov on 23.12.14.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class userClass = Class.forName("by.htp.krozov.sample.customannotation.User");
        VersionFrom userClassVersionFrom = (VersionFrom) userClass.getAnnotation(VersionFrom.class);
        System.out.println("Class '" + userClass
                                   + "' presents from " + userClassVersionFrom.value());

        Method getSurnameMethod = userClass.getMethod("getSurname");
        VersionFrom methodVersionFrom =
                (VersionFrom) getSurnameMethod.getAnnotation(VersionFrom.class);
        System.out.println("Method '" + getSurnameMethod
                                   + "' presents from " + methodVersionFrom.value());
    }
}
