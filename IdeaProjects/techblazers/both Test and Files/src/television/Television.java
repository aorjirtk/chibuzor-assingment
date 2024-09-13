package television;

import javax.swing.*;

public class Television {
    private String powerOn = "ON";
    private String powerOff = "OFF";
    private int increaseChanel = 0;
    private int decreaseChanel = 0;
    private int increaseVolume = 0;


    public String switchOnTelevision(String powerOn) {
        if(this.powerOn.equalsIgnoreCase(powerOn))return this.powerOn;
        else return powerOff;
        }
        public String switchOffTelevision(String powerOff) {
        if(this.powerOff.equalsIgnoreCase(powerOff))return this.powerOff;
        else return powerOn;
        }

        public int increaseTelevisionChanel(int increase) {
            if(increase == 1){;
                if (increaseChanel >= 10) return 10;
                 else return increaseChanel += increase;
        }else
                return this.increaseChanel;
        }
        public int decreaseTelevisionChanel(int decrease) {
        boolean decrementTelevisionChanel = decrease ==1;
        if(decrementTelevisionChanel){
            increaseChanel -= decrease;
            if (this.increaseChanel <= 0) return 0;
            else return increaseChanel;
        }else
            return this.increaseChanel;
        }
        public int increaseTelevisionVolume(int increase) {
        if(increase == 1){
            if(increaseVolume >= 10) return 10;
            else return increaseVolume += increase;
        }else
            return this.increaseVolume;
        }
        public int decreaseTelevisionVolume(int decrease){
        boolean decreaseVolume = decrease == 1;
        if(decreaseVolume){
            increaseVolume -= decrease;
            if(this.increaseVolume <= 0) return 0;
            else return increaseVolume;
        }else
            return this.increaseVolume;
        }


    }

