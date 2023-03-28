
package avaliacao;


public class Juridica {
    
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\n insira seu cnpj"+this.cnpj+
                "\n insira sua inscrição estadual"+this.inscricaoEstadual;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
