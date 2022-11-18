package listas;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String email;
    private Date nascimento;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Pessoa(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public boolean equalsName(Pessoa novo){
        return novo.getNome().equalsIgnoreCase(this.nome);
    }
    public boolean equalsName(String novo){
        return novo.equalsIgnoreCase(this.nome);
    }

    public boolean isPessoa(String like){
        return like.equalsIgnoreCase(this.nome.substring(0, like.length()));

    }

    public int age(){
        Calendar hoje = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        c.setTime(nascimento);

        int idade = hoje.get(Calendar.YEAR) - c.get(Calendar.YEAR);
        c.add(Calendar.YEAR, idade);
        if (hoje.before(c))
            idade--;
        return idade;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
