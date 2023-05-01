package pjbl1;

import java.util.Scanner;

/*Calcula o valor do último termo de uma Progressão Aritmética (PA) de n termos e a sua soma a partir do valor do primeiro
elemento da PA e da sua razão. Forma geral de uma PA de m termos: C = {a1 , a2 , a3 , ..., a n }
Fórmula do termo geral de uma PA de razão r: ai = a1 + (i-1) r
Fórmula da soma dos (n) primeiros termos de uma PA: S n = (a 1 + an ) n/2 */

public class principal {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digie o valor do primeiro termo da PA");
        double a_1 = sc.nextDouble();

        System.out.println("Digie a razão da PA");
        double r = sc.nextDouble();

        System.out.println("Digie o número de termos da PA");
        int n = sc.nextInt();

        double a_n = a_1 + (n-1) * r;
        System.out.println("Ultimo termo da PA");
        System.out.println(a_n);

        double S_n = (a_1 + a_n) * n/2;
        System.out.println("Soma de todos os termos da PA");
        System.out.println(S_n);


    }


}
