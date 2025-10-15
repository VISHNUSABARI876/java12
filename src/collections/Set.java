package collections;
import java.util.HashSet;
import java.util.*;
public class Set {
	public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("Eleven");
        h.add("Max");
        h.add("dustin");
        h.add("vecna");
        h.add("Steve");
        h.add("dustin");
        System.out.println(h);
        System.out.println(h.remove("Eleven"));
        System.out.println(h);
        System.out.println(h.contains("Max"));
        System.out.println(h.isEmpty());
	}
}
