package webLogic.dto;

import java.io.Serializable;

/**
 * Created by yansolo on 21.08.2018.
 */
public class ProductComputationlyDto implements Serializable {

    //загруженно тонн
    public String dayMass;
    public String nightMass;
    //с.в. из загруженных тонн
    public String dayMassSV;
    public String nightMassSV;
    //воды их этих тонн
    public String dayMassWater;
    public String nightMassWater;
    //метана из этих тонн
    public String metanDay;
    public String metanNight;

    public String uniqueId_Product;

    public String getDayMass() {
        return dayMass;
    }

    public void setDayMass(String dayMass) {
        this.dayMass = dayMass;
    }

    public String getNightMass() {
        return nightMass;
    }

    public void setNightMass(String nightMass) {
        this.nightMass = nightMass;
    }

    public String getDayMassSV() {
        return dayMassSV;
    }

    public void setDayMassSV(String dayMassSV) {
        this.dayMassSV = dayMassSV;
    }

    public String getNightMassSV() {
        return nightMassSV;
    }

    public void setNightMassSV(String nightMassSV) {
        this.nightMassSV = nightMassSV;
    }

    public String getDayMassWater() {
        return dayMassWater;
    }

    public void setDayMassWater(String dayMassWater) {
        this.dayMassWater = dayMassWater;
    }

    public String getNightMassWater() {
        return nightMassWater;
    }

    public void setNightMassWater(String nightMassWater) {
        this.nightMassWater = nightMassWater;
    }

    public String getMetanDay() {
        return metanDay;
    }

    public void setMetanDay(String metanDay) {
        this.metanDay = metanDay;
    }

    public String getMetanNight() {
        return metanNight;
    }

    public void setMetanNight(String metanNight) {
        this.metanNight = metanNight;
    }

    public String getUniqueId_Product() {
        return uniqueId_Product;
    }

    public void setUniqueId_Product(String uniqueId_Product) {
        this.uniqueId_Product = uniqueId_Product;
    }
}
