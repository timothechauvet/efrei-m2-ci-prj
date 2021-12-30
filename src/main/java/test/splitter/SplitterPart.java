package test;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SplitterPart implements Serializable {

    private static final long serialVersionUID = 1L;

    public enum Descriptor {
        ID, VALUE, PAYMENT_METHOD
    }

    private Descriptor descriptor;
    private String value;

    public SplitterPart(Descriptor d, String value) {
        this.descriptor = d;
        this.value = value;
    }

    public boolean equals(Object o) {
        SplitterPart f = (SplitterPart) o;
        return (f != null && f.value.equals(this.value));
    }
}