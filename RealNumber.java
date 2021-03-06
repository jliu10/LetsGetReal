public class RealNumber extends Number{
  private double value;

  public RealNumber(){
    value=0.0;
  }

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.

  public boolean equals(RealNumber other){
    if(getValue()==0) return other.getValue()==0;
    if(other.getValue()==0) return getValue()==0;
    double percentDiff=Math.abs(getValue()-other.getValue());
    percentDiff=percentDiff/((Math.abs(getValue())+Math.abs(other.getValue()))/2);
    return percentDiff<=0.00001;
  }
  */

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)
     RealNumber sum=new RealNumber(getValue()+other.getValue());
     return sum;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    RealNumber prod=new RealNumber(getValue()*other.getValue());
    return prod;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    RealNumber quot=new RealNumber(getValue()/other.getValue());
    return quot;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    RealNumber diff=new RealNumber(getValue()-other.getValue());
    return diff;
  }
}
