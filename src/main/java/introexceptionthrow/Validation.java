package introexceptionthrow;

public class Validation {

    public void validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Null értéket adtál meg.");
        }
        if (name.isBlank()) {
            throw new IllegalArgumentException("A név üres.");
        }
    }

    public void validateAge(String ageText) {

        if (ageText == null) {
            throw new IllegalArgumentException("Null értéket adtál meg.");
        }

        if (ageText.isBlank()) {
            throw new IllegalArgumentException("Az életkor adat üres.");
        }

        for (char c : ageText.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Az életkor adat nem szám.");
            }
        }

        int age = Integer.parseInt(ageText);
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Az életkor adat nem lehet nullánál kisebb vagy 120-nál nagyobb.");
        }

    }
}
