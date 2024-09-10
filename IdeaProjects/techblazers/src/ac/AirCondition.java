package ac;

public class AirCondition {
        private String powerOn = "ON";
        private String powerOff = "OFF";
        private int increaseTemp = 16;

        public String switchOnAirCondition(String powerOn) {
            if(this.powerOn.equalsIgnoreCase(powerOn)) return this.powerOn;
            else return powerOff;
        }
        public String switchOffAirCondition(String powerOff) {
            if(this.powerOff.equalsIgnoreCase(powerOff)) return this.powerOff;
            else return powerOn;
        }
        public int IncreaseAirConditionTemperature(int increase) {
            if( increase == 1){
                if (increaseTemp >= 30) return 30;
                else return increaseTemp += increase;
            }else
                return this.increaseTemp;
        }
        public int DecreaseAirConditionTemperature(int decrease ) {
            boolean airConditionDecrement = decrease == 1;
            if(airConditionDecrement){
                increaseTemp -= decrease;
                if (this.increaseTemp < 16) return 16;
                else return this.increaseTemp;
            }else
                return this.increaseTemp;
        }
}
