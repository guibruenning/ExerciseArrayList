package listas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ListaPessoas {
    private List<Pessoa> lista = new ArrayList<Pessoa>();

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }

    public boolean add(Pessoa pessoa){
        if(isExists(pessoa)) {
            lista.add(pessoa);
            return true;
        }
        return false;
    }

    public boolean remove(String name) {
        if (getObjectByName(name) != null){
            lista.remove(getObjectByName(name));
            return true;
        }
        return false;
    }

    public boolean alterObject(Pessoa novo, String nameObjtect){

        if(isExists(nameObjtect)) {
            lista.set(getIndexByName(nameObjtect), novo);
            return true;
        }

        return false;
    }

    public Pessoa getObjectByAge(int idade){
        for(Pessoa pessoa : lista){
            if(pessoa.age() == idade)
                return pessoa;
        }
        return null;
    }
    public Pessoa getObjectByName(String like){
        Pessoa p = null;
        for (Pessoa pessoa : lista) {
            p = pessoa.isPessoa(like) ? pessoa : null;
        }
        return p;
    }

    public boolean isExists(Pessoa novo) {
        for (Pessoa pessoa : lista){
            if (pessoa.equalsName(novo))
                return false;
        }
        return true;
    }
    public boolean isExists(String nome) {
        for (Pessoa pessoa : lista){
            if (pessoa.equalsName(nome))
                return false;
        }
        return true;
    }

    public int getIndexByName(String nome){
        for(int i = 0; i < lista.size();i++){
            if(lista.get(i).equalsName(nome))
                return i;
        }
        return -1;
    }

    public List<Pessoa> getBirthMonth(int month){
        List<Pessoa> birthmonth = new ArrayList<>();

        for(Pessoa pessoa : lista){
            Calendar c = Calendar.getInstance();
            c.setTime(pessoa.getNascimento());
            if(c.get(Calendar.MONTH) == month)
                birthmonth.add(pessoa);
        }
        return birthmonth;
    }
    //não deixar add se tiver o nome igual ou com menos de três letras
    //mostrar os dominios unicos
    //excluir atraves do nome
    //alterar pessoa
    //Fazer uma busca usando 'like' inicial do nome
    //mostrar idade
    //buscar idade > ?
    //aniversariantes do mes ? 1 - janeiro, 2 - fevereiro, ...
}
