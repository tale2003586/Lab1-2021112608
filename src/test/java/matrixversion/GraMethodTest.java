package matrixversion;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GraMethodTest {

    public static GraMethod graMethod = new GraMethod();
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        graMethod.textToGraph("src/test/java/text/txt/test1.txt");
    }

    @Test
    public void test() throws IOException {
        String result = graMethod.calcShortestPath("like","life");
        System.out.println(result);
        assertEquals("Shortest distance from like to life is: 3\n" +
                "Shortest path from like to life is: like my school life ",result);
    }
    @Test
    public void test2() throws IOException {
        String result = graMethod.calcShortestPath("life","");
        System.out.println(result);
        assertEquals("Shortest distance from life to second is: 3\n" +
                "Shortest path from life to second is: life because teachers second \n" +
                "Shortest distance from life to school is: 4\n" +
                "Shortest path from life to school is: life because teachers second school \n" +
                "Shortest distance from life to i is: 5\n" +
                "Shortest path from life to i is: life because teachers second school i \n" +
                "Shortest distance from life to like is: 6\n" +
                "Shortest path from life to like is: life because teachers second school i like \n" +
                "Shortest distance from life to my is: 5\n" +
                "Shortest path from life to my is: life because teachers second and my \n" +
                "Shortest distance from life to because is: 1\n" +
                "Shortest path from life to because is: life because \n" +
                "Shortest distance from life to teachers is: 2\n" +
                "Shortest path from life to teachers is: life because teachers \n" +
                "Shortest distance from life to and is: 4\n" +
                "Shortest path from life to and is: life because teachers second and \n" +
                "Shortest distance from life to classmates is: 6\n" +
                "Shortest path from life to classmates is: life because teachers second and my classmates \n" +
                "Shortest distance from life to are is: 7\n" +
                "Shortest path from life to are is: life because teachers second and my classmates are \n" +
                "Shortest distance from life to friendly is: 8\n" +
                "Shortest path from life to friendly is: life because teachers second and my classmates are friendly \n" +
                "Shortest distance from life to helpful is: 5\n" +
                "Shortest path from life to helpful is: life because teachers second and helpful \n" +
                "Shortest distance from life to we is: 6\n" +
                "Shortest path from life to we is: life because teachers second and helpful we \n" +
                "Shortest distance from life to also is: 7\n" +
                "Shortest path from life to also is: life because teachers second and helpful we also \n" +
                "Shortest distance from life to have is: 8\n" +
                "Shortest path from life to have is: life because teachers second and helpful we also have \n" +
                "Shortest distance from life to lots is: 9\n" +
                "Shortest path from life to lots is: life because teachers second and helpful we also have lots \n" +
                "Shortest distance from life to of is: 10\n" +
                "Shortest path from life to of is: life because teachers second and helpful we also have lots of \n" +
                "Shortest distance from life to after is: 11\n" +
                "Shortest path from life to after is: life because teachers second and helpful we also have lots of after \n" +
                "Shortest distance from life to activies is: 5\n" +
                "Shortest path from life to activies is: life because teachers second school activies \n",result);
    }
    @Test
    public void test3() throws IOException {
        String result = graMethod.calcShortestPath("mother","life");
        System.out.println(result);
        assertEquals("No mother found in the graph",result);
    }
    @Test
    public void test4() throws IOException {
        String result = graMethod.calcShortestPath("like","mother");
        System.out.println(result);
        assertEquals("No mother found in the graph",result);
    }
    @Test
    public void test5() throws IOException {
        String result = graMethod.calcShortestPath("like","and");
        System.out.println(result);
        assertEquals("Shortest distance from like to and is: 5\n" +
                "Shortest path from like to and is: like my classmates are friendly and ",result);
    }

}