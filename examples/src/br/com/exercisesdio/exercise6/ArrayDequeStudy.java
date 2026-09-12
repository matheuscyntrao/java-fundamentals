package br.com.exercisesdio.exercise6;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayDequeStudy {

    public static void lerCamposInternosQueue(Object obj) {
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

    public static void lerCamposBlockingQueue(Object obj) {
        try {
            Class<?> clazz = obj.getClass();

            Field fieldItems = clazz.getDeclaredField("items");
            fieldItems.setAccessible(true);
            Object[] items = (Object[]) fieldItems.get(obj);

            Field fieldTake = clazz.getDeclaredField("takeIndex");
            fieldTake.setAccessible(true);
            int takeIndex = fieldTake.getInt(obj);

            Field fieldPut = clazz.getDeclaredField("putIndex");
            fieldPut.setAccessible(true);
            int putIndex = fieldPut.getInt(obj);

            Field fieldCount = clazz.getDeclaredField("count");
            fieldCount.setAccessible(true);
            int count = fieldCount.getInt(obj);

            System.out.println("[ArrayBlockingQueue] takeIndex (Head): " + takeIndex +
                    " | putIndex (Tail): " + putIndex +
                    " | Count: " + count +
                    " | Items: " + Arrays.toString(items));
        } catch (NoSuchFieldException e) {
            System.err.println("Campos da ArrayBlockingQueue não encontrados.");
        } catch (IllegalAccessException e) {
            System.err.println("Sem permissão para acessar campos privados.");
        }
    }

    static void ponteiros(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>(8);
        // Posição de "folga" pros ponteiros, é o que diferencia uma lista completa de uma não completa
        lerCamposInternosQueue(arrayDeque);
        arrayDeque.add("Teste1");
        arrayDeque.add("Teste2");
        arrayDeque.add("Teste3");
        arrayDeque.add("Teste4");
        arrayDeque.add("Teste5");
        arrayDeque.add("Teste6");
        arrayDeque.add("Teste7");
        arrayDeque.add("Teste8");
        lerCamposInternosQueue(arrayDeque);
        System.out.println("---");
        arrayDeque.addFirst("Teste9");
        lerCamposInternosQueue(arrayDeque);
        System.out.println("---");
        arrayDeque.addFirst("Teste10");
        lerCamposInternosQueue(arrayDeque);
        System.out.println("---");
        arrayDeque.addLast("Teste11");
        lerCamposInternosQueue(arrayDeque);
        System.out.println("---");
        arrayDeque.addLast("Teste12");
        lerCamposInternosQueue(arrayDeque);
    }

    static void main() {
        Queue<String> filaComLimite = new ArrayBlockingQueue<>(5);
        filaComLimite.add("1");
        filaComLimite.add("2");
        filaComLimite.add("3");
        filaComLimite.add("4");
        filaComLimite.add("5");
        try {
            filaComLimite.add("6");
        } catch (IllegalStateException e) {
            System.out.println("Fila cheia! add() lançou exceção.");
        }
        boolean inserido = filaComLimite.offer("6");
        System.out.println("Inseriu '6'? " + inserido);

        filaComLimite.remove();
        filaComLimite.remove();
        filaComLimite.remove();
        filaComLimite.remove();
        filaComLimite.remove();
        try {
            filaComLimite.remove();
        } catch (NoSuchElementException ex) {
            System.out.println("Fila vazia remove() lançou exceção.");
        }
        filaComLimite.add("1");
        filaComLimite.add("2");
        filaComLimite.add("3");
        filaComLimite.add("4");
        filaComLimite.add("5");
        System.out.println(filaComLimite.poll());
        lerCamposBlockingQueue(filaComLimite);
        System.out.println(filaComLimite.poll());
        lerCamposBlockingQueue(filaComLimite);
        System.out.println(filaComLimite.poll());
        lerCamposBlockingQueue(filaComLimite);
        System.out.println(filaComLimite.poll());
        lerCamposBlockingQueue(filaComLimite);
        System.out.println(filaComLimite.poll());
        lerCamposBlockingQueue(filaComLimite);
    }


}
