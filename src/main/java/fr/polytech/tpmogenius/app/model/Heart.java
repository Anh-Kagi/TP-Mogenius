package fr.polytech.tpmogenius.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Heart {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private byte r;
    private byte g;
    private byte b;

    private byte rate;

    public Heart(String color, byte rate) {
        setColor("#f00");
        setColor(color);
        setRate(rate);
    }

    protected Heart() {}

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setColor(String color) {
        if (color.charAt(0) == '#') {
            color = color.substring(1, color.length());
        }
        if (color.length() == 3) {
            r = (byte) (Integer.parseInt(color.substring(0,1) + color.substring(0,1), 16) - 128);
            g = (byte) (Integer.parseInt(color.substring(1,2) + color.substring(1,2), 16) - 128);
            b = (byte) (Integer.parseInt(color.substring(2,3) + color.substring(2,3), 16) - 128);

        } else if (color.length() == 6) {
            this.r = (byte) (Integer.parseInt(color.substring(0,2), 16) - 128);
            this.g = (byte) (Integer.parseInt(color.substring(2,4), 16) - 128);
            this.b = (byte) (Integer.parseInt(color.substring(4,6), 16) - 128);
        }
    }

    public String getColor() {
        return String.format("#%02x%02x%02x", Integer.valueOf(r)+128, Integer.valueOf(g)+128, Integer.valueOf(b)+128);
    }

    public void setRate(byte rate) {
        this.rate = rate;
    }

    public byte getRate() {
        return rate;
    }
}
