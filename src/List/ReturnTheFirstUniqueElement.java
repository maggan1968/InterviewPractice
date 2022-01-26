package List;

import java.util.ArrayList;

public class ReturnTheFirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);
        //nested
        // frequency of one element
        for (Integer each : list) {

            int frequency = 0;
            for (Integer element : list) {
                if(element == each){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(each);
                break;
            }



        }
    }
}
/*
1.Write a program  that can return the first unique element from an arrayList

Do not use indexOf & last IndexOf methods
 */

