import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

         //Exercicio 1
        // System.out.println("Digite um lado do retangulo");
        //  int a = leitor.nextInt();
        //  System.out.println("Digite um lado do retangulo");
        //  int b = leitor.nextInt();
        //  int resultado = a * b;
        //  System.out.println("Resultado: "+resultado);

        
      // Exxercicio 2
    //     System.out.println("Digite um valor: ");
    //     int num = leitor.nextInt();
    //     double dolar = num /5.17 ;
    //     double euro = num /6.14;
    //     double peso = num * 170 ;

    //     System.out.println("O resultado em dolar "+dolar );
    //    System.out.println("O resultado em dolar "+euro);
    //    System.out.println("O resultado em dolar "+peso);
 

    // //Exercicio Numero 3
    //     System.out.println("Digite um valor: ");
    //     int num1 = leitor.nextInt();
    //     System.out.println("Digite um valor: ");
    //     int num2 = leitor.nextInt();
        
    //     if(num1>num2){

    //         System.out.println("O maior numero e: " +num1);
    //         System.out.println("O menor numero e: " +num2);
    //     }else{
    //         System.out.println("O maior numero e: " +num2);
    //         System.out.println("O menor numero e: " +num1);
    //     }



    // //Exercicio 4
    // System.out.println("DIgite a idade");
    // int idade= leitor.nextInt();

    // if(idade <= 13){
    //     System.out.println("Criança");
    // }else if(idade > 13 && idade <= 18){
    //     System.out.println("Adolescente"); 
    // }else if(idade > 18 && idade <= 60){
    //     System.out.println("Adulto"); 
    // }else{
    //     System.out.println("Idoso");
    // }





        //  //Uso do while
        //  boolean executar = true;
        //  int contador =0;
        //  String[] letras = new String[]{"A", "B","C"};

        //  System.out.println("Posição 1: " +letras[0]);

        //  for(int i=0; i<3; i++){
        //     System.out.println("Letra"+letras[i]);
        //  }

        //  while(executar && contador < letras.length){
        //     System.out.println("Letra"+letras[contador]);
        //     contador++;
        //  }  



    //      //Uso do if:
    //     System.out.println("Digite um valor para A");
    //     int a = leitor.nextInt();
    //     System.out.println("Digite um valor para B");
    //     var b = leitor.nextInt();
    //     double resultado = (a + b)/ 2;

    //    // System.out.println("resultado " +resultado);
    //      if(resultado >= 6){
    //         System.out.println("Aprovado!!");}
    //         else{
    //             System.out.println("reprovado!!");
    //         }
        


        // Exemplo do Professor 
        //  int resultadoInteiro = (int) resultado ; //casting
        //  var resultadoDinamico = "a + b";
        //  var str = "é um texto?";
        //  var resultadoString = "a + b";

        //  System.out.println("resultadoInteiro " +resultadoInteiro);
        //  System.out.println("resultadoDinamico " +resultadoDinamico);
        //  System.out.println("str " + str);
        //  System.out.println("resultadoString " +resultadoString);

         //Exemplo de Texto string
        // System.out.println("Digite um texto...");
        // String texto = leitor.nextLine();
        // System.out.println("Texto digitado: " + texto);
        
        
           //Exemplo de texto int
        // System.out.println("Digite um numero inteiro...");
        // int inteiro = leitor.nextInt();
        // System.out.println("Numero digitado " + inteiro);
 
        //Exempplo de Double
        // System.out.println("Digite um numero decimal...");
        // double numero = leitor.nextDouble();
        // System.out.println("Numero digitado " + numero);

         leitor.close();
         

         


    }

}