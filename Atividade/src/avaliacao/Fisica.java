
package avaliacao;


public class Fisica {
    
    protected int idade;
    protected Genero genero;

    public Fisica() {
    }

    public Fisica(int idade, Genero genero) {
        this.idade = idade;
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
}
