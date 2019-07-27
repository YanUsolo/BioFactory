package webLogic.entity;

import webLogic.dto.AllDayDto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by yansolo on 21.08.2018.
 */
@Entity
@Table(name = "allday")
public class AllDayEntity implements Serializable {

    @Id
    @Column(name = "AD_id",updatable = false,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @Column(name = "AD_allMass")
    private float _allMass;

    @Column(name = "AD_dayMassSV")
    private float _dayMassSV;
    @Column(name = "AD_nightMassSV")
    private float _nightMassSV;
    @Column(name = "AD_allMassSV")
    private float _allMassSV;

    @Column(name = "AD_dayMassWater")
    private float _dayMassWater;
    @Column(name = "AD_nightMassWater")
    private float _nightMassWater;
    @Column(name = "AD_allMassWater")
    private float _allMassWater;

    @Column(name = "AD_relationDaySV")
    private float _relationDaySV;
    @Column(name = "AD_relationNightSV")
    private float _relationNightSV;
    @Column(name = "AD_relationAllSV")
    private float _relationAllSV;

    @Column(name = "AD_serovodorodDay")
    private float _serovodorodDay;
    @Column(name = "AD_serovodorodNight")
    private float _serovodorodNight;

    @Column(name = "AD_gpa")
    private float _gpa;


    @Column(name = "AD_date")
    public String date;

    @OneToMany(fetch = FetchType.EAGER, mappedBy="allDayEntity")
    private Set<ProductComputationlyEntity> productComputationlyEntities;

    public AllDayEntity(AllDayDto allDayDto) {
        this._allMass = Float.parseFloat(allDayDto.getAllMass());
        this._dayMassSV = Float.parseFloat(allDayDto.getDayMassSV());
        this._nightMassSV = Float.parseFloat(allDayDto.getNightMassSV());
        this._allMassSV = Float.parseFloat(allDayDto.getAllMassSV());
        this._dayMassWater = Float.parseFloat(allDayDto.getDayMassWater());
        this._nightMassWater = Float.parseFloat(allDayDto.getNightMassWater());
        this._allMassWater = Float.parseFloat(allDayDto.getAllMassWater());
        this._relationDaySV = Float.parseFloat(allDayDto.getRelationDaySV());
        this._relationNightSV = Float.parseFloat(allDayDto.getRelationNightSV());
        this._relationAllSV = Float.parseFloat(allDayDto.getRelationAllSV());
        this._gpa = Float.parseFloat(allDayDto.getGPA());
        this.date = allDayDto.getDate();

    }

    public AllDayEntity() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public float get_allMass() {
        return _allMass;
    }

    public void set_allMass(float _allMass) {
        this._allMass = _allMass;
    }

    public float get_dayMassSV() {
        return _dayMassSV;
    }

    public void set_dayMassSV(float _dayMassSV) {
        this._dayMassSV = _dayMassSV;
    }

    public float get_nightMassSV() {
        return _nightMassSV;
    }

    public void set_nightMassSV(float _nightMassSV) {
        this._nightMassSV = _nightMassSV;
    }

    public float get_allMassSV() {
        return _allMassSV;
    }

    public void set_allMassSV(float _allMassSV) {
        this._allMassSV = _allMassSV;
    }

    public float get_dayMassWater() {
        return _dayMassWater;
    }

    public void set_dayMassWater(float _dayMassWater) {
        this._dayMassWater = _dayMassWater;
    }

    public float get_nightMassWater() {
        return _nightMassWater;
    }

    public void set_nightMassWater(float _nightMassWater) {
        this._nightMassWater = _nightMassWater;
    }

    public float get_allMassWater() {
        return _allMassWater;
    }

    public void set_allMassWater(float _allMassWater) {
        this._allMassWater = _allMassWater;
    }

    public float get_relationDaySV() {
        return _relationDaySV;
    }

    public void set_relationDaySV(float _relationDaySV) {
        this._relationDaySV = _relationDaySV;
    }

    public float get_relationNightSV() {
        return _relationNightSV;
    }

    public void set_relationNightSV(float _relationNightSV) {
        this._relationNightSV = _relationNightSV;
    }

    public float get_relationAllSV() {
        return _relationAllSV;
    }

    public void set_relationAllSV(float _relationAllSV) {
        this._relationAllSV = _relationAllSV;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float get_gpa() {
        return _gpa;
    }

    public void set_gpa(float _gpa) {
        this._gpa = _gpa;
    }

    public float get_serovodorodDay() {
        return _serovodorodDay;
    }

    public void set_serovodorodDay(float _serovodorodDay) {
        this._serovodorodDay = _serovodorodDay;
    }

    public float get_serovodorodNight() {
        return _serovodorodNight;
    }

    public void set_serovodorodNight(float _serovodorodNight) {
        this._serovodorodNight = _serovodorodNight;
    }



    public Set<ProductComputationlyEntity> getProductComputationlyEntities() {
        return productComputationlyEntities;
    }

    public void setProductComputationlyEntities(Set<ProductComputationlyEntity> productComputationlyEntities) {
        this.productComputationlyEntities = productComputationlyEntities;
    }



    public void resetAllDayEntity(AllDayDto allDayDto) {
        this._allMass = Float.parseFloat(allDayDto.getAllMass());
        this._dayMassSV = Float.parseFloat(allDayDto.getDayMassSV());
        this._nightMassSV = Float.parseFloat(allDayDto.getNightMassSV());
        this._allMassSV = Float.parseFloat(allDayDto.getAllMassSV());
        this._dayMassWater = Float.parseFloat(allDayDto.getDayMassWater());
        this._nightMassWater = Float.parseFloat(allDayDto.getNightMassWater());
        this._allMassWater = Float.parseFloat(allDayDto.getAllMassWater());
        this._relationDaySV = Float.parseFloat(allDayDto.getRelationDaySV());
        this._relationNightSV = Float.parseFloat(allDayDto.getRelationNightSV());
        this._relationAllSV = Float.parseFloat(allDayDto.getRelationAllSV());
        this._serovodorodDay =
        this._gpa = Float.parseFloat(allDayDto.getGPA());
        this.date = allDayDto.getDate();

    }
}
