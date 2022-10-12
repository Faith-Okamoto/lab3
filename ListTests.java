import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

class DogChecker implements StringChecker {
    @Override
    public boolean checkString(String s) {
        return s.startsWith("dog");
    }
}

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>(Arrays.asList("dog1", "dog2"));
        StringChecker checker = new DogChecker();
        assertEquals(new ArrayList<>(Arrays.asList("dog1", "dog2")),
                        ListExamples.filter(input, checker));
    }

	@Test 
	public void testMerge() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(Arrays.asList("hi"));
        assertEquals(new ArrayList<>(Arrays.asList("hi")), 
                        ListExamples.merge(list1, list2));
	}
}
