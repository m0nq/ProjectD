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
    if (newEntry != null) {
      Node newNode = new Node(newEntry);
      if (this.tail == null) {
        assert this.head == null;
        this.tail = newNode;
        this.head = newNode;
      } else {
        tail.setNextNode(newNode);
        this.tail = newNode;
      }
    }
  }

  @Override
  public T removeFront() {
    T entry = (T) this.head.getData();
    Node nextNode = this.head.getNextNode();
    if (nextNode == null) {
      this.head = null;
    } else {
      this.head = nextNode;
    }
    return entry;
  }

  @Override
  public T removeBack() {
    return null;
  }

  @Override
  public T getEntry(int position) {
    int count = -1;
    Node currentNode = this.head;
    while (count <= position && currentNode != null) {
      count++;
      if (count == position) {
        return (T) currentNode.getData();
      }
      currentNode = currentNode.getNextNode();
    }
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
    int count = -1;
    Node currentNode = this.head;
    while (currentNode != null) {
      count++;
      if (currentNode.getData().equals(entry)) {
        return count;
      }
      currentNode = currentNode.getNextNode();
    }
    return -1;
  }

  @Override
  public boolean isEmpty() {
    return this.head == null && this.tail == null;
  }

  @Override
  public int size() {
    int count = 0;
    Node currentNode = this.head;
    while (currentNode != null) {
      count++;
      currentNode = currentNode.getNextNode();
    }
    return count;
  }

  @Override
  public void clear() {
    this.head = null;
    this.tail = null;
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
