package linkedlist;

import java.io.IOException;

public class CustomLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }

    public void addFirst(E element) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(null, element, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    public void addLast(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, element, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public E removeFirst() throws IOException {
        if (first == null) {
            throw new IOException();
        }
        E element = first.element;
        Node<E> next = first.next;
        first.element = null;
        first.next = null;
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.prev = null;
        }
        size--;
        return element;
    }

    public E removeLast() throws IOException {
        if (last == null) {
            throw new IOException();
        }
        E element = last.element;
        Node<E> prev = last.prev;
        last.element = null;
        last.prev = null;
        last = prev;
        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }
        size--;
        return element;
    }

    public E getFirst() throws IOException {
        if (first == null) {
            throw new IOException();
        }
        return first.element;
    }

    public E getLast() throws IOException {
        if (last == null) {
            throw new IOException();
        }
        return last.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

