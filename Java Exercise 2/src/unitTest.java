import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class unitTest {

  // *********************************
  // Triangle Tests
  // *********************************

  @Test
  public void testTriangleConstructor() {
    // test default constructor
    Shape testShape = new Triangle();
    assertEquals(3, testShape.getSize()); 
    
    // test constructor with size parameter
    testShape = new Triangle(5);
    assertEquals(5, testShape.getSize()); 
  }
  
  @Test
  public void testTriangleSize() {  
    // test setSize()
    Shape testShape = new Triangle(5);
    testShape.setSize(6);
    assertEquals(6, testShape.getSize()); 
  }

  @Test
  public void testTriangleCircumference() {  
    // test circumference()
    Shape testShape = new Triangle(6);
    assertEquals(18.0, testShape.circumference(), 1e-6); 
  }
    @Test
    public void testTriangleArea() {  
      // test area()
      Shape testShape = new Triangle(6);
      assertEquals(18.0, testShape.area(), 1e-6); 
  }

  // *********************************
  // Square Tests
  // *********************************

  @Test
  public void testSquareConstructor() {
    // test default constructor
    Shape testShape = new Square();
    assertEquals(3, testShape.getSize()); 
    
    // test constructor with size parameter
    testShape = new Square(5);
    assertEquals(5, testShape.getSize()); 
  }
  
  @Test
  public void testSquareSize() {  
    // test setSize()
    Shape testShape = new Square(5);
    testShape.setSize(6);
    assertEquals(6, testShape.getSize()); 
  }

  @Test
  public void testSquareCircumference() {  
    // test circumference()
    Shape testShape = new Square(6);
    assertEquals(24.0, testShape.circumference(), 1e-6); 
  }
    @Test
    public void testSquareArea() {  
      // test area()
      Shape testShape = new Square(5);
      assertEquals(25.0, testShape.area(), 1e-6); 
  }


  // *********************************
  // Rectangle Tests
  // *********************************

  @Test
  public void testRectangleConstructor() {
    // test default constructor
    Rectangle testShape = new Rectangle();
    assertEquals(3, testShape.getWidth()); 
    assertEquals(4, testShape.getHeight()); 
    
    // test constructor with size parameter
    testShape = new Rectangle(5,6);
    assertEquals(5, testShape.getWidth()); 
    assertEquals(6, testShape.getHeight()); 
  }
  
  @Test
  public void testRectangleWidth() {  
    // test setSize()
    Rectangle testShape = new Rectangle(5,4);
    testShape.setWidth(6);
    assertEquals(6, testShape.getWidth()); 
  }

  @Test
  public void testRectangleHeight() {  
    // test setSize()
    Rectangle testShape = new Rectangle(7,8);
    testShape.setHeight(3);
    assertEquals(3, testShape.getHeight()); 
  }

  @Test
  public void testRectangleCircumference() {  
    // test circumference()
    Rectangle testShape = new Rectangle(6,3);
    assertEquals(18.0, testShape.circumference(), 1e-6); 
  }
    @Test
    public void testRectangleArea() {  
      // test area()
      Rectangle testShape = new Rectangle(5,7);
      assertEquals(35.0, testShape.area(), 1e-6); 
  }

}
