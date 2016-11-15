public class User implements IUser {

    private String u_name = null;
    private String u_password = null;
    private int u_type = 0;


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
        //return this.u_name;
        throw new RuntimeException();
    }

    @Override
    public String setPassword(String password) {
        if (isPasswordCorrect(password)){
            this.u_password = password;
            return password;
        }
        throw new RuntimeException();
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
        if (this.u_type!=1 || this.u_type!=2){
            throw new RuntimeException("Wrong input.");
        }
        else {
            return this.u_type;
        }

    }

    public int setType(int type) {
        if (type!=1 || type!=2){
            throw new RuntimeException("Wrong input.");
        }
        else {
            u_type = type;
        }

        return type;
    }

}
