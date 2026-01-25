package module_2_1.television;

public class Television {
    // kanava, jota katsotaan
    private int channel;

    // televisiossa on vain nämä kanavat
    private int[] channels =new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // alussa televisio on pois päältä
    private boolean isOn = false;

    // tarkistetaan, onko kanava olemassa, vain sallitut kanavat hyväksytään
    private boolean isValidChannel(int selectedChannel) {
        for (int channel : channels) {
            if (channel == selectedChannel) {
                return true;
            }
        }
        return false;
    }

    // kerrotaan, onko televisio päällä vai ei
    public boolean isOn() {
        return !isOn;
    }

    // palautetaan nykyinen kanava
    public int getChannel() {
        return channel;
    }

    // asetetaan uusi kanava, jos kanava ei ole sallittu, palataan ensimmäiseen kanavaan
    public void setChannel(int selectedChannel) {
        if (!isOn) return;

        if (isValidChannel(selectedChannel)) {
            this.channel = selectedChannel;
        } else {
            this.channel = channels[0];
        }
    }

    // virtanappi, jos televisio on päällä, se menee pois, jos se on pois päältä, se menee päälle
    public void pressOnOff() {
        isOn = !isOn;
    }
}
