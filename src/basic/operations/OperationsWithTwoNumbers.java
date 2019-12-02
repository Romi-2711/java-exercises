package basic.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationsWithTwoNumbers {

  public static void main(String[] args) throws IOException {


    int a, b;
    int c, d;

    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));


    System.out.println("Numero entero = ");
    a = Integer.parseInt(br.readLine());
    System.out.println("Numero entero = ");
    b = Integer.parseInt(br.readLine());
    System.out.println("Numero real = ");
    c = Integer.parseInt(br.readLine());
    System.out.println("Numero real = ");
    d = Integer.parseInt(br.readLine());

    System.out.println("a+b = "+(a+b));
    System.out.println("a-b = "+(a-b));
    System.out.println("a*b = "+(a*b));
    System.out.println("a/b = "+(a/b));
    System.out.println("a%b = "+(a&b));

    System.out.println("c+d = "+(c+d));
    System.out.println("c-d = "+(c-d));
    System.out.println("c*d = "+(c*d));
    System.out.println("c/d = "+(c/d));
    System.out.println("c%d = "+(c%d));

    System.out.println("a+c = "+(a+c));
    System.out.println("a-c = "+(a-c));
    System.out.println("a*c = "+(a*c));
    System.out.println("a/c = "+(a/c));
    System.out.println("a%c = "+(a%c));






  }

}
