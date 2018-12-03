package maze;

import java.util.LinkedList;

public class Node<T> {

    private long id = Generator.ID.getNew();
    private LinkedList<Node> list = new LinkedList<>();
    private T object;

    public Node(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public long getId() {
        return id;
    }
}
