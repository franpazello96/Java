package exe;

import java.util.Locale;
import java.util.Scanner;

public class exe3 {
     public static void main (String[] args){
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

         exe3_produto[] vetor = new exe3_produto[n];
         for(int i=0; i<vetor.length; i++){
             sc.nextLine();
             String name = sc.nextLine();
             double price =  sc.nextDouble();

             vetor[i] = new exe3_produto(name, price);
         }
         double soma = 0.0;
         for(int i=0; i<vetor.length; i++){
             soma +=vetor[i].getPrice();
         }
         double media = soma / vetor.length;
         System.out.println(media);

         sc.close();
     }
}
