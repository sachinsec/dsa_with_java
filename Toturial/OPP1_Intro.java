public class OPP1_Intro {
    public static void main(String[] args) {
        int [] rno = new int [5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        
        //just declaring
        // Student kunal;
        // kunal = new Student();

        Student kunal = new Student(13, "kunal", 85.4f);
        Student rahul = new Student();
        kunal.name = "Kunal";
        System.out.println(kunal.name);
        System.out.println(kunal.rno);
        System.out.println(kunal.marks);
    }
}

class Student {
    int rno = 12;
    String name ="Sachin";
    float marks = 98.3f;

    // we need a way to add the vlues of the above
    // properties object by object

    // we nee one wrod to access every object
    Student(){
        // int rno;
        // String name ;
        // float makrs;

        this.rno = 12;
        this.name = "arjun";
        this.marks = 88.4f;

    }
    Student ( int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
