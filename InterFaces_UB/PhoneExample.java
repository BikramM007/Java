package InterFaces_UB;
class Phone{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Using massage function");
    }
}
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void stop();
}
class SmartPhone extends Phone implements Camera, MusicPlayer{

    @Override
    public void click() {
        System.out.println("SmartPhone clicking photo");
    }

    @Override
    public void record() {
        System.out.println("Smartphone record video");
    }

    @Override
    public void play() {
        System.out.println("Smartphone playing music");
    }

    @Override
    public void stop() {
        System.out.println("SmartPhone stop the music");
    }
}
public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.click();
        s.record();
        s.stop();
        s.play();
    }
}
