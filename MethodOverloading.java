class Cal{
    int a,b;
    public int sum(int a, int b){
        System.out.print("The sum of "+a+" and "+b+" = ");
        return (a+b);
    }
    public int sub(int a, int b){
        System.out.print("The sub of "+a+" and "+b+" = ");
        return(a-b);
    }
}
public class MethodOverloading{
public static void main(String[] args) {
 Cal c = new Cal();
    System.out.println(c.sum(10,5));
    System.out.println(c.sub(10,5));
}
}