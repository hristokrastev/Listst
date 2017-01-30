package Java_fund_second_couse.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<Integer> list =
                IntStream.of(Arrays.stream(
                        console.nextLine()
                                .split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                        .boxed()
                        .collect(Collectors.toList());


        ArrayList<Integer> result = new ArrayList<Integer>();


        for (Integer item : list) {
            if (item > 0) {
                result.add(item);
            }
        }

            System.out.println(result.toString().substring(1, result.toString().length()-1));


//
//        System.out.println ( word );
//        System.out.println ( word.size () );


        // words.addAll(Arrays.asList(input.nextLine().split("\\s+")));
        // System.out.println (input);


        // System.out.println (numbers);

    }
}
