package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<FamilyMember> familyMembers;

    public Family() {
        this.familyMembers = new ArrayList<>();
    }

    public List<FamilyMember> getFamilyMembers() {
        return new ArrayList<>(familyMembers);
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMembers.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String firstName){
        List<Integer> agesOfFamilyMembersWithNameGiven = new ArrayList<>();

        for (FamilyMember familyMember : familyMembers) {

            String fullName = familyMember.getName();
            String firstNames = fullName.substring(fullName.indexOf(" "));

            if (firstNames.contains(firstName)){
                agesOfFamilyMembersWithNameGiven.add(familyMember.getAge());
            }
        }

        return agesOfFamilyMembersWithNameGiven;
    }
}
