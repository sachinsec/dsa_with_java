import java.util.Arrays;

public class OPP6_CustomArraylist {

    private int [] data;
        private int DEFAULT_SIZE = 10;
        private int size = 0; // also working as index value.

        public OPP6_CustomArraylist(){
            this.data = new int[DEFAULT_SIZE] ;
        }


        public void add(int num){
            if(isFull()){
                resize();
            }
            data[size++] = num;
        }

        private boolean isFull(){
            return size == data.length; 
        }
        private void resize(){
            int [] temp = new int [data.length *2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        public int remove(){
            int removed = data[--size];
            return removed;
        }

        public int get(int index){
            return data[index];
        }

        public int size(){
            return size;
        }

        public void set(int index, int value){
            data[index] = value;
        }

        public String toString(){
            return "CustomArraylist{" +
                   "data=" + Arrays.toString(data) + 
                   ",size= " + size +
                   '}';
        }


    public static void main(String[] args) {

     //   ArrayList<Integer> list = new ArrayList<>();

          OPP6_CustomArraylist list = new OPP6_CustomArraylist();

        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1, 6789);
        // list.size();
        // list.isEmpty();

        list.add(3);
        list.add(5);
        list.add(9);

        System.out.println(list);

    }
}
