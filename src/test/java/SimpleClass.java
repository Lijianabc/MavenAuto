import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SimpleClass {

    @Test
    public void test() {
        System.out.println("");
        assertThat("1 + 1 = 2" , 2,  equalTo(1 + 1));
    }


    @Test
    public void base() {
        System.out.println("");
    }
}
