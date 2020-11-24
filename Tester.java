public class Tester{
  public static void equalsTester(RealNumber x, RealNumber y){
    System.out.print(x+" equals "+y+" is ");
    System.out.print(x.equals(y));
    System.out.println();
  }

  public static void addTester(RealNumber x, RealNumber y){
    System.out.print(x+" add "+y+" is ");
    System.out.print(x.add(y));
    System.out.println();
  }

  public static void multiplyTester(RealNumber x, RealNumber y){
    System.out.print(x+" multiply "+y+" is ");
    System.out.print(x.multiply(y));
    System.out.println();
  }

  public static void divideTester(RealNumber x, RealNumber y){
    System.out.print(x+" divide "+y+" is ");
    System.out.print(x.divide(y));
    System.out.println();
  }

  public static void subtractTester(RealNumber x, RealNumber y){
    System.out.print(x+" subtract "+y+" is ");
    System.out.print(x.subtract(y));
    System.out.println();
  }

  public static void reciprocalTester(RationalNumber x){
    System.out.print(x+" reciprocal is ");
    System.out.print(x.reciprocal());
    System.out.println();
  }

  public static void compareToTester(Number x, Number y){
    System.out.print(x+" compared to "+y+" is ");
    System.out.print(x.compareTo(y));
    System.out.println();
  }

  public static void main(String[] args){
    RealNumber zero=new RealNumber(0);
    RealNumber one=new RealNumber(1);
    RealNumber two=new RealNumber(2);
    RealNumber neg=new RealNumber(-1);
    RealNumber half=new RealNumber(0.5);

    System.out.println();
    System.out.println("-----Testing RealNumber-----");

    equalsTester(zero,zero);
    equalsTester(zero,one);
    equalsTester(two,zero);
    equalsTester(one,one);
    equalsTester(one,two);
    equalsTester(two,one);
    equalsTester(half,one);
    equalsTester(zero,half);
    equalsTester(zero,zero.multiply(neg));

    addTester(zero,zero);
    addTester(one,zero);
    addTester(zero,neg);
    addTester(half,neg);
    addTester(neg,neg);
    addTester(one,two);
    addTester(two,half);

    multiplyTester(zero,zero);
    multiplyTester(one,zero);
    multiplyTester(zero,neg);
    multiplyTester(half,neg);
    multiplyTester(neg,neg);
    multiplyTester(one,two);
    multiplyTester(two,half);

    divideTester(zero,zero);
    divideTester(one,zero);
    divideTester(zero,neg);
    divideTester(half,neg);
    divideTester(neg,neg);
    divideTester(one,two);
    divideTester(two,half);

    subtractTester(zero,zero);
    subtractTester(one,zero);
    subtractTester(zero,neg);
    subtractTester(half,neg);
    subtractTester(neg,neg);
    subtractTester(one,two);
    subtractTester(two,half);

    System.out.println();
    System.out.println("-----Testing RationalNumber-----");

    RationalNumber zeroR=new RationalNumber(0,0);
    RationalNumber halfR=new RationalNumber(1,2);
    RationalNumber half1R=new RationalNumber(2,4);
    RationalNumber negR=new RationalNumber(-2,2);
    RationalNumber oneR=new RationalNumber(1,1);
    RationalNumber one1R=new RationalNumber(-2,-2);

    reciprocalTester(zeroR);
    reciprocalTester(halfR);
    reciprocalTester(half1R);
    reciprocalTester(negR);
    reciprocalTester(oneR);
    reciprocalTester(one1R);

    equalsTester(zeroR,zeroR);
    equalsTester(halfR,zeroR);
    equalsTester(halfR,half1R);
    equalsTester(oneR,oneR);

    multiplyTester(zeroR,zeroR);
    multiplyTester(halfR,zeroR); //1/2 multiply 0/1 is 0/1
    multiplyTester(halfR,half1R);
    multiplyTester(oneR,oneR);
    multiplyTester(negR,half1R);

    divideTester(zeroR,zeroR);
    divideTester(halfR,zeroR);
    divideTester(halfR,half1R);
    divideTester(oneR,oneR);
    divideTester(negR,half1R);

    addTester(zeroR,zeroR);
    addTester(halfR,zeroR);
    addTester(halfR,half1R);
    addTester(oneR,oneR);
    addTester(negR,half1R);
    addTester(oneR,half1R);

    subtractTester(zeroR,zeroR);
    subtractTester(halfR,zeroR);
    subtractTester(halfR,half1R);
    subtractTester(oneR,oneR);
    subtractTester(negR,half1R);

    addTester(one,halfR);
    divideTester(two,zeroR);
    multiplyTester(one1R,half);
    equalsTester(one,oneR);

    compareToTester(one,halfR);
    compareToTester(one,oneR);
    compareToTester(half,one1R);
    compareToTester(zeroR,zero);

  }
}
