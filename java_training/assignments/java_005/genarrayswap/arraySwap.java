//Lonnie Williams
//Jump Training

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class arraySwap {
public static final <T> void swap (T[] a, int i, int j) {
  T t = a[i];
  a[i] = a[j];
  a[j] = t;
}

public static final <T> void swap (List<T> l, int i, int j) {
  Collections.<T>swap(l, i, j);
}

private static void test() {
  String [] a = {"Adios", "Buenas Noches", "Good Afternoon"};
  swap(a, 0, 1);
  System.out.println(Arrays.toString(a));
  List<String> l = new ArrayList<String>(Arrays.asList(a));
 
  swap(l, 0, 1);
  swap(l, 0, 2);
  System.out.println(l);
 
}
public static void main(String...args)
{
test();
}

}