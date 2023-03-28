
package avaliacao;

public class Main{
    public static void main(String[] args) {
    
      Advogado advogado = new Advogado("central", "12345678", "000142123", "145451131", Setor.JURIDICO,12318754 , 22314, "carlos", "7132147584", "abcd.com", new Endereco("rua", "181", "casa", "40711320", "Salvador", UnidadeFederativa.ACRE));
      Engenheiro engenheiro = new Engenheiro("central", "12345678", "000142123", "145451131", Setor.ENGENHARIA, 112314, 22314, "carlos", "7132147584", "abcd.com",new Endereco("rua", "181", "casa", "40711320", "Salvador", UnidadeFederativa.BAHIA) );
      Medico medico = new Medico("central", "910541321", "1234568", "1214765", Setor.SAUDE, 1231465, 22314, "carlos", "7132147584", "abcd.com", new Endereco("rua", "181", "casa", "40711320", "Salvador", UnidadeFederativa.BAHIA));
      Juridica juridica = new Juridica("14651749841", "12131415613");
      Cliente cliente = new Cliente(123145);
    
    }


}
