package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);

        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentRadioOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentRadioBelowLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(1);

        radio.nextRadio();
        int expected = 2;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioLimitValues() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        radio.nextRadio();
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);
        radio.prevRadio();
        int expected = 4;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioLimitValues() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.prevRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(45);
        int expected = 45;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(102);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-50);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(85);

        radio.volumeUp();
        int expected = 86;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeUpLimitValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeUp();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        radio.volumeDown();
        int expected = 14;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeDownLimitValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
