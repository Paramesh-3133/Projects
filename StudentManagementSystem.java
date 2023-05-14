import studexception.StudentDoesntExist;

import java.util.ArrayList;

public class StudentManagementSystem implements StudentMgmtInterface{
    ArrayList<Student>students=new ArrayList<>();
    @Override
    public boolean addStudent(Student s) {
        if(students.size()<=10) {
            students.add(s);
            return true;
        }
        else
       return false;
    }

    @Override
    public boolean deleteStudent(long rollNo) {
        for(int i=0;i<=10;i++)
            if(rollNo==students.get(i).rollNo)
            {
                students.remove(i);
                return true;
            }

        return false;
    }

    @Override
    public void listStudents() {
        for(Student k:students)
        System.out.println(k);
    }

    @Override
    public boolean updateStudent(long rollNo, Student std) throws StudentDoesntExist {
        for (int i = 0; i <= 10; i++)
            if (rollNo == students.get(i).rollNo) {
                students.set(i, std);
                return true;
            } throw new StudentDoesntExist();

    }

    @Override
    public Student findTopper() {
        Student m=students.get(0);
            int c;
            int max = 0;
        {
            for ( Student k : students) {
                c=0;
                for (int i = 0; i < 6; i++)
                    c += k.marks[i];
                if (c > max) {
                    max = c;
                    m = k;
                }
            }
        }
                return m;
            }
}
