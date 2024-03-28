package ru.netology.services;

public class Radio {

    private int countRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int count) {
        countRadioStation = minRadioStation + count;
        maxRadioStation = countRadioStation - 1;
        minRadioStation = 0;
    }

    public Radio() {
        countRadioStation = 10;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
            return;
        }
        if (newCurrentRadioStation < minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            setCurrentVolume(minVolume);
            return;
        }
        if (newCurrentVolume > maxVolume) {
            setCurrentVolume(maxVolume);
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        int nextStation = currentRadioStation + 1;
        if (nextStation < maxRadioStation) {
            setCurrentRadioStation(nextStation);
        }
        if (nextStation > maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        }
        return;
    }

    public void prev() {
        int prevStation = currentRadioStation - 1;
        if (prevStation > minRadioStation) {
            setCurrentRadioStation(prevStation);
        }
        if (prevStation < minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        }
        return;
    }

    public void increaseVolume() {
        int nextVolume = currentVolume + 1;
        if (currentVolume == maxVolume) {
            setCurrentVolume(maxVolume);
        }
        if (currentVolume < maxVolume) {
            setCurrentVolume(nextVolume);
        }
        return;
    }

    public void decreaseVolume() {
        int prevVolume = currentVolume - 1;
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        }
        if (currentVolume > minVolume) {
            setCurrentVolume(prevVolume);
        }
        return;
    }

}