import matrixversion.GraMethod;
import org.junit.Test;

import java.io.IOException;

public class junittest {
    @Test
    public void test() throws IOException {
        GraMethod testGraph = new GraMethod();
        testGraph.textToGraph("C:\\Users\\tale\\Documents\\Tencent Files\\2439082470\\FileRecv\\MobileFile\\softwareproject1\\softwareproject1\\test.txt");
        testGraph.calcShortestPath("i","forever");
    }
}
