package io.stream.serialize;

import java.io.Serializable;

public class MySerializableObject implements Serializable {

    private final long serialVersionUID = 1L;

    private final int num;
    private final String str;
    private final MySerializableChild child;

    public MySerializableObject(int num, String str, MySerializableChild child) {
        this.num = num;
        this.str = str;
        this.child = child;
    }

    @Override
    public String toString() {
        return "MySerializableObject{" +
                "num=" + num +
                ", str='" + str + '\'' +
                ", child=" + child +
                '}';
    }
}
