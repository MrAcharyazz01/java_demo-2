class student
{ 
 int rollno;
 String name;

 void set data(int r,String n);
  {
   rollno=r;
   name=n;
  }
   void display();
  {
   System.out.println("rollno="+rollno);
   System.out.println("student name="+name);
}
}
class prgmstudent
{
public static void main(string args)
{
student s1=new student();
s1.setdata(1,"ananya");
s1.display();
}
}