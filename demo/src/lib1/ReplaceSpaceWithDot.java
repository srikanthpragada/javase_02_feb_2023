package lib1;

public class ReplaceSpaceWithDot {

	public static void main(String[] args) {
		var sb = new StringBuffer("This is to test");

		for (int i = 0; i < sb.length(); i++)
			if (sb.charAt(i) == ' ')
				sb.setCharAt(i, '.');

		System.out.println(sb);

	}

}
