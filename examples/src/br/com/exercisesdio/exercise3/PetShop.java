package br.com.exercisesdio.exercise3;

public class PetShop {
    /*
    Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve
    ter as seguintes operações:
        Dar banho no pet;
        Abastecer com água;
        Abastecer com shampoo;
        verificar nivel de água;
        verificar nivel de shampoo;
        verificar se tem pet no banho;
        colocar pet na maquina;
        retirar pet da máquina;
        limpar maquina.

    Siga as seguintes regras para implementação

    A maquina de banho deve permitir somente 1 pet por vez;
    Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
    A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
    Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir
    a entrada de outro pet;
    A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
    O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
     */

    public enum Insumo {
        AGUA, SHAMPOO
    }

    public enum TipoOperacao {
        BANHO, LIMPEZA;
    }

    public static class Pet {

        private boolean isLimpo = false;

        public boolean getIsLimpo() {
            return this.isLimpo;
        }

        public void setIsLimpo(boolean isLimpo) {
            this.isLimpo = isLimpo;
        }

    }

    public static class MaquinaPet {
        private int totalAgua = 0;
        private int totalShampoo = 0;
        private Pet pet;
        private boolean isFree = true;
        private final int QUANTIDADE_AGUA_POR_BANHO = 10;
        private final int QUANTIDADE_SHAMPOO_POR_BANHO = 2;
        private final int QUANTIDADE_AGUA_POR_LIMPEZA = 3;
        private final int QUANTIDADE_SHAMPOO_POR_LIMPEZA = 1;
        private final int CAPACIDADE_MAXIMA_AGUA = 30;
        private final int CAPACIDADE_MAXIMA_SHAMPOO = 10;
        private boolean isPrecisaLimpeza = false;

        public void darBanho(Pet pet) {
            if (this.pet == null) {
                colocarPet(pet);
            }
            if (this.pet != null && verificarNivel(Insumo.AGUA, TipoOperacao.BANHO) && verificarNivel(Insumo.SHAMPOO, TipoOperacao.BANHO)) {
                this.totalAgua -= QUANTIDADE_AGUA_POR_BANHO;
                this.totalShampoo -= QUANTIDADE_SHAMPOO_POR_BANHO;
                this.pet.setIsLimpo(true); // Uso correto do setter
                System.out.println("Banho em andamento.");
            } else if (this.pet != null) {
                System.out.println("Não há insumos suficientes para realizar o banho!");
            }
        }

        public void abastecer(Insumo insumo, int quantidade) {
            if(quantidade > 0 && quantidade <= 2) {
                if(insumo.equals(Insumo.AGUA)) {
                    if((totalAgua + quantidade) > CAPACIDADE_MAXIMA_AGUA) {
                        System.out.println("Não é possível abastecer pois a máquina já está no seu limite de água.");
                    } else {
                        totalAgua += quantidade;
                        System.out.printf("Abastecido com água a quantidade de %d e total %d\n", quantidade, this.totalAgua);
                    }
                } else if (insumo.equals(Insumo.SHAMPOO)) {
                    if((totalShampoo + quantidade) > CAPACIDADE_MAXIMA_SHAMPOO) {
                        System.out.println("Não é possível abastecer pois a máquina já está no seu limite de shmapoo.");
                    } else {
                        totalShampoo += quantidade;
                        System.out.printf("Abastecido com shampoo a quantidade de %d e total %d \n", quantidade, this.totalShampoo);
                    }
                } else {
                    System.out.println("Insumo não permitido na máquina");
                }
            } else {
                System.out.println("Não foi possível abastecer devido ao volume inválido");
            }
        }

        public boolean verificarNivel(Insumo insumo, TipoOperacao operacao) {
            int aguaNecessaria = (operacao == TipoOperacao.BANHO) ? QUANTIDADE_AGUA_POR_BANHO : QUANTIDADE_AGUA_POR_LIMPEZA;
            int shampooNecessario = (operacao == TipoOperacao.BANHO) ? QUANTIDADE_SHAMPOO_POR_BANHO : QUANTIDADE_SHAMPOO_POR_LIMPEZA;

            if (insumo.equals(Insumo.AGUA)) {
                return this.totalAgua >= aguaNecessaria;
            } else if (insumo.equals(Insumo.SHAMPOO)) {
                return this.totalShampoo >= shampooNecessario;
            }
            return false;
        }

        public void colocarPet(Pet pet) {
            if (this.isPrecisaLimpeza) {
                System.out.println("Não é possível colocar o pet pois a máquina precisa ser limpa");
                return;
            }
            if (!this.isFree) {
                System.out.println("Não é possível colocar o pet pois já há um pet no banho.");
                return;
            }
            if(pet != null) {
                this.isFree = false;
                this.pet = pet;
                System.out.println("Pet colocado na máquina.");
            } else {
                System.out.println("Pet não pode ser nulo");
            }
        }


        public void removerPet() {
            if (this.pet == null) {
                System.out.println("Não há pet na máquina.");
                return;
            }
            if (!this.pet.getIsLimpo()) {
                this.isPrecisaLimpeza = true;
                System.out.println("Pet removido sem estar limpo. A máquina precisará de limpeza!");
            } else {
                System.out.println("Pet limpo removido com sucesso.");
            }
            this.pet = null;
            this.isFree = true;
        }

        public void limparMaquina() {
            if(this.isFree) {
                if(verificarNivel(Insumo.AGUA, TipoOperacao.LIMPEZA) && verificarNivel(Insumo.SHAMPOO, TipoOperacao.LIMPEZA)) {
                    this.totalAgua -= QUANTIDADE_AGUA_POR_LIMPEZA;
                    this.totalShampoo -= QUANTIDADE_SHAMPOO_POR_LIMPEZA;
                    this.isPrecisaLimpeza = false;
                } else {
                    System.out.println("Não há insumos o sucificiente para a limpeza, abasteça a máquina!");
                }
            } else {
                System.out.println("Impossível limpar máquina pois está ocupada.");
            }
        }

    }


    public static void main(String[] args) {
        MaquinaPet maquina = new MaquinaPet();
        maquina.abastecer(PetShop.Insumo.AGUA, 200000000);
        maquina.abastecer(PetShop.Insumo.AGUA, -10);
        maquina.abastecer(PetShop.Insumo.AGUA, 2);
        maquina.abastecer(PetShop.Insumo.AGUA, 2);
        maquina.abastecer(PetShop.Insumo.AGUA, 2);
        maquina.abastecer(PetShop.Insumo.AGUA, 2);
        maquina.abastecer(PetShop.Insumo.AGUA, 2);
        maquina.abastecer(PetShop.Insumo.AGUA, 0);

        maquina.abastecer(PetShop.Insumo.SHAMPOO, 2);
        Pet pet1 = new Pet();
        maquina.darBanho(pet1);
        maquina.removerPet();
        maquina.removerPet();;
        PetShop.Pet pet2 = new PetShop.Pet();
        maquina.colocarPet(pet2);
        maquina.removerPet();
        PetShop.Pet pet3 = new PetShop.Pet();
        maquina.colocarPet(pet3);
        maquina.abastecer(PetShop.Insumo.AGUA, 2);
        maquina.abastecer(PetShop.Insumo.AGUA, 2);
        maquina.abastecer(PetShop.Insumo.SHAMPOO, 2);
        maquina.limparMaquina();
        maquina.colocarPet(pet3);
    }
}
