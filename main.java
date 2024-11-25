import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        Set<Integer> uniqueNumbers = new HashSet<>(); //set has no duplicate, hash for faster access
        Random random = new Random();
        // Create and initialize an array with six student names
        String[] allNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank"};
        int[] allStudentIDs = {101, 102, 103, 104, 105, 106};

        //4 is starting point, 3 means range so 4,5,6 where 4 is inclusive
        int randomNoMember = random.nextInt(3) + 4;
        System.out.println(randomNoMember);

        ExpeditionMember[] members = new ExpeditionMember[randomNoMember];
        int[] membersArray = new int[randomNoMember];


//            for (int num : membersArray) {
//                if (randomNumber == num) {
//                    add = false;
//                }
//            }
//            if (add){
//                membersArray[i] = randomNumber;
//            }
        }

//        for (int i = 0; i < membersArray.length; i++) {
//            System.out.println(membersArray[i]);
//        }

        //set used to make sure there is duplicate via key pair
//        while (uniqueNumbers.size() < randomNoMember){
//            int randomNumber = random.nextInt(6) + 0;
////            uniqueNumbers.add(randomNumber);
//            uniqueNumbers.add(randomNumber);
//        }
//
//        // Convert the Set to a List
//        List<Integer> uniqueNumbersList = new ArrayList<>(uniqueNumbers);
//        System.out.println(uniqueNumbersList);
//        for (int i = 0; i<uniqueNumbersList.size(); i++){
//            members[i] = new ExpeditionMember(allNames[uniqueNumbersList.get(i)], allStudentIDs[uniqueNumbersList.get(i)]);
////            System.out.println("Member " + (i + 1) + ": " + members[i].getMemberName() + " with ID " + members[i].getStudentID());
//        }

//        ResearchExpedition pyramidExpedition = new ResearchExpedition()

}
