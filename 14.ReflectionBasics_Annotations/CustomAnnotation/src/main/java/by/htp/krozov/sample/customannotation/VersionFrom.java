package by.htp.krozov.sample.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by krozov on 23.12.14.
 */
@Target({
        ElementType.METHOD, ElementType.ANNOTATION_TYPE,
        ElementType.TYPE, ElementType.CONSTRUCTOR
})
@Retention(RetentionPolicy.RUNTIME)
public @interface VersionFrom {
    String value() default "1.0";
}
