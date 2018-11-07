public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

  private Node head, tail;

  @Override
  public void addFront(T newEntry) {
    if (newEntry != null) {
      Node newNode = new Node(newEntry);
      if (this.head == null) {
        assert this.tail == null;
        this.head = newNode;
        this.tail = newNode;
      } else {
        newNode.setNextNode(this.head);
        this.head = newNode;
      }
    }
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
    Node currentNode = head;
    String output = "[";
    while (currentNode != null) {
      output += currentNode.getData() + ", ";
      currentNode = currentNode.getNextNode();
    }
    int index = output.lastIndexOf(",");
    if (index < 1) {
      output += "]";
    } else {
      output = output.substring(0, index) + "]";
    }
    System.out.println(output);
  }

  @Override
  public int contains(T entry) {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return this.head == null && this.tail == null;
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
