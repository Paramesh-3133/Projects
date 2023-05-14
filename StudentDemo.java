import studexception.StudentDoesntExist;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String ...arg)
    {
        int n;

        int rn=0;
        StudentManagementSystem s=new StudentManagementSystem();
        Scanner scanner=new Scanner(System.in);
        do
        {

            System.out.println("Add Student---->1");
            System.out.println("Delete Student---->2");
            System.out.println("Students List----->3");
            System.out.println("Update Student---->4");
            System.out.println("Find Topper Student---->5");
            System.out.println("Exit---->6");
            System.out.println("Enter Choice:");
             n=scanner.nextInt();

            if(n==1)
            {
                System.out.println("Enter Name");
                String name=scanner.next();
                System.out.println("Enter Address ");
                String address= scanner.next();
                System.out.println("Enter Subject");
                String subject=scanner.next();
                int marks[]=new int[6];
                for(int i=0;i<6;i++)
                {
                    System.out.println("Enter "+(i+1)+" mark:");
                     marks[i]=scanner.nextInt();
                }
                s.addStudent(new Student(rn++,name,address,subject, marks));
            }
               else if (n==2)
            {
                System.out.println("Enter rollNo:");
                int rollNo= scanner.nextInt();
               s.deleteStudent(rollNo);
            }
               else if (n==3)
            {
             s.listStudents();
            }
               else if (n==4) {
                System.out.println("Enter rollNo:");
                int rollNo = scanner.nextInt();
                System.out.println("Enter Name");
                String name = scanner.next();
                System.out.println("address");
                String address = scanner.next();
                System.out.println("Subject");
                String subject = scanner.next();
                int marks[]=new int[6];
                for (int i = 0; i < 6; i++) {
                    System.out.println("Enter "+(i+1)+" mark:");
                    marks[i] = scanner.nextInt();
                }
                try {
                    s.updateStudent(rollNo, new Student(rollNo, name, address, subject, marks));
                }catch (StudentDoesntExist sde){
                    System.out.println(sde);
                }
            }
               else if(n==5)
            {
                System.out.println(s.findTopper());
            }
               else if(n!=6){
                System.out.println("Invalid Input");
            }
        }while(n!=6);
    }
}
