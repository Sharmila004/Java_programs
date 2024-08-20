// Practise set 11.7
// Create a class TV which implements TVremote interface from Q6
// i.e., Create an interface TVremote and use it to inherit another interface SmartTvRemote

interface SmartTvRemote {

    void browseInternet();
}

interface TvRemote extends SmartTvRemote {

    void changeChannel(int channel);

    void adjustVolume(int volume);
}

class Tv implements TvRemote {

    public void browseInternet() {
        System.out.println("Browsing the internet...");
    }

    public void changeChannel(int channel) {
        System.out.println("Changing to channel " + channel);
    }

    public void adjustVolume(int volume) {
        System.out.println("Adjusting volume to " + volume);
    }
}

public class practise71 {

    public static void main(String[] args) {
        Tv myTv = new Tv();
        myTv.changeChannel(5);
        myTv.adjustVolume(20);
        myTv.browseInternet();
    }
}
