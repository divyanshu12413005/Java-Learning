class Student{
    int rollNo;
    String studentName;
}
public  class Main{
    public static void main(String[] args) {
        Student obj1=new Student();
        Student obj2=new Student();
        obj1.rollNo=05;
        obj1.studentName="Divyanshu Singh Chauhan";
        System.out.println("Roll No: " + obj1.rollNo);
        System.out.println("Student Name: " + obj1.studentName);
        obj2.rollNo=06;
        obj2.studentName="Rohan";
        System.out.println("Roll No: " + obj2.rollNo);
        System.out.println("Student Name: " + obj2.studentName);
    }
}