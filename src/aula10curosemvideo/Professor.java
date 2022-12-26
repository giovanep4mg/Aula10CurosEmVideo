
package aula10curosemvideo;

public class Professor extends Pessoa{
    
    // atributos
    private String especialidade;
    private float salario;
    
    
    public void status(){
        // retorna os dados escritos aqui 
        System.out.println("______________PROFESSOR_____________");
        System.out.println("O seu nome é "+this.getNome());
        System.out.println("Sua idade é "+this.getIdade());
        System.out.println("Seu sexo é "+this.getSexo());
        System.out.println("Sua especialidade é "+this.getEspecialidade());
        System.out.println("Seu salário é "+this.getSalario());
        System.out.println("==============================================");
        
        
    }
    
    
    // metodo
    public void receberAumento(int aum){
        
        // vai na variável salario, acrescenta o valor em "aum" na variável
        this.salario = salario + aum ;
    
    }
    
    
    //metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
