import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TestApple {
  @Before
  public void setup() {

  }

  @After
  public void cleanup() {

  }

  @BeforeClass
  static public void setupOnlyOnce() {

  }

  @AfterClass
  static public void cleanOnlyOnce() {

  }

  @Test
  public void testProfit() {
    Apple myApple = new Apple(10, 5);
    assertEquals(10 - 5, myApple.getProfit());
  }

  @Test(timeout=1000)
  public void testCost() {
    Apple myApple = new Apple(10, 5);
    assertEquals(5, myApple.getCost());
  }

  @Test
  public void testCostMockito() {
    Apple mockApple = mock(Apple.class);
    when(mockApple.getCost()).thenReturn(4);
    assertEquals(4, mockApple.getCost());
  }

  @Test
  public void testCostSpy() {
    Apple myApple = new Apple(10, 5);
    assertEquals(5, myApple.getCost());
    Apple spyApple = Mockito.spy(myApple);
    when(spyApple.getCost()).thenReturn(4);
    assertEquals(4, spyApple.getCost());
  }

  @Test
  public void testRevenueSpy() {
    Apple myApple = new Apple(10, 5);
    Apple spyApple = Mockito.spy(myApple);

    Report.getRevenue(spyApple);

    verify(spyApple).getPrice();
  }
}