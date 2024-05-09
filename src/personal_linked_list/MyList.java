package personal_linked_list;

public interface MyList<T> {

    void add(T element);

    void addFirst(T element);

    void addLast(T element);

    int size();

    T get(int index);
}
