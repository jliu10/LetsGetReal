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

    addTester(zero,zero);
    addTester(one,zero);
    addTester(zero,neg);
    addTester(half,neg);
    addTester(neg,neg);
  }
}
