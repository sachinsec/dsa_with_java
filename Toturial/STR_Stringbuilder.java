/*
String     name           = "SAchin";
datatype   refre. varial     object

 String pool;
 string a = "kunal"
 string b = "kunal"
 both heap memory address is same 
 and in this case
 a==b gives true

 how to create diff objects of same value
 string a = new string ("Kunal")
 string b = new string("kunal")
 creating these values 
 and in this case
 a==b gives false

*/
public class STR_Stringbuilder {
    public static void main(String[] args) {
        String name = new String("Kunal");
        String name1 = new String("Kunal");

        System.out.println(name == name1);

        System.out.println(name.equals(name1));
        System.out.println(name.charAt(0));
    }
}
