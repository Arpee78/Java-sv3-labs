package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        List<String> group1ShortNames = new ArrayList<>();
        List<String> group2LongNames = new ArrayList<>();
        for (String actual : students) {
            if (actual.length() <= 10) {
                group1ShortNames.add(actual);
            } else if (actual.length() > 10) {
                group2LongNames.add(actual);
            }
        }
        System.out.println("Rövid nevűek: " + group1ShortNames);
        System.out.println("Hosszú nevűek: " + group2LongNames);
    }

    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        List<String> names = Arrays.asList("Kiss József", "Nagy Béla", "Szép Virág", "Németh László", "Joó Éva", "Hosszúréti Károly");
        studyGroup.printStudyGroups(names);
    }
}
