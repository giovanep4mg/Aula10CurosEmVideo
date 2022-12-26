
package aula10curosemvideo;


public class Funcionario extends Pessoa{
    
    //atributos
    private String setor;
    private boolean trabalhando;
    
    
    public void status(){
        
        // retorna esses dados aqui 
        System.out.println("______________FUNCIONARIO_____________");
        System.out.println("O seu nome é "+this.getNome());
        System.out.println("Sua idade é "+this.getIdade());
        System.out.println("Seu sexo é "+this.getSexo());
        System.out.println("Sua setor de trabalho  é "+this.getSetor());
        System.out.println("Está trabalhando : "+this.isTrabalhando());
        System.out.println("==============================================");
    
    }
    
    //metodo
    public void mudarTrabalho(){
        
        // vai na variável trabalhando e coloca "true"
        this.trabalhando = true ;
    
    }
    
    
    //metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
