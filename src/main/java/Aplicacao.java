import Modelo.Tabuleiro;
import Visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(5, 5, 3);
        new TabuleiroConsole(tabuleiro);
    }
}
