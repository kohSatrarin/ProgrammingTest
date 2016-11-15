public class User implements IUser {

    private String u_name;
    private String u_password;
    private int u_type;
    //private String userPattern = "^[A-Za-z][A-Za-z0-9]{7,}$";
    //private String passPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";


    @Override
    public String getName() {
        return u_name;
    }

    @Override
    public String setName(String name) {
        if(!name.equals("null") || !name.equals(""))
            u_name = name;
        return null;
    }

    @Override
    public String setPassword(String password) {
        if (isPasswordCorrect(password)){
            u_password = password;
            return password;
        }
        return null;
    }

    @Override
    public String getPassword() {
        return u_password;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if(!password.equals("null") || !password.equals("")) {
            return true;
        }
        else
            return false;
    }

    @Override
    public int getType() {
        return u_type;
    }
}
