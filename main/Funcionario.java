import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private BigDecimal salario;
    private String funcao;

    //Construtores
    public Funcionario(){

    }
    public Funcionario(String nome, LocalDate data, BigDecimal salario, String funcao){
        this.nome = nome;
        this.dataNascimento = data;
        this.salario = salario;
        this.funcao = funcao;
    }

    //Getters and Setters
    public BigDecimal getSalario(){
        return salario;
    }
    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }

    public String getFuncao(){
        return funcao;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
}
