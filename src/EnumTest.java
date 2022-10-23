import java.util.Arrays;

public class EnumTest {

    protected static <E extends Enum<E>> void enumValues(Class<E> enumData) {
        for (Enum<E> enumVal: enumData.getEnumConstants()) {
            System.out.println(enumVal.toString());
        }
    }

    public static <E extends Enum<E>> boolean isInEnum (String s, Class <E> enumClass){
        return Arrays.stream(enumClass.getEnumConstants()).anyMatch(e -> e.name().equals(s));
    }

    public static <E extends Enum<E>,S> boolean isInEnum1 (S s, Class <E> enumClass){
        return Arrays.stream(enumClass.getEnumConstants()).anyMatch(e -> e.name().equals(s));
    }

    public static enum TestEnum {
        ONE, TWO, THREE;
    }

    public static void main(String param [] ) {
        EnumTest.enumValues(EnumTest.TestEnum.class);
        String one = "ONE";
        System.out.println(one + " " + isInEnum1(one,TestEnum.class));

    }
}