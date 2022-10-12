import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class ListTests {
	@Test 
	public void testMerge() {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>(Arrays.asList("hi"));
    assertEquals(new ArrayList<>(Arrays.asList("hi")), 
                    ListExamples.merge(list1, list2));
	}
}
