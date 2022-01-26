package List;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray_And_ArrayList {

    public static void main(String[] args) {
        //ArrayReverse

        int[]array = {1,2,3,4,5,6};

        int[]result = new int[array.length]; //{6,5,4,3,2,1}

        int j = 0;
        for (int i = array.length; i >0 ; i++) {
            result[j]= array[i];

        }
        System.out.println(Arrays.toString(result));

        System.out.println("----------------------------------------------------");


        //ArrayList Reverse

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);
            reversedList.add(each);

        }


        System.out.println(reversedList);
    }
}


