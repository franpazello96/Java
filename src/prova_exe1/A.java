package prova_exe1;

public class A {
    public static void main(String args[]) {
        Geladeira g = new Geladeira(35, 50, 300);
        Notebook n = new Notebook(81, 3.5, 8);
        System.out.println(g.seguro());
        System.out.println(n.seguro());
    }
}


