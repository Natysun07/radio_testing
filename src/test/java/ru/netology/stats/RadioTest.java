package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void currentNewRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNextCurrent() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.installingNextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.installingNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationEqualCurrent() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.installingNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationPrevCurrent() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.installingPrevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.installingPrevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationEqualMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.installingPrevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.installingIncreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.installingIncreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeEqualMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.installingIncreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.installingReduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.installingReduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeEqualMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.installingReduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}