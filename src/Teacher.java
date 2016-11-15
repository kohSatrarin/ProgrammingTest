public class Teacher extends User {
    public Teacher(String name, String password)
    {
        super(IUser.USER_TEACHER, name, password);
    }
}
