package j14_참조자료형캐스팅;

public class CentralControl  {
    private Power[] deviceArray;


    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;

    }
    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1){
            System.out.println("더이상 장치를 연결 할수없습니다.");
            System.out.println();
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName()+"장치가 연결 되었습니다");
        System.out.println();
    }
    private int checkEmpty() {
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
    }

    //    public CentralControl(Power computerPower, Power ledPower, Power speakerPower) {
//        this.computerPower = computerPower;
//        this.ledPower = ledPower;
//        this.speakerPower = speakerPower;
//    }
    public void powerOn() {
        for(int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) continue;
            deviceArray[i].on();
        }
    }
    public void powerOff() {
        for(int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) continue;
            deviceArray[i].off();
        }
    }
}
