import java.util.HashMap;

public class idAndPassword extends Main{
    HashMap<String,String> logininfo = new HashMap<String,String>();
    idAndPassword () {

        logininfo.put("test", "badelh");
        logininfo.put("saadaqui", "saadbg007");
        ;}

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
