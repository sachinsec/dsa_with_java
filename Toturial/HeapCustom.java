
import java.util.ArrayList;
class Heap<T extends Comparable<T>> {

  private ArrayList<T> list;

  public Heap() {
    list = new ArrayList<>();
  }

  private void swap(int first, int second) {
    T temp = list.get(first);  // 1. First element ko Temp variable mein save kar liya
    list.set(first, list.get(second)); // 2. First ki jagah Second element rakh diya
    list.set(second, temp); // 3. Second ki jagah Temp (jo pehle First tha) rakh diya
  }

  private int parent(int index) {
    return (index - 1) / 2;
  }

  private int left(int index) {
    return index * 2 + 1;
  }
  
  private int right(int index) {
    return index * 2 + 2;
  }

  public void insert(T value) {
    list.add(value);  // Step 1: Sabse aakhri mein naya element daalo
    upheap(list.size() - 1);  // Step 2: Sahi jagah par pahunchane ke liye upheap chalao
  }
  private void upheap(int index) {
    if(index == 0) { // Agar Top (Root) par pahunch gaye, toh ruko0.
      return;
    }
    int p = parent(index); // Parent ka index nikalo

    // Agar naya element apne parent se Chhota hai:
    if(list.get(index).compareTo(list.get(p)) < 0) {
      swap(index, p);  // Dono ko aapas mein badal do
      upheap(p);   // Naye parent index par jaakar dubara check karo
    }
  }

  public T remove() throws Exception {
    if (list.isEmpty()) {
      throw new Exception("Removing from an empty heap!");
    }

    T temp = list.get(0);

    T last = list.remove(list.size() - 1);
    if (!list.isEmpty()) {
      list.set(0, last);
      downheap(0);
    }
    
    return temp;
  }
  private void downheap(int index) {
    int min = index;
    int left = left(index);
    int right = right(index);

    if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
      min = left;
    }

    if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
      min = right;
    }

    if(min != index) {
      swap(min, index);
      downheap(min);
    }
  }

  public ArrayList<T> heapSort() throws Exception {
    ArrayList<T> data = new ArrayList<>();
    while(!list.isEmpty()) {
      data.add(this.remove());
    }
    return data;
  }
}

// main class
public class HeapCustom {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();
    }
}