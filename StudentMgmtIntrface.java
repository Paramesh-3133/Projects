import studexception.StudentDoesntExist;

 interface StudentMgmtInterface {

    public  boolean addStudent(Student s);
     public boolean deleteStudent(long rollNo);
    public void listStudents();
    public boolean updateStudent(long rollNo,Student std)throws StudentDoesntExist;
    public Student findTopper();
    }
