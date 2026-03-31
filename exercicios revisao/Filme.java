package pkg;

public class Filme {
    public String titulo;
    public float duracao; 
    public int classificacao;

    public Filme(String titulo, float duracao, int classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public double converterDuracaoHoras() {
        return this.duracao / 60.0; 
    }

    
    public void podeAssistir(int idade) {
        if (idade >= this.classificacao) {
            System.out.println("Pode assistir!");
        } else {
            System.out.println("Nao pode assistir");
        }
    }

    public String descricaoFilme() {
        
        return "titulo filme: " + this.titulo + " | Duracao: " + this.duracao + " | Classificacao: " + this.classificacao;
    }

    public static void main(String[] args) {
        Filme f1 = new Filme("XXX", 120f, 18);
        System.out.println(f1.descricaoFilme());
        
       
        f1.podeAssistir(17); 
    }
}
