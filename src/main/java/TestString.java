import org.junit.Test;

public class TestString {
    @Test
    public void testInteger(){
        Object o1 = true ? new Integer(1) : new Double(2.0);
        Object o2 = new Integer(1);
        System.out.println(o1);
        System.out.println(o2);

    }
}
