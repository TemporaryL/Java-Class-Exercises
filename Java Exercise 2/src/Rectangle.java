public class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle() {
      width = 3;
      height = 4;
    }
      public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
    }
    public int getWidth(){return width;}
    public int getHeight(){return height;}
    public void setWidth(int width){this.width = width;}
    public void setHeight(int height){this.height = height;}
    public int getSize(){return size;}
    public void setSize(int size) { this.size = size; }
    
    @Override
    public void draw() {
      for (int i = 1; i <= height; i++) {
        for (int j = 1; j <= width; j++) {
            System.out.print("*");
        }
        System.out.println();
      }
    }
  
    @Override
    public float area() {
      float area = getWidth() * getHeight();
      return area;
    }
  
    @Override
    public float circumference() {
      float circ = getWidth() * 2 + getHeight() * 2;
      return circ;
    }
    public static void main(String[] args){
      Shape aRectangle = new Rectangle(3,4);
      aRectangle.draw();
    }
  }