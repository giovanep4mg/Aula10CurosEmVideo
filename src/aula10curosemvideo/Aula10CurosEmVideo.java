/*
 programa para entender sobre classe Mae 
 */
package aula10curosemvideo;


public class Aula10CurosEmVideo {

    
    public static void main(String[] args) {
    // CRIEI OBJETO PESSOA  
        Pessoa p = new Pessoa();
        
    // CRIAR OBJETO ALUNO
        Aluno a = new Aluno();
      
    //criar um objeto Professor
        Professor Pro =new Professor();
        
    // criar um objeto funcionario
       Funcionario f = new Funcionario();
       
       
 
       // inserir dados no objeto Pessoa
       
       // vai na variável Nome e escreve lá 
       p.setNome("Giovani");
       //vai na variável idade e escreve lá 
       p.setIdade(39);
       //vai na variável sexo e escreve lá 
       p.setSexo("masculino");
       // vai retorna o metodo status , onde está salvo as informações da Pessoa
       p.status();  
     
       
     
       // inserir dados no objeto Aluno
       a.setNome("Guilherme");
       a.setCurso("Matemática");
       a.setMatricula(100);
       a.setIdade(12);
       a.setSexo("Masculino");
       a.status();
       
   
     // inserir dados no Professor
     Pro.setNome("Getúlio");
     Pro.setIdade(45);
     Pro.setSexo("Masculino");
     Pro.setEspecialidade("Matemática");
     Pro.setSalario(3500);
     Pro.receberAumento(100);
     Pro.status();
     
    // inserir dados do funcionario
    f.setNome("Gilson");
    f.setIdade(25);
    f.setSexo("Masculino");
    f.setSetor("faxineiro");
    f.setTrabalhando(true);
    f.status();
        
    }
    
}
