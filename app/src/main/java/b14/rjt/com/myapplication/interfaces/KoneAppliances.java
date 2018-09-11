package b14.rjt.com.myapplication.interfaces;

public class KoneAppliances implements ISwitchBoard{
    @Override
    public void fanSwitch() {
        System.out.println("kone fan is running");

    }

    @Override
    public void lightSwitch() {
        System.out.println("kone light is running");

    }

    @Override
    public void acSwitch() {
        System.out.println("kone ac is running");

    }
}
