package annotation_try;

public class Program {

    @Validate(maxlen=9)
    public String name;

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

        Program obj = new Program();
        obj.name="abcd";
        
        System.out.println(StringValidator.isvalid(obj));
    }
}