import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       LocalDateTime localDateTime= LocalDateTime.of(2020,6,25,19,27);

      LocalDateTime localDateTime1 =  localDateTime.plusMonths(3L);

        System.out.println(localDateTime1.toLocalDate());
        System.out.println(localDateTime1.toLocalTime());
    }

}