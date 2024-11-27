import java.util.Random;
import java.util.Set;
import java.util.LinkedHashSet;

public class main {
    public static void main(String[] args) {
        Random random = new Random();

        // Create and initialize an array with six student names
        String[] allNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank"};
        int[] allStudentIDs = {101, 102, 103, 104, 105, 106};

        // Generate random number of members (4 to 6 members)
        int randomNoMember = random.nextInt(3) + 4;
        System.out.println("Random number of members: " + randomNoMember);

        // Set to store unique member indices
        Set<Integer> membersSet = new LinkedHashSet<>();

        // Generate unique random indices for selecting members
        while (membersSet.size() < randomNoMember) {
            int randomMember = random.nextInt(allNames.length); // Random number between 0 and 5
            membersSet.add(randomMember);  // Ensures uniqueness
        }

        // Create an array to store ExpeditionMember objects
        ExpeditionMember[] members = new ExpeditionMember[randomNoMember];

        // Convert the Set to an array (to maintain insertion order)
        int index = 0;
        for (Integer memberIndex : membersSet) {
            String memberName = allNames[memberIndex];  // Get the name using the random index
            int studentID = allStudentIDs[memberIndex];  // Get the ID using the same random index

            // Add the ExpeditionMember to the array
            members[index++] = new ExpeditionMember(memberName, studentID);
        }
        System.out.println(membersSet);

        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0], members[1],members[2]);
        ResearchExpedition nileExpedition = new ResearchExpedition(members[members.length -3 ], members[members.length -2],members[members.length -1]);
        System.out.println("Pyramid Expedition: ");
        System.out.println("Expedition Leader: " + pyramidExpedition.getExpeditionLeaderName());
        System.out.println("Archivist: " + pyramidExpedition.getArchivistName());
        System.out.println("Field Researcher: " + pyramidExpedition.getFieldResearcherName());
        System.out.println("Nile Expedition: ");
        System.out.println("Expedition Leader: " + nileExpedition.getExpeditionLeaderName());
        System.out.println("Archivist: " + nileExpedition.getArchivistName());
        System.out.println("Field Researcher: " + nileExpedition.getFieldResearcherName());

        if(ExpeditionMember.member_counter == members.length) {
            System.out.println("SUCCESS");
        }
    }
}
