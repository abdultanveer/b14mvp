package b14.rjt.com.myapplication.interfaces;

public class GEAppliances implements ISwitchBoard {
    @Override
    public void fanSwitch() {
        System.out.println("fan is running");
    }

    @Override
    public void lightSwitch() {
        System.out.println("light is running");

    }

    @Override
    public void acSwitch() {
        System.out.println("ac is running");

    }
}
