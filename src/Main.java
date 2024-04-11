import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list4 = new ArrayList(Arrays.asList("NORTH", "NORTH", "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"));
        List<String> result4 = Assorted.wildWest(list4);
        System.out.println(result4);
    }
}
