interface GenericInterface <t>{
    void display(t value);
}
class Main implements GenericInterface<Integer>{
    @Override
    public void display(Integer value){

    }
}


class Student implements Comparable<Student>{
    int r;
    Float marks;
   public Student(int r, Float marks){

        this.r =r ;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o){
        return Float.compare(this.marks, o.marks);
    }
}

public class OPP6_ObjectComparsion {
    public static void main(String[] args) {
        Student kunal = new Student(18, 41.77f);
        Student sachin = new Student(13, 55.57f);
        // comparsion sachin with kunal if kunal marks greater from sachin the print "Sachin has more marks line Other blank"
        if (sachin.compareTo(kunal) < 0) {
            System.out.println("Sachin has more marks");
        }

    }
}
