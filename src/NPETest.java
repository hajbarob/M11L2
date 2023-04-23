import java.util.Optional;

public class NPETest {

    public static void main(String[] args) {
        String s = getNameFromGoogle(2);
        Optional<String> stringOptional = getNameFromGoogleOptional(1);

        String ex = "";
        if (s != null) {
            System.out.println("s.toLowerCase() = " + s.toLowerCase());
            ex = s;
        } else {
            ex = "some default string";
        }

        if (stringOptional.isPresent()) {
            System.out.println("stringOptional.get() = " + stringOptional.get());
        }

        String someDefaultValue = stringOptional.orElse("some default value");
        System.out.println("someDefaultValue = " + someDefaultValue);

        stringOptional.ifPresent(s2 -> System.out.println(s2));
    }

    public static String getNameFromGoogle(int i) {
        if (i % 2 == 0) {
            //doo some logic
            return "Goga";
        } else {
            return null;
        }
    }

    public static Optional<String> getNameFromGoogleOptional(int i) {
        if (i % 2 == 0) {
            //doo some logic
            return Optional.of("Goga");
        } else {
            return Optional.empty();
        }
    }

}
