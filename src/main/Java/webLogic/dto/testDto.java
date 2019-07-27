package webLogic.dto;

import org.codehaus.jackson.annotate.JsonValue;


import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

/**
 * Created by yansolo on 18.08.2018.
 */
public class testDto implements Serializable {

    private String one;
    private String two;
    private String[] there;

    public testDto(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public testDto() {
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String[] getThere() {
        return there;
    }

    public void setThere(String[] there) {
        this.there = there;
    }

    @Override
    public String toString() {
        return "testDto{" +
                "one='" + one + '\'' +
                ", two='" + two + '\'' +
                ", there=" + Arrays.toString(there) +
                '}';
    }
}
