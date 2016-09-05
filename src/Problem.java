import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by sakic on 9/5/16.
 */
public class Problem implements Serializable {
    private int id;
    private String name;
    private String adress = "/home/sakic/contestapplet.conf";

    public Problem() {
        this.id = 0;
        this.name = "";
    }

    public Problem(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Problem create() {
        return new Problem();
    }

    static boolean findByName(String name)
    {
        //use database connection with
        return true;
    }
    public ArrayList<String> read() {
        FileReader f;
        BufferedReader br;
        StringTokenizer st = null;
        ArrayList<String> strings = new ArrayList<>();

        try {
            f = new FileReader(adress);
            br = new BufferedReader(f);


            while (st == null || st.hasMoreTokens()) {

                String s = null;
                try {
                    s = br.readLine();
                    if(s == null) break;
                    st = new StringTokenizer(s);
                    strings.add(s);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return strings;
    }


}