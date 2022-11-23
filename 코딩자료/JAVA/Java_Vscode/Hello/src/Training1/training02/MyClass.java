package training02;

public class MyClass {
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: "+myObj.fname+" "+myObj.lname);
        System.out.println("Email: "+myObj.email);
        System.out.println("Age: "+myObj.age);
        System.out.println("Graduation Year: "+myObj.graduationYear);
        myObj.study();
    }
}
