public class swap {
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("before swap a= "+a);
        System.out.println("before swap b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap a= "+a);
        System.out.println("After swap b= "+b);
        // multiply divide
        int c=100;
        int d=200;
        System.out.println("before swap a= "+c);
        System.out.println("before swap b= "+d);
        c=c*d;
        d=c/d;
        c=c/d;
        System.out.println("After swap a= "+c);
        System.out.println("After swap b= "+d);
        // ^ operator
        int e=30;
        int f=40;
        System.out.println("before swap a= "+e);
        System.out.println("before swap b= "+f);
        e=e^f;
        f=e^f;
        e=e^f;
        System.out.println("After swap a= "+e);
        System.out.println("After swap b= "+f);
    }
}
