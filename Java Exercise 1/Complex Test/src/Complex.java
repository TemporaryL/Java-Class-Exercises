public class Complex {
    public double real;
    public double imag;
  
    public Complex()
    {
      real = 0;
      imag = 0;
    }
  
    public Complex(double r, double i)
    {
      real = r;
      imag = i;
      double d = Math.atan2(i,r);
    }
  
    public double imag()
    {
      return imag;
    }
  
    public double real()
    {
      return real;
    }
    public double magnitude()
    {
      return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }
    public double argument()
    {
      return Math.atan2(imag,real);
    }
    public String toString()
    {
      String answer = "";
      if (real == 0){
        answer = "j" + imag;
      } else if (imag == 0) {
        answer = Double.toString(real);
      } else if (imag < 0){
        answer = Double.toString(real) + " - " + "j" + Math.abs(imag);
      } else {
        answer = Double.toString(real) + " + " + "j" + imag;
      }
      return answer;

    }
    public Complex add(Complex n){
      Complex res = new Complex(0,0);
      res.real = n.real + this.real;
      res.imag = n.imag + this.imag;
      return res;
    }
}