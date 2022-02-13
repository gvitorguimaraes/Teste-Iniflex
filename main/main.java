import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;


class main{

    public static void main(String[] args){
        ArrayList<Funcionario> lista = new ArrayList<>();
        HashMap<String, Funcionario> hash = new HashMap<>();
        
        // 3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
        LocalDate auxData;
        BigDecimal auxSalario, aux2, aumento;
        aumento = new BigDecimal(1.1);

        // Maria
        auxData = LocalDate.of(2000, 10, 18);
        auxSalario = new BigDecimal(2009.44);
        lista.add(new Funcionario("Maria", auxData, auxSalario, "Operador"));

        // João
        auxData = LocalDate.of(1990, 05, 12);
        auxSalario = new BigDecimal(2284.38);
        lista.add(new Funcionario("João", auxData, auxSalario, "Operador"));

        // Caio
        auxData = LocalDate.of(1961, 05, 02);
        auxSalario = new BigDecimal(9836.14);
        lista.add(new Funcionario("Caio", auxData, auxSalario, "Coordenador"));
        
        // Miguel
        auxData = LocalDate.of(1988, 10, 14);
        auxSalario = new BigDecimal(19119.88);
        lista.add(new Funcionario("Miguel", auxData, auxSalario, "Diretor"));
        
        // Alice
        auxData = LocalDate.of(1995,01,05);
        auxSalario = new BigDecimal(2234.68);
        lista.add(new Funcionario("Alice", auxData, auxSalario, "Recepicionista"));
        
        // Heitor
        auxData = LocalDate.of(1999, 11, 19);
        auxSalario = new BigDecimal(1582.72);
        lista.add(new Funcionario("Heitor", auxData, auxSalario, "Operador"));

        // Arthur
        auxData = LocalDate.of(1993, 03, 31);
        auxSalario = new BigDecimal(4071.84);
        lista.add(new Funcionario("Arthur", auxData, auxSalario, "Contador"));
        
        // Laura
        auxData = LocalDate.of(1994, 07, 8);
        auxSalario = new BigDecimal(3017.45);
        lista.add(new Funcionario("Laura", auxData, auxSalario, "Gerente"));

        // Heloisa
        auxData = LocalDate.of(2003, 05, 24);
        auxSalario = new BigDecimal(1606.85);
        lista.add(new Funcionario("Heloisa", auxData, auxSalario, "Eletricista"));

        // Helena
        auxData = LocalDate.of(1996, 9,02);
        auxSalario = new BigDecimal(2799.93);
        lista.add(new Funcionario("Helena", auxData, auxSalario, "Gerente"));

        // 3.2 – Remover o funcionário “João” da lista.

        int i = 0;
        Funcionario aux;
        while(lista.size() > i){
            aux = lista.get(i);
            if(aux.getNome() == "João"){
                lista.remove(i);
                break;
            }
            i++;
        }

        // */ 3.3 – Imprimir todos os funcionários com todas suas informações, sendo que: **FALTA FORMATAÇÃO DA DATA**
        System.out.println("\n>> TODOS OS FUNCIONARIOS\n");
        for(i = 0; i < lista.size(); i++){
            aux = lista.get(i);
            System.out.println(aux.getNome()+" | "+aux.getDataNasc()+" | R$ "+aux.getSalario().setScale(2, BigDecimal.ROUND_HALF_EVEN)+" | "+aux.getFuncao()+"\n");
        }

        // 3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.

        while(lista.size() > i){
            aux2 = lista.get(i).getSalario();
            lista.get(i).setSalario(aux2.multiply(aumento));
            i++;
        }

        // 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
        
        for(i = 0; i < lista.size(); i++){
            switch(lista.get(i).getFuncao()){
                case "Operador":
                    hash.put("Operador", lista.get(i));
                    break;
                case "Gerente":
                    hash.put("Gerente", lista.get(i));
                    break;
                case "Coordenador":
                    hash.put("Coordenador", lista.get(i));
                    break;
                case "Diretor":
                    hash.put("Diretor", lista.get(i));
                    break;
                case "Recepicionista":
                    hash.put("Recepicionista", lista.get(i));
                    break;
                case "Contador":
                    hash.put("Contador", lista.get(i));
                    break;
                case "Eletricista":
                    hash.put("Eletricista", lista.get(i));
                    break;
            }
        }
        
        //3.6 – Imprimir os funcionários, agrupados por função ** Não consegui desenvolver**!
        

        // 3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12
        System.out.println(">> FUNCIONARIOS QUE FAZEM ANIVERSARIO NO MES 10 e 12\n");
        for(i = 0; i < lista.size(); i++){
            if(lista.get(i).getDataNasc().getMonthValue() == 10 || lista.get(i).getDataNasc().getMonthValue() == 12)
                System.out.println(lista.get(i).getNome()+" => "+lista.get(i).getDataNasc());
        }

        // 3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
        int maisVelho = lista.get(0).getDataNasc().getYear();
        int j = 0;
        for(i = 0; i < lista.size(); i++){
            if(lista.get(i).getDataNasc().getYear() < maisVelho){
                maisVelho = lista.get(i).getDataNasc().getYear();
                j = i;
            }
        }
        System.out.println("\n>> FUNCIONARIO MAIS VELHO: \n\n"+lista.get(j).getNome()+ " => "+(2022-maisVelho));

        // 3.10 – Imprimir a lista de funcionários por ordem alfabética ** Não consegui desenvolver **

        // 3.11 – Imprimir o total dos salários dos funcionários.

        BigDecimal total = new BigDecimal(0);
        for(i = 0; i < lista.size(); i++){
            aux2 = lista.get(i).getSalario();
            total = total.add(aux2);
        }
        System.out.println("\n>> SOMA DE TODOS OS SALARIOS: \n\nR$ "+total.setScale(2, BigDecimal.ROUND_HALF_EVEN));

        // 3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00. **Não Consegui desenvolver**
        
        /** 
        BigDecimal salarioMinimo = new BigDecimal(1212);                                    ERRO: java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        for(i =0; i < lista.size(); i++){
            System.out.println(">> "+lista.get(i).getNome()+" => "+lista.get(i).getSalario().divide(salarioMinimo));
        }
        **/
    }
}