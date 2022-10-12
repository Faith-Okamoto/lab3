import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceLengthTwo() {
    int[] input = {0, 1};
    ArrayExamples.reverseInPlace(input);
    System.out.println("ReverseInPlace: " + input[0] + " " + input[1]);
    assertArrayEquals(new int[] {1, 0}, input);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLengthTwo() {
    int[] input = {0, 1};
    int[] output = ArrayExamples.reversed(input);
    System.out.println("Reversed: " + output[0] + " " + output[1]);
    assertArrayEquals(new int[] {1, 0}, output);
  }
}
