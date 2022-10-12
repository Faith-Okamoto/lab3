import static org.junit.Assert.*;

import org.junit.*;

public class LinkedListTests {
    @Test 
	public void testAppendEmpty() {
        LinkedList test = new LinkedList();
        test.append(0);

        assertEquals(0, test.root.value);
        assertNull(test.root.next);
	}

   @Test
    public void testAppendSingle() {
        LinkedList test = new LinkedList();
        test.append(0);
        test.append(1);

        assertEquals(0, test.root.value);
        assertEquals(1, test.root.next.value);
        assertNull(test.root.next.next);
    }

	@Test
	public void testAppendMulti() {
        LinkedList test = new LinkedList();
        test.append(0);
        test.append(1);
        test.append(2);

        assertEquals(0, test.root.value);
        assertEquals(1, test.root.next.value);
        assertEquals(2, test.root.next.next.value);
        assertNull(test.root.next.next.next);
	}
}
