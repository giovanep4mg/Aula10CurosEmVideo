/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10curosemvideo;

/**
 *
 * @author giova
 */
public class Aluno extends Pessoa {
    
   // atributos  
    private String curso;
    private int matricula;
    
    
    
   //metodo 
    public void cancelarMatricula(){
        
      // vai na variável matricula e coloca zero
        this.matricula = 0;
    }
    
    
    public void status(){
        // retorna os dados pedidos aqui 
        System.out.println("______________ALUNO_______________");
        System.out.println("O nome do aluno é "+this.getNome());
        System.out.println("Sua idade é "+this.getIdade());
        System.out.println("Seu sexo é "+this.getSexo());
        System.out.println("O seu curso é "+this.getCurso());
        System.out.println("Sua matricula é numero  "+this.getMatricula());
        System.out.println("=================================================");
    }
    
    
    // metodos especiais

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String detalhesAluno() {
        return "Aluno{" + "curso=" + curso + "\n, matricula=" + matricula + '}';
    }
    
    
    
    
    

    
    
}//<< fim classe
