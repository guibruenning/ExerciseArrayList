import listas.ListaPessoas;
import listas.Pessoa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaPessoas l = new ListaPessoas();

        Pessoa p = new Pessoa("Guilherme", "Teste@teste.com");

        l.add(p);

        p = new Pessoa("Tereza", "tereza@gmail.com");

        l.add(p);

        List<Pessoa> lista = l.getLista();

        System.out.println("----------------------");
        for(Pessoa item : lista)
            System.out.println(item.toString());

        l.remove("Tereza");

        lista = l.getLista();
        System.out.println("----------------------");

        for(Pessoa item : lista)
            System.out.println(item.toString());

        l.add(p);

        System.out.println("----------------------");
        for(Pessoa item : lista)
            System.out.println(item.toString());

        System.out.println("----------------------");
        Pessoa pe = l.getObjectByName("Ter");
        System.out.println(pe);
    }
}
