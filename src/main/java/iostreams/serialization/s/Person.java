package iostreams.serialization.s;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class Person implements Serializable {
    private final String name;
    private final int age;


}
