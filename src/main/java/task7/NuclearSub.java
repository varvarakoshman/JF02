package task7;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface NuclearSub {
    String strParam() default "가자!";
    String value();
}
