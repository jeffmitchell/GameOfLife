import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GameOfLife {

  private Boolean[][] grid = new Boolean[8][8];

  public static void main(String[] args) {
    GameOfLife gameOfLife = new GameOfLife();
  }

  @Before
  public void setup() {
    for (int row=0; row < grid.length; row++) {
      for (int column = 0; column < grid.length; column++) {
        grid[row][column] = false;
      }
    }
  }

  @Test
  public void testSomething() {
    assertThat(grid[0][0], is(equalTo(false)));
  }

}

