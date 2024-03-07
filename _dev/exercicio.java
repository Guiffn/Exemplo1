import java.util.Scanner;

public class exercicio {
    
    static public void main(String[] args){

     Scanner leitor = new Scanner(System.in);

     System.out.println("Escreva o nome do aluno");
      String s = leitor.next();

      System.out.println("Escreva sua matricula: ");
      int m = leitor.nextInt();

      System.out.println("Digite nota 1 ");
      double not1 = leitor.nextDouble();

      System.out.println("Digite nota 2 ");
      double not2 = leitor.nextDouble();

      double resultado = (not1+not2)/2;


     System.out.println("Nome: " +s); 
     System.out.println("Matricula: " +m);
     if(resultado >= 60){
      System.out.println("aprovado aluno: " +s );
     }else{
      System.out.println("Reprovado aluno: " +s);
     }
     System.out.println("Nota: "+resultado);

   leitor.close(); }
}
