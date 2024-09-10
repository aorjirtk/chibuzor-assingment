package bike;

public class AutomaticBike {
    private String powerOn = "ON";
    private String powerOff = "OFF";
    private int gearOne = 0;
    private int gearTwo = 21;
    private int gearThree = 31;
    private int gearFour = 41;

    public String switchOnAutomaticBike(String powerOn){
     if(this.powerOn.equalsIgnoreCase(powerOn)) return this.powerOn;
     else return powerOn;
    }
    public String switchOffAutomaticBike(String powerOff){
        if(this.powerOff.equalsIgnoreCase(powerOff)) return this.powerOff;
        else return powerOff;
    }
    public int accelerateInGearOne(int acceleration){
        if(acceleration == 1){
            if(gearOne >= 20) return 20;
            else return gearOne += acceleration;
        }else
            return this.gearOne;
    }
    public int accelerateInGearTwo(int acceleration){
        if(acceleration == 2){
            if(gearTwo >= 30) return 30;
            else return gearTwo += acceleration;
        }else
            return this.gearTwo;
    }
    public int accelerateInGearThree(int acceleration){
        if(acceleration == 3){
            if(gearThree >= 40) return 40;
            else return gearThree += acceleration;
        }else
            return this.gearThree;
    }
    public int accelerateInGearFour(int acceleration){
        if(acceleration == 4) {
            if (gearFour > 40) return gearFour += acceleration;
        }
            return this.gearFour;
    }
    public int decelerateInGearOne(int deceleration){
        boolean decelerateGearOne = deceleration == 1;
        if(decelerateGearOne){
            gearOne -= deceleration;
            if(this.gearOne <= 0) return 0;
            else return gearOne;
        }else
            return this.gearOne;
    }
    public int decelerateInGearTwo(int deceleration){
        boolean decelerateGearTwo = deceleration == 2;
        if(decelerateGearTwo){
            gearTwo -= deceleration;
            if(this.gearTwo <= 21) return 21;
            else return gearTwo;
        }else
            return this.gearTwo;
    }
    public int decelerateInGearThree(int decelerate){
        boolean decelerateGearThree = decelerate == 3;
        if(decelerateGearThree){
            gearThree -= decelerate;
            if(this.gearThree <= 31) return 31;
            else return gearThree;
        }else
            return this.gearThree;
    }
    public int decelerateInGearFour(int decelerate){
        boolean decelerateGearFour = decelerate == 4;
        if(decelerateGearFour){
            gearFour -= decelerate;
            if(this.gearFour <= 41) return 41;
            else return gearFour;
        }else
            return this.gearFour;
    }

}
