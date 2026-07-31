package modulo_1.exercises.GerenciadorDeEstados;

public class GerenciadorPermissoesBitwise {

    public static final int PERMISSAO_LEITURA   = 1 << 0; // 0001 (Decimal: 1)
    public static final int PERMISSAO_ESCRITA   = 1 << 1; // 0010 (Decimal: 2)
    public static final int PERMISSAO_EXECUCAO  = 1 << 2; // 0100 (Decimal: 4)
    public static final int PERMISSAO_ADMIN     = 1 << 3; // 1000 (Decimal: 8)
    public static final int PERMISSAO_EXTRA     = 1 << 4; // 10000 (Decimal: 16)

    public static void main(String[] args) {
        System.out.println("PERMISSÕES (BITWISE)");

        int perfilUsuario = 0;

        perfilUsuario = perfilUsuario | PERMISSAO_LEITURA;
        System.out.println("Atribuindo perfil:" + perfilUsuario);
        perfilUsuario = perfilUsuario | PERMISSAO_EXECUCAO;
        System.out.println("Atribuindo perfil:" + perfilUsuario);
        perfilUsuario = perfilUsuario | PERMISSAO_EXTRA;
        System.out.println("Atribuindo perfil:" + perfilUsuario);


        System.out.printf("Estado do Perfil (Binário): %s%n", Integer.toBinaryString(perfilUsuario));

        boolean podeLer = (perfilUsuario & PERMISSAO_LEITURA) != 0;
        boolean podeEscrever = (perfilUsuario & PERMISSAO_ESCRITA) != 0;
        boolean ehAdmin = (perfilUsuario & PERMISSAO_ADMIN) != 0;
        boolean extra = (perfilUsuario & PERMISSAO_EXTRA) != 0;


        System.out.println("Checagem de Acesso:");
        System.out.println(" R " + podeLer);
        System.out.println(" W " + podeEscrever);
        System.out.println(" XRW " + ehAdmin);
        System.out.println(" EXTRA: " + extra);
        System.out.println("Upgrade de Perfil:");
        perfilUsuario = perfilUsuario | PERMISSAO_ADMIN; // Adiciona Admin
        perfilUsuario = perfilUsuario & ~PERMISSAO_EXECUCAO; // Remove Execução usando AND + NOT

        System.out.printf("Novo Estado do Perfil (Binário): %s%n", Integer.toBinaryString(perfilUsuario));
        System.out.println(" -> É Administrador agora? " + ((perfilUsuario & PERMISSAO_ADMIN) != 0));
        System.out.println(" -> Ainda pode executar? " + ((perfilUsuario & PERMISSAO_EXECUCAO) != 0));
    }
}