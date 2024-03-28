class Sum{
    int a,b;
  public Sum(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
      int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
}
public class ParameterizedConstructorSum {
    public static void main(String[] args) {
        Sum add  = new Sum(15,20);
        add.display();
    }
}
