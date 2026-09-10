package br.com.exercisesdio.exercise6;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class ArrayListStudy {

    // Adicionar VM Options para permitir acesso ao elementData --add-opens java.base/java.util=ALL-UNNAMED
    private static void imprimirCapacidade(String rotulo, ArrayList<?> list) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.printf("%s  Size: %d -> elementData.length): %d%n",
                rotulo, list.size(), elementData.length);
    }

    // Internamente ele cria um array com 10 posições na primeira adição e após faz o calculo 0.50% padrão para grow
    static void capacidadeInicialGrow() throws Exception {
        ArrayList<String> arrayListInicial = new ArrayList<>();
        imprimirCapacidade("Array Default Capacity", arrayListInicial);
        arrayListInicial.add("Primeiro elemento sem ter inicializado com capacidade");
        imprimirCapacidade("Array Default Capacity", arrayListInicial);
        ArrayList<String> arrayListNotInicial = new ArrayList<>(50);
        imprimirCapacidade("Array Capacity Setada", arrayListNotInicial);
        arrayListNotInicial.add("Teste");
        imprimirCapacidade("Array Capacity Setada", arrayListNotInicial);
    }

    static void removeWithIterator() {
        ArrayList<Integer> arrayList = new ArrayList<>(20);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        // Tentando remover diretamente por index, o modCount fica diferente do excpectedModCount e estoura ConcurrentModificationException
        /*for(Integer integer : arrayList) {
            arrayList.remove(integer);
        }*/
        System.out.println("Utilizando o iterator para recalcular o modCount" + arrayList);
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Integer a = iterator.next();
            if(a > 2) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }

    // Para arraylist, o tempo de inserção na posição inicial ou no meio de
    // um array é sempre menos performática devido a necessidade do System.arraycopy,
    // reposicionando todos os outros elementos deslocados à direita, criando uma cópia
    // e aí sim altera o valor do índice 0 para o valor desejado O(n)
    // No entando na remoção, a última posição é setada para null no GC e o size é decrementado
    // sem necessidade de realizar System.arraycopy e sem utilizar mais memória
    static void addFirstRemoveLast() {
         ArrayList<Integer> arrayList = new ArrayList<>(100000);
         for(int i = 0; i < 100_000; i++) {
             arrayList.add(i);
         }
         long initialNanoTimeAdding = System.nanoTime();
         arrayList.addFirst( 1); //sequencedCollection
         System.out.println(System.nanoTime() - initialNanoTimeAdding);
         long initialNanoTimeRemovingLast = System.nanoTime();
         arrayList.removeLast(); //sequencedCollection
         System.out.println(System.nanoTime() - initialNanoTimeRemovingLast);
    }


    // subList aponta para o mesmo elementData, caso ele seja modificado a view perde referência do modCount
    static void concurrentModificationExceptionTrigger() {
        ArrayList<String> arrayList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add("Elemento " + i);
        }
        List<String> subList = arrayList.subList(1, 4);
        System.out.println(arrayList);
        System.out.println(subList);
        try {
            arrayList.add("New Element");
            System.out.println(arrayList);
            System.out.println(subList);
        } catch (ConcurrentModificationException ex) {
            System.out.println("Cai exatamente nessa exception pois subList é uma view da lista e o modCount interno do subList não é alterado automaticamente.");
        }
    }


    // Aplicar clear em arrayList somente quando ele for ser reutilizado
    // Ele altera internamente o tamanho do size mas não desocupa a memória alocada, gerando trabalho pro GC.
    // Ao aplicar o trimToSize, ele altera tanto o size para 0, quando diminui o recurso alocado em memória
    static void main() throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < 1_000_000; i++) {
            arrayList.add("index" + i);
        }
        arrayList.clear();
        System.out.println("Aplicando clear size: " + arrayList.size());
        imprimirCapacidade("Memória", arrayList);
        arrayList.trimToSize();
        System.out.println("Aplicando trimToSize: " + arrayList.size());
        imprimirCapacidade("Memória", arrayList);
    }

}
