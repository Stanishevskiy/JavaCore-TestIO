package nio.stream.serialize;

import java.io.Serializable;

public class MySerializableChild implements Serializable {

    private final long serialVersionUID = 2L;

    private final double d1;
    private final double d2;

    public MySerializableChild(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public String toString() {
        return "MySerializableChild{" +
                "d1=" + d1 +
                ", d2=" + d2 +
                '}';
    }
}
