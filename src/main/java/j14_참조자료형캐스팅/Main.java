package j14_참조자료형캐스팅;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer1 =new Computer();
        Computer computer2 =new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        CentralControl centralControl = new CentralControl(new Power[5]);//업캐스팅 묵시적 형변환 가능
        centralControl.addDevice(computer1);
        centralControl.addDevice(speaker);
        centralControl.addDevice(led);
        centralControl.powerOn();
        System.out.println("----------------------------------------------------");
        centralControl.powerOff();
    }
}
