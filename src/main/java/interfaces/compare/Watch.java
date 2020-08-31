package interfaces.compare;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Watch implements Comparable<Watch> {
    private final String brand;
    private final boolean isElectronic;
    private double price;


    @Override
    public int compareTo(Watch watch) {
//        if (price > watch.price){
//            return 1;
//        }
//
//        if (price < watch.price){
//            return -1;
//        }
//
//        return 0;

//        return (int) (price - watch.price);

        if (isElectronic && !watch.isElectronic){
            return -1;
        }
        if (!isElectronic && watch.isElectronic){
            return 1;
        }

        return Double.compare(price, watch.price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
