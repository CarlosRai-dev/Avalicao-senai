
package avaliacao;


public class Engenheiro extends Funcionario{
    
   private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\n insira seu cpf: "+super.cpf+
                "\n insira seu rg: "+super.rg+
                "\n insira seu numero matricula: "+super.matricula+
                "\n insira seu setor: "+super.setor+
                "\n insira seu salario: "+super.salario+
                "\n insira o numero do seu id: "+super.id+
                 "\n informe seu nome : "+super.nome+
                 "\n insira seu telefone: "+super.telefone+
                  "\n insira seu email: "+super.email+
                   "\n insira seu endereço: "+super.endereco+
                    "\n insira seu crea: "+this.crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
   
   
   
}
