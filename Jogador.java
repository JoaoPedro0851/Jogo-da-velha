public class Jogador{
    private String nome;
    private int id;

    public Jogador(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("ID: "+ id);
    }
}