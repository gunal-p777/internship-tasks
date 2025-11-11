import java.util.Scanner;

class calucaltor{
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);
        int a=k.nextInt();
        int b=k.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a/b;
        int f=a*b;
        System.out.println("Additon:"+c);
        System.out.println("Subtraction:"+d);
        System.out.println("Division:"+e);
        System.out.println("Mutliplication:"+f);
    }
}