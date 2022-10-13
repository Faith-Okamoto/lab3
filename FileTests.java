import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;

public class FileTests {
	@Test 
	public void testGetFilesDir() {
        try {
        assertEquals(new ArrayList<File>(Arrays.asList(
            new File("some-files/more-files/b.txt"), 
            new File("some-files/more-files/c.java"))
            ), FileExample.getFiles(new File("some-files/more-files")));
        } catch (IOException e) {
            fail("IOException thrown when there shouldn't be one");
        }
	}

    @Test 
	public void testGetFilesSubDirs() {
        try {
        assertEquals(new HashSet<File>(Arrays.asList(
            new File("some-files/more-files/b.txt"), 
            new File("some-files/more-files/c.java"),
            new File("some-files/a.txt"), 
            new File("some-files/even-more-files/d.java"),
            new File("some-files/even-more-files/a.txt"))
            ), 
            new HashSet<File>(FileExample.getFiles(
                new File("some-files/"))));
        } catch (IOException e) {
            fail("IOException thrown when there shouldn't be one");
        }
	}
}
