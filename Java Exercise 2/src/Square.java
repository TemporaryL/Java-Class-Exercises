public class Square extends Shape{
  public Square() {
    super();
  }
    public Square(int i) {
    super(i);
  }

  @Override  
  public void draw() {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
          System.out.print("*");
      }
      System.out.println();
    }
  }

  @Override
  public float area() {
    float fSize = size;
    float area = fSize * fSize;
    return area;
  }

  @Override
  public float circumference() {
    float fSize = size;
    float circ = fSize + fSize + fSize + fSize;
    return circ;
  }
  public static void main(String[] args){
    Shape aSquare = new Square(4);
    aSquare.draw();
  }
}