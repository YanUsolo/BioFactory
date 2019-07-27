package webLogic.dto;

import webLogic.entity.AllDayEntity;

import java.io.Serializable;

/**
 * Created by yansolo on 21.08.2018.
 */
public class AllDayDto implements Serializable {

    public String allMass;
    //Всего с.в. из загруженных тонн за день и по сменам
    public String dayMassSV;
    public String nightMassSV;
    public String allMassSV;
    //Всего воды из за груженных тонн за день и по сменам
    public String dayMassWater;
    public String nightMassWater;
    public String allMassWater;
    //relation - отношение,рассчёт отношения массы с.в. и воды
    public String relationDaySV;
    public String relationNightSV;
    public String relationAllSV;

    public String serovodorodDay;
    public String serovodorodNight;

    public String GPA;

    public String date;

    public AllDayDto() {
        this.allMass = 1 + "";
        this.dayMassSV = 1 + "";
        this.nightMassSV = 1 + "";
        this.allMassSV = 1 + "";
        this.dayMassWater = 1 + "";
        this.nightMassWater = 1 + "";
        this.allMassWater = 1 + "";
        this.relationDaySV = 1 + "";
        this.relationNightSV = 1 + "";
        this.relationAllSV = 1 + "";
        this.serovodorodDay = 1 + "";
        this.serovodorodNight = 1 + "";


        this.date = "2018.08.26";
    }

    //ToDo maybe
    public AllDayDto(AllDayEntity allDayEntity) {
        this.allMass = allDayEntity.get_allMass() + "";
        this.dayMassSV = allDayEntity.get_dayMassSV() + "";
        this.nightMassSV = allDayEntity.get_nightMassWater() + "";
        this.allMassSV = allDayEntity.get_allMassSV() + "";
        this.dayMassWater = allDayEntity.get_dayMassWater() + "";
        this.nightMassWater = allDayEntity.get_nightMassWater() + "";
        this.allMassWater = allDayEntity.get_allMassWater() + "";
        this.relationDaySV = 1 + "";
        this.relationNightSV = 1 + "";
        this.relationAllSV = 1 + "";
        this.serovodorodDay = 1 + "";
        this.serovodorodNight = 1 + "";


        this.date = "2018.08.26";
    }


    public String getAllMass() {
        return allMass;
    }

    public void setAllMass(String allMass) {
        this.allMass = allMass;
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

    public String getAllMassSV() {
        return allMassSV;
    }

    public void setAllMassSV(String allMassSV) {
        this.allMassSV = allMassSV;
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

    public String getAllMassWater() {
        return allMassWater;
    }

    public void setAllMassWater(String allMassWater) {
        this.allMassWater = allMassWater;
    }

    public String getRelationDaySV() {
        return relationDaySV;
    }

    public void setRelationDaySV(String relationDaySV) {
        this.relationDaySV = relationDaySV;
    }

    public String getRelationNightSV() {
        return relationNightSV;
    }

    public void setRelationNightSV(String relationNightSV) {
        this.relationNightSV = relationNightSV;
    }

    public String getRelationAllSV() {
        return relationAllSV;
    }

    public void setRelationAllSV(String relationAllSV) {
        this.relationAllSV = relationAllSV;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getSerovodorodDay() {
        return serovodorodDay;
    }

    public void setSerovodorodDay(String serovodorodDay) {
        this.serovodorodDay = serovodorodDay;
    }

    public String getSerovodorodNight() {
        return serovodorodNight;
    }

    public void setSerovodorodNight(String serovodorodNight) {
        this.serovodorodNight = serovodorodNight;
    }
}
