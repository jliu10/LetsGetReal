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

  public static void main(String[] args){
    RealNumber zero=new RealNumber(0);
    RealNumber one=new RealNumber(1);
    RealNumber two=new RealNumber(2);
    RealNumber neg=new RealNumber(-1);
    RealNumber half=new RealNumber(0.5);

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
  }
}
