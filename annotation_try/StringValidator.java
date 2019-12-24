package annotation_try;

import java.lang.reflect.Field;

/**
 * StringValidator
 */
public class StringValidator {

    public static boolean isvalid(Object sample) throws IllegalArgumentException, IllegalAccessException {
        System.out.println(sample.getClass());
        for(Field x: sample.getClass().getFields()) {
            if(x.isAnnotationPresent(Validate.class)) {
                String tmp = (String) x.get(sample);
                return tmp.length()<=x.getAnnotation(Validate.class).maxlen();
            }
        }
        return false;
    }
}