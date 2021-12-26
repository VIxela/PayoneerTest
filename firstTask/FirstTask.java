package firstTask;

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int [] price = {5,4,9,2,8,7,7,9,6,8};
        int maximum_revenue;
        int min = price [0];
        int max = price [0];

        for (int i=1 ; i < price.length; i++) {
            if (price[i] < min) min = price[i];
            if (price[i] > max) max = price[i];
        }

        System.out.println(min +"   " + max);
        maximum_revenue = max - min;

        System.out.println(maximum_revenue);
    }
    

}
