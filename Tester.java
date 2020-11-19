public class Tester{
  public static void equalsTester(RealNumber x, RealNumber y){
    System.out.println(x.equals(y));
  }

  public static void main(String[] args){
    RealNumber zero=new RealNumber(0);
    RealNumber one=new RealNumber(1);
    RealNumber two=new RealNumber(2);

    equalsTester(zero,zero);
    equalsTester(zero,one);
    equalsTester(two,zero);
    equalsTester(one,one);
    equalsTester(one,two);
    equalsTester(two,one);
  }
}
