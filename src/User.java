public class User implements IUser {

    private String u_name = null;
    private String u_password = null;
    private int u_type = 0;

    public User(int type, String name, String password)
    {
        setType(type);
        setName(name);
        setPassword(password);
    }

    @Override
    public String getName() {
        return u_name;

    }

    @Override
    public String setName(String name) {
        if(!name.equals("null") || !name.equals(""))
            this.u_name = name;
        else{
            throw new RuntimeException("Wrong input.");
        }
        return this.u_name;
        //throw new RuntimeException();
    }

    @Override
    public String setPassword(String password) {
        if (isPasswordCorrect(password)){
            this.u_password = password;
            return password;
        }
        else{
            throw new RuntimeException("Wrong input");
        }

    }

    @Override
    public String getPassword() {
        return u_password;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if(!password.equals("null") && !password.equals("") && this.u_password.equals(password)) {
            return true;
        }
        else{
            throw new RuntimeException("Wrong password.");
            //return false;

        }
        //return false;
    }

    @Override
    public int getType() {
            return this.u_type;

    }

    public int setType(int type) {
        if (type!=IUser.USER_STUDENT || type!=IUser.USER_TEACHER){
            throw new RuntimeException("Wrong input.");
        }
        else {
            u_type = type;
        }

        return type;
    }

}
