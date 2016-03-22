/**
 * Created by Konstantin on 22.03.2016.
 */
public class Car {

    public Engine engine;

    private String warningMessages;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void accelerate() {
        engine.increaseRpm();
        if (engine.getRpm() > 5000){
            warningMessages = "Slow Down!";
        }
    }

    public String getWarningMessages() {
        return warningMessages;
    }

    public void setWarningMessages(String warningMessages) {
        this.warningMessages = warningMessages;
    }
}
