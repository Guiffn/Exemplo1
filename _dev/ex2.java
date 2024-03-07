import java.util.Scanner;
public class ex2 {
public static void main(String [] args){

  Scanner leitor = new Scanner(System.in);
  String nome[]  = new String[3];

  int matri[] = new int[3];
  int not1[] = new int[3];
  int not2[] = new int[3];
  double resultado[] = new double[3];

     for(int i=0;i<3;i++){
         System.out.println("Digite o nome ");
         nome[i] = leitor.nextLine();

        System.out.println("Digite sua matricula: ");
        matri[i] = leitor.nextInt();
        
         System.out.println("Digite sua nota 1: ");
         not1[i] = leitor.nextInt();

         System.out.println("Digite sua nota 2: ");
         not2[i] = leitor.nextInt();
         resultado[i]=(not1[i]+not2[i])/2;
          leitor.nextLine(); 
          
          
    }
   

for(int i=0;i<3;i++){
    if(resultado[i]<60){
     System.out.println("Os nome: "+nome[i]+" Matricula: "+matri[i]+" Resultado:"+resultado[i]+" Reprovado" );
  }
  else{
    System.out.println("Os nome: "+nome[i]+" Matricula: "+matri[i]+" Resultado:"+resultado[i]+" Aprovado" );
  }
 }
       
    
        
        leitor.close();
}
}
