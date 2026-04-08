import java.util.Arrays;

public class FindName {
    public static void main(String[] args) {

        String[] names = {"Prosper", "John", "Mary", "Samuel", "Joy"};

        String search = "Mary";

        boolean found = Arrays.stream(names)
                              .anyMatch(n -> n.equalsIgnoreCase(search));

        System.out.println(found ? "Name found" : "Name not found");
    }
}