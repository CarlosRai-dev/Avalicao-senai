package avaliacao;

public class Cliente {
    
    protected int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\n insira o protocolo de atendimento";
    }

    
    
    
    
    
    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }



}
