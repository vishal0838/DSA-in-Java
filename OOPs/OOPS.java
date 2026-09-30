public class OOPS {
    public static void main(String[] args) {

        // Student s1 = new Student(); 
        // s1.name = "Vishal"; 
        // s1.rollno = 30; 
        // s1.password = "abcd"; 

        // s1.marks[0] = 100; 
        // s1.marks[1] = 88; 
        // s1.marks[2] = 89; 

        // Student s2 = new Student(s1); 
        // s2.password = "xyz";     
        

        // for (int i = 0; i < 3; i++) {
        //     System.out.println(s2.marks[i]);
        // }


        //  Calculator c1 = new Calculator(); 
        // System.out.println(c1.sum(2, 3)); 
        // System.out.println(c1.sum((float)3.4, (float)5.3)); 
        // System.out.println(c1.sum(2, 4 ,5)); 

        Deer d = new Deer();
        d.eat();

        Animal a = new Animal(); 
        a.eat();


        }

       
    
}

class Calculator {
    int sum (int a , int b) {
        return a + b; 
    }

    float sum(float a, float b) {
        return a + b; 
    }

    int sum (int a , int b, int c) {
        return a + b + c; 
    }
}

class Student {
    String name; 
    int rollno; 
    String password; 
    int marks[]; 
    
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name; 
        this.rollno = s1.rollno; 
        this.marks = s1.marks; 
    }
    public Student() {
                marks = new int[3];

        System.out.println("constructor is called...");
    }

    
}

class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}