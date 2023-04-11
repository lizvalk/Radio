package ru.netology.radio;

public class Radio {
    private int currentRadio; //номер текущей радиостанции
    private int currentVolume; //громкость звука

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadio() {
        int next = currentRadio++;
        if (currentRadio > 9) {
            next = 0;
        } else {
            next = currentRadio;
        }
        setCurrentRadio(next);
    }

    public void prevRadio() {
        int prev = currentRadio--;
        if (currentRadio < 0) {
            prev = 9;
        } else {
            prev = currentRadio;
        }
        setCurrentRadio(prev);
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
