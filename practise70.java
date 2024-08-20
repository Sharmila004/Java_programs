// Practise set 11.6
// Create an interface TVremote and use it to inherit another interface SmartTvRemote

interface SmartTvRemote {

    void browseInternet();
}

interface TvRemote extends SmartTvRemote {

    void changeChannel(int channel);

    void adjustVolume(int volume);
}

public class practise70 {

    public static void main(String[] args) {
    }
}
