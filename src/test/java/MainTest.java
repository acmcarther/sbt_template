import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MainTest {

  @Test
  public void testExample() {
    assertEquals("123", "123");
  }

  @Test
  public void returns5Works() {
    assertEquals(Main.returns5(), 5);
  }
}
