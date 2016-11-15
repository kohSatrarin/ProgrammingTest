public class Student extends User {
    public Student(String name, String password)
    {
        super(IUser.USER_STUDENT, name, password);
    }
}
