import java.util.TreeSet;

public class Practice11 {
    public static void main(String[] args) {
        // create TreeSet and add element
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Malcom");
        treeSet.add("William");
        treeSet.add("Johnathan");
        treeSet.add("Apricot");

        for(String name: treeSet){
            System.out.println(name);
        }

    }
}
