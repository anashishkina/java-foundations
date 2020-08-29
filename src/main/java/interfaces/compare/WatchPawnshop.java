package interfaces.compare;

import java.util.Arrays;

public class WatchPawnshop {

    public static void main(String[] args) throws CloneNotSupportedException {
        Watch gshock = new Watch("G-shok", false, 100);
        Watch seiko = new Watch("Seiko", true, 120);
        Watch swatch = new Watch("Swatch", false, 60 );

        System.out.println("gshok.compateTo(seiko) = " + gshock.compareTo(seiko));

        Watch[] watches = {gshock, seiko, swatch};
        System.out.println("Arrays.toString(watches) = " + Arrays.toString(watches));
        Arrays.sort(watches);
        System.out.println(Arrays.toString(watches));

        Watch seiko2 = (Watch) seiko.clone();
        System.out.println("seiko2 = "+ seiko2);

    }
}
