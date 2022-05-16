abstract public class Shape {

  protected int size;

  abstract public void draw();
  abstract public float area();
  abstract public float circumference();

  public int getSize() { return size; }
  public void setSize(int size) { this.size = size; }

  public Shape(){
    this.size = 3;
  }

  public Shape(int size){
    this.size = size;
  }
}