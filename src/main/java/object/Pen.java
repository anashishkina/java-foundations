package object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class Pen {
    private final String firm;
    private String color;
    private double diameter;

    @Override
    public String toString() {
        return "Ручка фирмы: \'" + firm + '\'' +
                ", цвета: '" + color + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.diameter, diameter) != 0) return false;
        if (!firm.equals(pen.firm)) return false;
        return color != null ? color.equals(pen.color) : pen.color == null;
        //тернарный оператор
    }

    @Override
    public int hashCode() {
        return firm.hashCode();
    }
}
