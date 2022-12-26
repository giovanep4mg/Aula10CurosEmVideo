
package aula10curosemvideo;


public class Pessoa {
    // atributos
    private String nome ;
    private int idade;
    private String sexo;
    
    
    // metodo 
    public void fazerAniversario(){
        
      // vai na variável idade , e coloca mais 1.
        this.idade = idade + 1 ;
        
    }

   public void status(){
       //vai retorna esses dados 
       System.out.println("_____________PESSOA___________");
       System.out.println("Nome da pessoa : "+this.getNome());
       System.out.println("Idade : "+this.getIdade());
       System.out.println("sexo : "+this.getSexo());
       System.out.println("__________________________");
   }

   
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String detalhesPessoa() {
        return "Pessoa{" + "nome=" + nome + "\n, idade=" + idade + "\n, sexo=" + sexo + '}';
    }
    
    
    
    
    
    
    
}
