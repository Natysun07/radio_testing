package ru.netology.stats;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }

        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;

    }

    public void installingNextRadioStation() {
        int nextStation = currentRadioStation;
        currentRadioStation = nextStation;
        if (nextStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void installingPrevRadioStation() {
        int prevStation = currentRadioStation;
        currentRadioStation = prevStation;
        if (prevStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;

        }
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

    public void installingIncreaseVolume() {
        int increaseVolume = currentVolume;
        currentVolume = increaseVolume;
        if (increaseVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume++;
        }
    }

    public void installingReduceVolume() {
        int reduceVolume = currentVolume;
        currentVolume = reduceVolume;
        if (reduceVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume--;

        }
    }


}