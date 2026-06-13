
import java.util.*;



class Managment{

  List<Student> studentsList = new ArrayList<>();

  void add(Student s){
      studentsList.add(s);
  }

  void display(){

	if(studentsList.isEmpty()){
	System.out.println("NO Student Present");
}else{
		
	System.out.println("Student LIST -----");

      for(Student i : studentsList){
          System.out.println("Student Name: " + i.getName());
          System.out.println("Student Roll Number: " + i.getRollNo());
          System.out.println("Student Age: " + i.getAge());
          System.out.println("Student EmailID: " + i.getEmail());
          System.out.println("Student course: " + i.getcourse());
     	  System.out.println();
      }
}
  }

  Boolean SearchStudentByRollNo(int rollNo){
      boolean flag = false;
       for(Student i : studentsList){
           if(rollNo == i.getRollNo()){
               flag = true;
               return flag;
           }
       }
       return flag;
  }

}


class Student {
    private
    int age,
        rollNo;
    String name,
            email,
           course;

    Student(int age,int rollNo, String name, String email, String course){
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.course = course;

        

    }

    String  getName() {
       return this.name ;

    }
    int getRollNo() {
      return this.rollNo ;

    }
    int getAge() {
        return  this.age;
    }
    String  getEmail() {
        return   this.email;

    }
    String getcourse() {
        return this.course;
    }


    void updateName(String name){
        this.name = name;

    }
    void updateEmail(String email){
        this.email = email;
    }

    void updateCourse(String course){
        this.course = course;
    }

    void updateAge(int age){
        this.age = age;
    }

    void updateRollno(int rollNo){
        this.rollNo = rollNo;
    }
}

public class Main{
   public static void main(String[] args){

       Managment mg = new Managment();
       Scanner sc = new Scanner(System.in);
       boolean isRunning = true;

       System.out.println("------ Welcome to STUDENT MANAGEMENT SYSTEM ");

       while(isRunning){
		System.out.println();
           System.out.println("PRESS 1 FOR ADD STUDENT");
           System.out.println("PRESS 2 FOR DISPLAY STUDENT");
           System.out.println("PRESS 3 FOR SEARCH STUDENT BY THEIR ROLL NUMBER ");
           System.out.println("PRESS 4 EXIT");

           int choice = sc.nextInt();
           sc.nextLine();
           switch (choice){
               case 1:
                   System.out.println("Please Enter Student Details --------- ");
                   System.out.println("Enter Student Name: ");
                   String TempName = sc.nextLine();
                   System.out.println("Enter Student Roll Number: ");
                   int TempRoll = sc.nextInt();
                   System.out.println("Enter Student Age: ");
                   int TempAge = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter Student EmailID: ");
                   String TempEmail = sc.nextLine();
                   System.out.println("Enter Student CourseName: ");
                   String TempCourse = sc.nextLine();

                   Student s = new Student(TempAge,TempRoll,TempName,TempEmail,TempCourse);

                   mg.add(s);
                   break;

               case 2:
                   mg.display();
                   break;

               case 3:
                   System.out.println("Enter a roll No. for check Student Present or not");
                   int Temproll = sc.nextInt();
                   boolean result = mg.SearchStudentByRollNo(Temproll);
		  if(result){
			 System.out.println("Student is present and doing study");
		}else{
			System.out.println("Student is not present ");
}
                  
                   break;

               default:
                   System.out.println("Programm Exit...");
                   isRunning = false;
           }




       }

   }
}