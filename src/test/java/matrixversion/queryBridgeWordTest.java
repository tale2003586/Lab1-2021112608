package matrixversion;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class queryBridgeWordTest {
    public static GraMethod graMethod = new GraMethod();
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        //graMethod.textToGraph("C:\\Users\\tale\\Documents\\Tencent Files\\2439082470\\FileRecv\\MobileFile\\softwareproject1\\softwareproject1\\test.txt");
    }

    @Test
    public void test1() {
        graMethod.textToGraph("src/test/java/text/txt/test1.txt");
        String result = graMethod.queryBridgeWords("word","mother");
        assertEquals("No word or mother in the graph!",result);
    }

    @Test
    public void test2() {
        graMethod.textToGraph("src/test/java/text/txt/test1.txt");
        String result = graMethod.queryBridgeWords("because","mother");
        assertEquals("No because or mother in the graph!",result);

    }
    @Test
    public void test3() {
        graMethod.textToGraph("src/test/java/text/txt/test2.txt");
        String result = graMethod.queryBridgeWords("second","first");
        assertEquals("No bridge words from second to first!",result);
    }
    @Test
    public void test4() {
        graMethod.textToGraph("src/test/java/text/txt/test2.txt");
        String result = graMethod.queryBridgeWords("first","second");
        assertEquals("No bridge words from first to second!",result);
    }
    @Test
    public void test5() {
        graMethod.textToGraph("src/test/java/text/txt/test3.txt");
        String result = graMethod.queryBridgeWords("first","third");
        assertEquals("The bridge word from first to third is:second",result);
    }
    @Test
    public void test6() {
        graMethod.textToGraph("src/test/java/text/txt/test4.txt");
        String result = graMethod.queryBridgeWords("first","third");
        assertEquals("The bridge words from first to third are:second and forth",result);
    }
}
