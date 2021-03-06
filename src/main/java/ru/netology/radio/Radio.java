package ru.netology.radio;

public class Radio {
    private int currentChanel;
    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentSound;
    private int maxSound = 10;
    private int minSound = 0;

    public int getCurrentChanel() {

        if (currentChanel > minChanel && currentChanel < maxChanel || currentChanel == maxChanel || currentChanel == minChanel) {
            return currentChanel;
        }
        return currentChanel;
    }


    public void setCurrentChanel(int currentChanel) {
        if (currentChanel >= minChanel) {
            this.currentChanel = currentChanel;
        }
        if (currentChanel <= maxChanel) {
            this.currentChanel = currentChanel;
        }
        if (currentChanel > maxChanel) {
            this.currentChanel = minChanel;
        }
        if (currentChanel < minChanel) {
            this.currentChanel = maxChanel;
        }
    }

    public int getCurrentSound() {
        if (currentSound < maxSound && currentSound > minSound) {
            return currentSound;
        }

        if (currentSound == maxSound) {
            return maxSound;
        }
        if (currentSound == minSound) {
            return minSound;
        }
        return currentSound;
    }


    public void setCurrentSound(int currentSound) {
        if (currentSound < maxSound) {
            this.currentSound = currentSound;
        }
        if (currentSound > minSound) {
            this.currentSound = currentSound;
        }
        if (currentSound >= maxSound) {
            this.currentSound = maxSound;
        }
        if (currentSound <= minSound) {
            this.currentSound = minSound;
        }
    }
}