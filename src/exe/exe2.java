package exe;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] nomeVar = new double[n];
        for (int i=0; i<n; i++){
            nomeVar[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma += nomeVar[i];
        }
         double media = soma / n;
        System.out.printf("%.2f%n",media);

        sc.close();
    }
}
