package br.com.exercisesdio.exercise6;

import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeStudy {

    public static void lerCamposInternos(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            Field fieldElements = clazz.getDeclaredField("elements");
            fieldElements.setAccessible(true);
            Object[] elements = (Object[]) fieldElements.get(obj);
            Field fieldHead = clazz.getDeclaredField("head");
            fieldHead.setAccessible(true);
            int head = fieldHead.getInt(obj);
            Field fieldTail = clazz.getDeclaredField("tail");
            fieldTail.setAccessible(true);
            int tail = fieldTail.getInt(obj);
            System.out.println("Head: " + head);
            System.out.println("Tail: " + tail);
            System.out.println("Tamanho:" + elements.length);
            System.out.println("Array Elements: " + Arrays.toString(elements));
        } catch (NoSuchFieldException e) {
            System.err.println("Nenhum ponteiro foi encontrado.");
        } catch (IllegalAccessException e) {
            System.err.println("Sem permissão campos privados.");
        }
    }

    static void comportamentoTailHead(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>(8);
        // Posição de "folga" pros ponteiros, é o que diferencia uma lista completa de uma não completa
        lerCamposInternos(arrayDeque);
        arrayDeque.add("Teste1");
        arrayDeque.add("Teste2");
        arrayDeque.add("Teste3");
        arrayDeque.add("Teste4");
        arrayDeque.add("Teste5");
        arrayDeque.add("Teste6");
        arrayDeque.add("Teste7");
        arrayDeque.add("Teste8");
        lerCamposInternos(arrayDeque);
        System.out.println("---");
        arrayDeque.addFirst("Teste9");
        lerCamposInternos(arrayDeque);
        System.out.println("---");
        arrayDeque.addFirst("Teste10");
        lerCamposInternos(arrayDeque);
        System.out.println("---");
        arrayDeque.addLast("Teste11");
        lerCamposInternos(arrayDeque);
        System.out.println("---");
        arrayDeque.addLast("Teste12");
        lerCamposInternos(arrayDeque);
    }

    static void main() {
        Queue<String> fila = new ArrayDeque<>();
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        System.out.println("FIFO" + fila.poll());

        Deque<String> pilha = new ArrayDeque<>();
        pilha.push("Página 1");
        pilha.push("Página 2");
        System.out.println("LIFO" + pilha.pop());
    }



}
