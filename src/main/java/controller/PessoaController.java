package controller;

import modelo.Pessoa;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@Named
public class PessoaController implements Serializable {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private List<Pessoa> pessoas;


    public void cadastrar(){

        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setSobrenome(sobrenome);
        p.setIdade(idade);

        //pessoas.add();
        pessoas.add(p);
    }

    public void limpar(){
        nome = "";
        sobrenome = "";
        idade = 0;
    }

    @PostConstruct
    private void init(){
        pessoas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }



}
