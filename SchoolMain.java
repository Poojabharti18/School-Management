package MiniProject;

import java.util.ArrayList;
import java.util.List;

public class SchoolMain {


	public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"lizzy",500);
        Teacher mellisa = new Teacher(2,"mellisa",700);
        Teacher parveen = new Teacher(3,"parveen",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(parveen);
         
        Student Amit=new Student(4,"Amit",4);
        Student Akash=new Student(4,"Akash",3);
        Student Ravi=new Student(4,"Ravi",2);
        
        List<Student>studentList=new ArrayList<>();
        studentList.add(Amit);
        studentList.add(Akash);
        studentList.add(Ravi);
        
        School ApS=new School(teacherList,studentList);
        
        
        Amit.payFees(5000);
       
        Ravi.payFees(6000);
        System.out.println("ApS has Earned:"+ApS.getTotalMoneyEarned());
        System.out.println("============Making Aps Pay Salary=============================");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("APS has spent for salary to " + lizzy.getName() + "  rupees "+ApS.getTotalMoneyEarned());
        parveen.receiveSalary(parveen.getSalary());
        System.out.println("APS has spent for salary to " + parveen.getName()
                +"  rupees " + ApS.getTotalMoneyEarned());
       

        

       

      
        
        
        
        

}
}
