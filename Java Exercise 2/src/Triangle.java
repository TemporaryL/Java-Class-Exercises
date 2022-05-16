public class Triangle extends Shape{
  // An equilateral triangle

  public Triangle() {
    super();
  }
    public Triangle(int i) {
    super(i);
  }

  @Override  
  public void draw() {

    for (int loop1=0; loop1<size; loop1++){
      for (int loop2=loop1; loop2<(size-1); loop2++) {
        System.out.print(" ");
      }
      System.out.print("/");
      for (int loop2=0; loop2<loop1; loop2++){
        System.out.print("  ");
      }
      System.out.println("\\");
    }
    for (int loop1=0; loop1<size; loop1++){
      System.out.print("--");
    }
    System.out.println("");
  }

  @Override
  public float area() {
    float fSize = size;
    float area = 0.5f * fSize * fSize;
    return area;
  }

  @Override
  public float circumference() {
    float fSize = size;
    float circ = fSize + fSize +fSize;
    return circ;
  }

}
