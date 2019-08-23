import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class DiagonalDifferences{
	public static void main(String[] args) {
		Integer[][] l = {{11, 2, 4},{4, 5, 6},{10, 8, -12}};
		
		List<List<Integer>> arr = Arrays.stream(l).map(Arrays::asList).collect(Collectors.toList());
		
		System.out.println(arr);
		
		int x = 0;
        int y = 0;

        // int y = arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);

        for(int i = 0; i < arr.size(); i++){
            x += arr.get(i).get(i);
        }

        for(int i = 0; i < arr.size(); i++){
            y += arr.get(i).get(arr.get(i).size() - 1 - i);
        }

//        System.out.println(x);
//        System.out.println(y);
        System.out.println(Math.abs(x - y));
	}
}




