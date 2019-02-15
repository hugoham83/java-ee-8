package controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class TesteController implements Serializable {

    private String mensagem = "Heyyyyyyyyyyyyyyy";
    private String nome;

    @PostConstruct
    private void init(){
         mensagem = "Heyyyyyyyyyyyyyyy";
    }

    public void teste(){
        mensagem = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
