package introexceptionthrowjunit4;

public class Tank {

    private int angle = 0;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber) {
        int newAngle = angle + angleNumber;
        if (newAngle < -80 || newAngle > 80 || angleNumber > 160 || angleNumber < -160) {
            throw new IllegalArgumentException("Turret can not reach a position outside of -80° and +80°!");
        }
        angle = newAngle;
    }
}
