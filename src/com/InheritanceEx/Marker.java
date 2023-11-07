
package com.InheritanceEx;
public class Marker extends Pen {
    public void childMethod() {
        System.out.println("Calling Child Method");
    }

    public static void main(String[] args) {
            Marker mr = new Marker();
            Pen p = mr;
            Marker m = (Marker) p;
            //Calling Both methods through the object of Marker Class
            mr.parentMethod();
            mr.childMethod();

            //Calling both method through Instance and Referenced by the Super class. i.e Pen class.
           m.parentMethod();
           m.childMethod();

            System.out.println(p instanceof Marker);



    }
}
