import java.io.*;
public class Test{
    public static void main(String [] args) throws Exception {
       File a=new File(System.getProperty("user.dir")+"/src/main/java/tt.json");
        FileInputStream b=new FileInputStream(a);
        InputStreamReader ir=new InputStreamReader(b);
        BufferedReader bf=new BufferedReader(ir);
        StringBuffer ss=new StringBuffer();
        String c=null;
        while ((c=bf.readLine())!=null){
            ss.append(c);
        }
        System.out.println(ss);
    }
}
