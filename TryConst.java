public class TryConst{
    String username;
    int age;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        if (!username.isEmpty());
    }

    public TryConst(){}

    public TryConst(String username){
        this.username = username;

    }

    public TryConst(String username, int age){
        this.username = username;
    }

    public static void main(String[] args){
        
    }
    }