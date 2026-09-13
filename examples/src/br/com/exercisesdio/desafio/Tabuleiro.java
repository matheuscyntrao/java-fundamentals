package br.com.exercisesdio.desafio;

import java.sql.SQLOutput;
import java.util.*;

public class Tabuleiro {

    private final Map<String, Celula> celulasGlobais = new LinkedHashMap<>();
    private final List<Regiao> regioes = new ArrayList<>();
    private boolean isCompleto = false;
    private int contadorJogadasValidas = 0;
    private static int contadorDeErros = 0;

    public Tabuleiro() {

        // Inicializar as celulas
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                Celula space = new Celula(i, j);
                celulasGlobais.put(i + "," + j, space);
                System.out.printf(space.toString());
            }
            System.out.println(" ");
        }

        // Referenciar linhas
        for(int i = 0; i < 9; i++) {
            List<Celula> linhas = new ArrayList<>();
            for(int j = 0; j < 9; j++) {
                linhas.add(celulasGlobais.get(i + "," + j));
            }
            regioes.add(new Linha(linhas));
        }

        // Referenciar colunas
        for(int j = 0; j < 9; j++) {
            List<Celula> colunas = new ArrayList<>();
            for(int i = 0; i < 9; i++) {
                colunas.add(celulasGlobais.get(i + "," + j));
            }
            regioes.add(new Coluna(colunas));
        }

        // Referenciar quadrantes
        for(int x = 0; x < 9; x = x + 3) {
            for(int y = 0; y < 9; y = y + 3) {
                List<Celula> quadrantes = new ArrayList<>();
                for(int quadranteX = x; quadranteX < x + 3; quadranteX++) {
                    for(int quadranteY = y; quadranteY < y + 3; quadranteY++) {
                        quadrantes.add(celulasGlobais.get(quadranteX + "," + quadranteY));
                    }
                }
                regioes.add(new Quadrante(quadrantes));
            }
        }

    }

    public boolean preencherCelula(int i, int j, int valor) {
        Celula celula = celulasGlobais.get(i + "," + j);
        if (celula.getValue() != null) {
            System.out.println("Posição (" + i + "," + j + ") já está preenchida!");
            return false;
        }
        Integer valorAntigo = celula.getValue();
        celula.setValue(valor);
        if (!validarTabuleiro()) {
            contadorDeErros++;
            celula.setValue(valorAntigo);
            System.out.println("Jogada inválida! Você tem " + contadorDeErros + "/4 chanches. ");
            return false;
        }
        contadorJogadasValidas++;
        return true;
    }

    public boolean validarTabuleiro() {
        for (Regiao regiao : regioes) {
            if (!regiao.isValida()) {
                return false;
            }
        }
        return true;
    }

    public void validarTabuleiroCompleto() {
        if (contadorJogadasValidas == 81 && validarTabuleiro()) {
            this.isCompleto = true;
        }
    }

    public void imprimirTabuleiroValues() {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                System.out.printf("%s ",celulasGlobais.get(i + "," + j).getValue());
            }
            System.out.println(" ");
        }
    }

    static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner in = new Scanner(System.in);
        int x, y, valor;
        do {
            do {
                System.out.println("Posição X (0-8):");
                x = in.nextInt();
                System.out.println("Posição Y (0-8):");
                y = in.nextInt();
                System.out.println("Valor da jogada (1-9):");
                valor = in.nextInt();
                if ((x < 0 || x > 8) || (y < 0 || y > 8) || (valor < 1 || valor > 9)) {
                    System.out.println("Valores fora do escopo. Tente novamente.");
                }
            } while ((x < 0 || x > 8) || (y < 0 || y > 8) || (valor < 1 || valor > 9));
            tabuleiro.preencherCelula(x, y, valor);
            tabuleiro.imprimirTabuleiroValues();
            tabuleiro.validarTabuleiroCompleto();
        } while (!tabuleiro.isCompleto && contadorDeErros < 5);

        if(tabuleiro.isCompleto) {
            System.out.println("Parabéns! Tabuleiro completo e válido!");
        } else {
            System.out.println("Tente novamente! Você atingiu o total de erros permitido.");
        }
        tabuleiro.imprimirTabuleiroValues();
    }

}
