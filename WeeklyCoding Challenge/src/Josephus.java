import java.util.ArrayList;

/*This classic problem dates back to Roman times. There are 41 soldiers arranged in a circle. Every third soldier is to be killed by their captors, continuing around the circle until only one soldier remains. He is to be freed. Assuming you would like to stay alive, at what position in the circle would you stand?
Generalize this problem by creating a function that accepts the number of soldiers n and the interval at which they are killed i, and returns the position of the fortunate survivor.
Examples
<code>josephus(41, 3) ➞ 31josephus(35, 11) ➞ 18josephus(11, 1) ➞ 11josephus(2, 2) ➞ 1</code>Notes
Assume the positions are numbered 1 to n going clockwise around the circle.
If the interval is 3, the first soldiers to die are at positions 3, 6, and 9.*/
public class Josephus {
    public static void main(String[] args) {
        System.out.println("josephus(41, 3) -> " + josephus(41, 3));
        System.out.println("josephus(35, 11) -> " + josephus(35, 11));
        System.out.println("josephus(11, 1) -> " + josephus(11, 1));
        System.out.println("josephus(2, 2) -> " + josephus(2, 2));
    }

    public static int josephus(int soldier, int intervals) {
        ArrayList<Integer> live = new ArrayList<>();

        for(int i = 1; i <= soldier; i++) {
           live.add(i);
        }

        int index = -1;
        while(live.size() > 1) {
            index += intervals;
            while(index >= live.size()) {
                index -= live.size();
            }
            live.remove(index);
            index--;
        }
        return live.get(0);
    }
}