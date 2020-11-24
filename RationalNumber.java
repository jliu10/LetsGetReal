public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    //super(0.0);//this value is ignored!
    if(deno==0){
      numerator=0;
      denominator=1;
    }else{
      numerator=nume;
      denominator=deno;
      reduce();
    }
  }

  public double getValue(){
    double n=getNumerator();
    return n/getDenominator();
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber recip=new RationalNumber(getDenominator(),getNumerator());
    return recip;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (getNumerator()==other.getNumerator() &&
            getDenominator()==other.getDenominator());
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if(getNumerator()==0) return "0";
    if(getDenominator()==-1) return "-"+getNumerator();
    String str="";
    if(getDenominator()==1) return str+getNumerator();
    str+=getNumerator()+"/"+getDenominator();
    return str;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one
    http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    */
    if(a!=0 && a<b){
      int t=a;
      a=b;
      b=t;
    }
    int r=a%b;
    while(r!=0){
      a=b;
      b=r;
      r=a%b;
    }
    return b;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int g=gcd(numerator,denominator);
    numerator=numerator/g;
    denominator=denominator/g;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int num=getNumerator()*other.getNumerator();
    int den=getDenominator()*other.getDenominator();
    RationalNumber prod=new RationalNumber(num,den);
    return prod;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int num=getNumerator()*other.getDenominator();
    int den=getDenominator()*other.getNumerator();
    RationalNumber quot=new RationalNumber(num,den);
    return quot;
  }

  public int lcm(int a, int b){
    int m=Math.abs(a*b);
    m/=gcd(a,b);
    return m;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int l=lcm(getDenominator(),other.getDenominator());
    int num=(l/getDenominator())*getNumerator()+
             (l/other.getDenominator())*other.getNumerator();
    int den=l;
    RationalNumber sum=new RationalNumber(num,den);
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int l=lcm(getDenominator(),other.getDenominator());
    int num=(l/getDenominator())*getNumerator()-
             (l/other.getDenominator())*other.getNumerator();
    int den=l;
    RationalNumber diff=new RationalNumber(num,den);
    return diff;
  }
}
