
package avaliacao;


public class Advogado extends Funcionario{
  
    private String oab;

    public Advogado() {
    }

    public Advogado(String crea, String cpf, String rg, String matricula, Setor setor, double salario, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, id, nome, telefone, email, endereco);
        this.oab = oab;
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
                    "\n insira seu crea: "+this.oab;
    }

    public String getCrea() {
        return oab;
    }

    public void setCrea(String crea) {
        this.oab = crea;
    }
 
    
    
}
