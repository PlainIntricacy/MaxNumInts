import java.util.*;

/**
 * Write a function that given a list of non negative integers, arranges them such that they
 * form the largest possible number. For example, given [50, 2, 1, 9], the largest formed
 * number is 95021.
 *
 * @author: todyerutz@plainintricacy.wordpress.com
 */

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the list of numbers (separated by space):");
        String[] parts = input.nextLine().split(" ");
        input.close();
        List<String> nums = new ArrayList<String>();
        for(int i=0; i<parts.length; i++){
            nums.add(parts[i]);
        }
        Collections.sort(nums, new Comparator<String>() {
            public int compare(String a, String b) {
                if(Integer.parseInt(a.substring(0,1))>Integer.parseInt(b.substring(0,1))){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        for(String i:nums){
            System.out.print(i);
        }
    }
}
