package introexceptionthrowjunit5;

public class Tank {

    private int angle = 0;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber) {
        int newAngle = (angle + angleNumber + 360) % 360;

        if ((newAngle > 80 && newAngle < 280) || angleNumber > 160 || angleNumber < -160) {
            throw new IllegalArgumentException("Turret can not reach a position between 80° and 280°!");
        }
        angle = newAngle;
    }
}
