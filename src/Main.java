import java.util.Arrays;
class Test {
int a=5;
  Test(){
      System.out.println("test");
  }
  void m(){
      System.out.println("m");
  }

}
public class Main extends Test {
 Main(){
     super();
     super.m();
     System.out.println(super.a);
     this.m1();
 }
 void m1(){

 }
    public static void main(String[] args) {
      Main main=new Main();


    }

}





