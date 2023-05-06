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
        currentRadioStation = newCurrentRadioStation;

    }

    public void setNextRadioStation(int nextRadioStation) {
        if (nextRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            nextRadioStation = nextRadioStation + 1;
            currentRadioStation = nextRadioStation;
        }
    }

    public void setPrevRadioStation(int prevRadioStation) {
        if (prevRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            prevRadioStation = prevRadioStation - 1;
            currentRadioStation = prevRadioStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setIncreaseVolume(int newVolumeValue) {
        if (newVolumeValue >= 100) {
            currentVolume = 100;
        } else {
            newVolumeValue = newVolumeValue + 1;
            currentVolume = newVolumeValue;
        }
    }

    public void setReduceVolume(int reduceVolumeValue) {
        if (reduceVolumeValue <= 0) {
            currentVolume = 0;
        } else {
            reduceVolumeValue = reduceVolumeValue - 1;
            currentVolume = reduceVolumeValue;
        }
    }


}