package com.pkg;
public class OPP3_Inheritance {

    double l;
    double h;
    double w;
    OPP3_Inheritance() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // Cube 
    OPP3_Inheritance(double side){

        this.w = side;
        this.l = side;
        this.h = side;

    }

    public OPP3_Inheritance (double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    OPP3_Inheritance(OPP3_Inheritance old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
