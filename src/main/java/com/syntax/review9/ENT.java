package com.syntax.review9;

public class ENT extends Doctor{
    String location;

    ENT(String firstName, String lastName, String speciality, String location){
        super(firstName, lastName, speciality);
        this.location=location;

    }
    /*
     override prescribeMedicine method
     WE MUST HAVE INHERITANCE
     1.Same method signature(name+parameters)
     2.Return type must be same
     4.access modifiers can be same or give higher visibility

     */
    protected void prescribeMedicine(String medicine){
        System.out.println("ENT doctors prescribes "+medicine+" when needed");
    }
    protected void inspect(String bodyPart){
        System.out.println("ENT doctor checks "+bodyPart);
    }

    public static void main(String[] args) {
        ENT ent=new ENT("John","Snow","ENT","Maryland");
        ent.printInfo();// from parent
        ent.treat();// from parent
        ent.treat("John Wick");// from parent
        ent.prescribeMedicine("some medicine");// overriding method
        ent.inspect("Nose");// ent own method

        // casting of non primitives: upcasting and downcasting
        //upcasting
        Doctor ent1=new ENT("John","Wick","Ent","Miami");
        ent1.printInfo();
        ent1.treat();
        ent1.prescribeMedicine("some medicine");
        ent1.treat("Jane Smith");// runtime polymorphism
        // during compilation compiler gives access to all methods based on the reference type
        // during runtime java looks always at object type


    }
}
