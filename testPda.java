import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class testPda{
  Pda pda;
  @Before
  public void before(){
    pda = new Pda();
  }

  @Test 
  public void testFunc1(){
       assertEquals(true, pda.func1(1));
  }

  @Test 
  public void testMax(){
    int a = 2;
    int b = 3;
    assertEquals(b, pda.max(a,b));
  }

  @Test 
  public void testLooper(){
    int i = 9;
    assertEquals(10, pda.looper());
  }

  @Test 
  public void testCheckLoop(){
    assertEquals("looper passed", pda.checkLoop());
  }
}