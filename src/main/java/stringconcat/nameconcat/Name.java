package stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle() {
        String t = title != null ? title.getTitle().concat(" ") : "";
        String g = givenName != null && !givenName.isBlank() ? givenName.concat(" ") : "";
        String m = middleName != null && !middleName.isBlank() ? middleName.concat(" ") : "";
        String f = familyName != null && !familyName.isBlank() ? familyName : "";
        return t.concat(g).concat(m).concat(f);
    }

    public String concatNameHungarianStyle() {
        String t = title != null ? title.getTitle() + " " : "";
        String f = familyName != null && !familyName.isBlank() ? familyName + " " : " ";
        String m = middleName != null && !middleName.isBlank() ? middleName + " " : "";
        String g = givenName != null && !givenName.isBlank() ? givenName : "";
        return t + f + m + g;
    }

}
