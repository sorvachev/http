import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 * Created by sakic on 9/5/16.
 */
public class ManageHttp {
    public static void main(String args[]) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        TestSerial ts = new TestSerial();
        System.out.println(ts.count);
        FileInputStream f = new FileInputStream("temp.out");
        DataInputStream dt = new DataInputStream(f);
        int k = dt.readInt();
        FileOutputStream ff = new FileOutputStream("temp.out");
        DataOutputStream dtt = new DataOutputStream(ff);
        dtt.writeInt(k);
        oos.writeObject(ts);
        oos.flush();
        oos.close();
   }
    }
