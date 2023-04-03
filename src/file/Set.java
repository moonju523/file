package file;

import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		System.out.println(set);
	}
}