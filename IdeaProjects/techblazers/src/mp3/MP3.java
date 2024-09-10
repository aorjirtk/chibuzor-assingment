package mp3;


public class MP3 {
    private Boolean isOn;
    private Boolean initialState = isOn;
    public Boolean switchOnAndOffMp3(Boolean initialState) {
        if (this.initialState.equals(true)) return isOn = true;
    else return isOn = !isOn;
    }
}
