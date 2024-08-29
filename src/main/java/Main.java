import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Programa que soma numeros inteiros ate que entre o numero 0");
    
    int cal = sc.nextInt();
    int soma = 0;
    
    while (cal != 0){
      
      soma = soma + cal;
      cal = sc.nextInt();
      
    };
    System.out.println(soma);
    
    sc.close();
 }


}