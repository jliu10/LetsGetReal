public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    //TO BE IMPLEMENTED
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    if(getValue()==0) return other.getValue()==0;
    if(other.getValue()==0) return getValue()==0;
    double percentDiff=Math.abs(getValue()-other.getValue());
    percentDiff=percentDiff/((Math.abs(getValue())+Math.abs(other.getValue()))/2);
    return percentDiff<=0.00001;
}
