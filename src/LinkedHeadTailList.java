public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

  private Node head, tail;

  @Override
  public void addFront(T newEntry) {

  }

  @Override
  public void addBack(T newEntry) {

  }

  @Override
  public T removeFront() {
    return null;
  }

  @Override
  public T removeBack() {
    return null;
  }

  @Override
  public T getEntry(int position) {
    return null;
  }

  @Override
  public void display() {

  }

  @Override
  public int contains(T entry) {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public void clear() {

  }

  private class Node<C> {

    private C data;
    private Node<C> next;

    public Node(C dataPortion) {
      this(dataPortion, null);
    }

    Node(C dataPortion, Node nextNode) {
      data = dataPortion;
      next = nextNode;
    }

    public C getData() {
      return data;
    }

    public void setData(C newData) {
      data = newData;
    }

    public Node getNextNode() {
      return next;
    }

    public void setNextNode(Node nextNode) {
      next = nextNode;
    }
  }
}
