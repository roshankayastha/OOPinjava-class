class plus{
    int a,b,sum;
    plus(int a,int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
}
class minus{
    int x,y,sub;
    minus(int x, int y){
        this.x =x;
        this.y=y;
    }
    void display(){
        sub = x-y;
        System.out.println("The sub of "+x+" and "+y+" is "+sub);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        plus add = new plus(10,5);
        minus subtract = new minus(10,5);
        add.display();
        subtract.display();
    }
}
