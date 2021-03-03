package expectedPrograms.logics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowtoReverseElementsinCollection {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Before Reversing "+list);
		Collections.reverse(list);
		System.out.println("After Reversing "+list);
	}
}
