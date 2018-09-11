package b14.rjt.com.myapplication.interfaces;

public class Wiring {
    public static void main(String[] args){
        ISwitchBoard switchBoard = new KoneAppliances();
                //new GEAppliances();//wiring
        switchBoard.acSwitch();
        switchBoard.fanSwitch();
        switchBoard.lightSwitch();
    }
}
