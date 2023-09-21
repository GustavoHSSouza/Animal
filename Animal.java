// Classe Animal
public class Animal {
    // Atributos da classe
    private String nome;
    private String tipo; // Exemplo: mamífero, réptil, etc.
    private String som;  // Exemplo: latido, miado, etc.

    // Construtor para inicializar os atributos
    public Animal(String nome, String tipo, String som) {
        this.nome = nome;
        this.tipo = tipo;
        this.som = som;
    }

    // Método para definir o som do animal
    public void setSom(String som) {
        this.som = som;
    }

    // Método para fazer o animal emitir o som
    public void fazerSom() {
        System.out.println(nome + " faz " + som + "!");
    }

    // Método para alimentar o animal
    public void alimentar() {
        System.out.println("Alimentando " + nome);
    }

    // Método para fazer o animal dormir
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Método para mostrar informações do animal
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Som: " + som);
    }

    // Método main para demonstrar a instanciação de objetos e chamada de métodos
    public static void main(String[] args) {
        // Criando um objeto da classe Animal (um cachorro)
        Animal meuAnimal = new Animal("Rex", "Mamífero", "Latido");
        
        // Chamando os métodos do objeto
        meuAnimal.mostrarInfo();
        meuAnimal.fazerSom();
        meuAnimal.alimentar();
        meuAnimal.dormir();
    }
}

