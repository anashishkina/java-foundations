package interfaces.compare.hw2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@AllArgsConstructor
@Data
public class PersonsComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName()) + o1.getSurname().compareTo(o2.getSurname());
    }
}
