package com.pkg;
public class OPP2_Human {
   public int age;
   public String name;
   public int salary;
   public boolean married;
    public static long pupulation;

    public OPP2_Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.pupulation += 1;
    }
}
