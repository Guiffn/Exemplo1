import java.util.Scanner;
public class ex3 {
 public static void main(String[] args){
    
    Scanner leitor = new Scanner(System.in);
   
    String name[]= new String[3];
    int matri[] = new int[3];
    int not1[] = new int[3];
    int not2[] = new int[3];
    int not3[] = new int[3];
    int not4[] = new int[3];
    int not5[] = new int[3];
  

        for(int i=0;i<3;i++){
            System.out.println("Digite o nome do aluno");
             name[i]= leitor.nextLine();

            System.out.println("Digite sua matricula");
            matri[i]=leitor.nextInt();

            System.out.println("DIgite nota 1: ");
            not1[i]=leitor.nextInt();

            System.out.println("DIgite nota 2: ");
            not2[i]=leitor.nextInt();

            System.out.println("DIgite nota 3: ");
            not3[i]=leitor.nextInt();

            System.out.println("DIgite nota 4: ");
            not4[i]=leitor.nextInt();

            System.out.println("DIgite nota 5: ");
            not5[i]=leitor.nextInt();
            leitor.nextLine();
        }

    for(int i=0;i<3;i++){
    System.out.println("Aluno: "+name[i]+" matricula: "+matri[i]+" nota 1:"+not1+" nota 2:"+not2+" nota 3:"+not3+" nota 4:"+not4+" nota 5:"+not5);
    }



 

        leitor.close();
}
}
