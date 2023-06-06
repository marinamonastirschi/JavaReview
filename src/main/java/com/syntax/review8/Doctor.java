package com.syntax.review8;

public class Doctor {

        public String firstName;
        protected String lastName;
        String speciality;
        int yearOfExperience;
        private double salary;

        public static boolean degree;

        public Doctor(String firstName, String lastName){
                this.firstName=firstName;
                this.lastName=lastName;
        }
        /* to have more than 1 constructor we need to change number of the parameters or type of the parameters
        or sequence

         */
       public Doctor(String firstName, String lastName,String speciality){
                this(firstName, lastName);// this()-> calling a current class constructor
                this.speciality=speciality;// this.-> referring to current class instance variable
        }
        public void printInfo(){
                System.out.println("Doctors name is "+firstName+" "+lastName+". And speciality is "+speciality);
        }
        protected void treat(){
                System.out.println("Doctors treat patients");
        }
        void prescribeMedicine(String medicine){
                System.out.println("Doctor prescribed "+medicine);
        }
        private double getSalary(){
                return salary;
        }

        }
