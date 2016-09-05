/**
 * Created by sakic on 9/5/16.
 */
import java.io.Serializable;

class TestSerial  extends Test implements Serializable {
    public byte version = 100;
    public byte count = 0;
}