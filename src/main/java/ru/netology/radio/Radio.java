package ru.netology.radio;

public class Radio {
    private int numberOfRadio = 10; //количество радиостанций по умолчанию
    private int maxRadio = 9; //максимальная радиостанция по умолчанию
    private int currentRadio; //номер текущей радиостанции
    private int maxVolume = 100;
    private int currentVolume;//громкость звука

    public Radio(int numberOfRadio) {
        this.numberOfRadio = numberOfRadio;
        this.maxRadio = numberOfRadio - 1;
    }

    public Radio() {
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getNumberOfRadio() {
        return numberOfRadio;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > maxRadio) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadio() {
        int next = currentRadio++;
        if (currentRadio > maxRadio) {
            next = 0;
        } else {
            next = currentRadio;
        }
        setCurrentRadio(next);
    }

    public void prevRadio() {
        int prev = currentRadio--;
        if (currentRadio < 0) {
            prev = maxRadio;
        } else {
            prev = currentRadio;
        }
        setCurrentRadio(prev);
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
