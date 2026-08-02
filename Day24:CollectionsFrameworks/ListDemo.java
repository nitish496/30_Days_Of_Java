import java.util.*;
//p-1

public class ListDemo{
    public static void main(String[] args) {
        List<String>arraylist =new ArrayList<>();
        arraylist.add("cat");
        arraylist.add("dog");
        arraylist.add("chicken");
        System.out.println("arraylist:"+arraylist);
        List<String>linkList = new LinkedList<>();
        linkList.add("king");
        linkList.add("queen");
        linkList.add("prince");
        System.out.println("linkedlist:"+linkList);
        List<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        System.out.println("Vector: " + vector);

        List<Integer> vectors = new Vector<>();
        vectors.add(10);
        vectors.add(20);
        System.out.println("Vector: " + vectors);
    }
}
