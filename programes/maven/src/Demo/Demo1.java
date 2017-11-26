package Demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		String s="aabbccdef";
		Set<Character> set=new LinkedHashSet<Character>();
		for(char c:s.toCharArray())
		{
		    set.add(Character.valueOf(c));
		}
	}
}

