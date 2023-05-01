import java.util.ArrayList;

class Empresa {
    public static void main(String args[])
    {
        Mensalista mario = new Mensalista("Mario", 5000);
        System.out.println( mario.remuneracao()); // Quadro 1
        Horista silvia = new Horista("Silvia", 40, 80);
        System.out.println( silvia.remuneracao()); // Quadro 2
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add( new Mensalista("Miguel", 4000));
        funcionarios.add( new Horista("Patricia", 20, 50));
        funcionarios.add( new Comissionado("Emerson", 2000, 0.1));
        for (Funcionario f: funcionarios)
        {
            System.out.println( f.remuneracao() ); // Quadros 3, 4 e 5
        }
    }
}
//=====================================================================================================================

abstract class Funcionario {
    private String nome;
    //===================================
    public Funcionario(String nome)
    {
        this.nome = nome;
    }
    //===================================
    public abstract double remuneracao();
}

//=====================================================================================================================

class Horista extends Funcionario {
    private int numero_horas;
    private double valor_hora;
    //=========================================
    public Horista(String nome, int numero_horas, double valor_hora)
    {
        super(nome);
        this.numero_horas = numero_horas;
        this.valor_hora = valor_hora;
    }


    //========================================
    public double remuneracao()
    {
        return (numero_horas * valor_hora);
    }
}


//=====================================================================================================================
class Mensalista extends Funcionario {
    protected double salario_mensal;
    //==================================
    public Mensalista(String nome, double salario_mensal)
    {
        super(nome);
        this.salario_mensal = salario_mensal;
    }
    //===================================
    protected double gratificacao()
    {
        return 0;
    }
    //==================================
    public double remuneracao()
    {
        return (salario_mensal + gratificacao());
    }
}

//=====================================================================================================================
class Comissionado extends Mensalista {
    private double bonus_percentual;
    //=============================
    public Comissionado(String nome, double salario_mensal, double bonus_percentual)
    {
        super(nome, salario_mensal);
        this.bonus_percentual = bonus_percentual;
    }
    //=============================
    protected double gratificacao()
    {
        return (salario_mensal * bonus_percentual);
    }
}