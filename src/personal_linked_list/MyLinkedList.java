package personal_linked_list;

public class MyLinkedList<T> implements MyList<T> {

    private int size;
    private MyNode<T> first;
    private MyNode<T> last;

    public MyLinkedList() {
    }

    @Override
    public void add(T element) {
        addLast(element);
    }

    @Override
    public void addFirst(T element) {
        MyNode<T> f = first;
        MyNode<T> newMyNode = new MyNode<>(null, element, f);
        first = newMyNode;
        if (f == null) {
            last = newMyNode;
        } else {
            f.previous = newMyNode;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        MyNode<T> l = last;
        MyNode<T> newMyNode = new MyNode<>(l, element, null);
        last = newMyNode;
        if (l == null) {
            first = newMyNode;
        } else {
            l.next = newMyNode;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return my_node(index).current;

    }

    MyNode<T> my_node(int index){

        if (index < size && index >= 0) {
            MyNode<T> temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            MyNode<T> temp = last;
            for (int i = 0; i < index; i++) {
                temp = temp.previous;
            }
            return temp;
        }
    }

//    @Override
//    public String toString() {
//        return "MyLinkedList{" +
//                "size=" + size +
//                ", first=" + first +
//                ", last=" + last +
//                '}';
//    }

    private static class MyNode <T>{
        private MyNode<T> previous;
        private T current;
        private MyNode<T> next;

        public MyNode(MyNode<T> previous, T current, MyNode<T> next) {
            this.previous = previous;
            this.current = current;
            this.next = next;
        }

    }

}
