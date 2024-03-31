package ru.netology.services;

public class Radio {


    private int currentVolume;          // текущая громкость
    private int currentRadioStation;    // текущая радиостанция

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {  // установка радиостанции
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {   // установка громкости
        if (newCurrentVolume < 0) {
            setCurrentVolume(0);
            return;
        }
        if (newCurrentVolume > 100) {
            setCurrentVolume(100);
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {                // увеличение громкости на 1
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {              // уменьшение громкости на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public void next() {                // следущая радиостанция
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {                // предыдущая радиостанция
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }
    public void increaseVolume() {
        int nextVolume = currentVolume + 1;
        if (currentVolume == 100) {
            setCurrentVolume(100);
        }
        if (currentVolume < 100) {
            setCurrentVolume(nextVolume);
        }
        return;
    }

    public void decreaseVolume() {
        int prevVolume = currentVolume - 1;
        if (currentVolume <= 0) {
            setCurrentVolume(0);
        }
        if (currentVolume > 0) {
            setCurrentVolume(prevVolume);
        }
        return;
    }
}
