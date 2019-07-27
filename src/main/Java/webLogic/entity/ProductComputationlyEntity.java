package webLogic.entity;

import webLogic.dto.ProductComputationlyDto;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yansolo on 21.08.2018.
 */
@Entity
@Table(name = "fscomputationly")
public class ProductComputationlyEntity implements Serializable {

    @Id
    @Column(name = "fsComputationly_id",updatable = false,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @Column(name = "fsComputationly_dayMass")
    private float dayMass;
    @Column(name = "fsComputationly_nightMass")
    private float nightMass;

    @Column(name = "fsComputationly_dayMassSV")
    private float dayMassSV;
    @Column(name = "fsComputationly_nightMassSV")
    private float nightMassSV;

    @Column(name = "fsComputationly_dayMassWater")
    private float dayMassWater;
    @Column(name = "fsComputationly_nightMassWater")
    private float nightMassWater;

    @Column(name = "fsComputationly_metanDay")
    private float metanDay;
    @Column(name = "fsComputationly_metanNight")
    private float metanNight;

    @Column(name = "fsComputationly_uniqueId_Product")
    private int uniqueId_Product;

//    @Column(name = "fk_AD_id")
//    private int fk_AD_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_AD_id", referencedColumnName = "AD_id")
    private AllDayEntity allDayEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_FS_id", referencedColumnName = "feedstock_id")
    private ProductEntity productEntity;

    public ProductComputationlyEntity(ProductComputationlyDto productCompDto,AllDayEntity allDayEntity,ProductEntity productEntity) {
        this.dayMass = Float.parseFloat(productCompDto.getDayMass());
        this.nightMass = Float.parseFloat(productCompDto.getNightMass());
        this.dayMassSV = Float.parseFloat(productCompDto.getDayMass());
        this.nightMassSV = Float.parseFloat(productCompDto.getNightMassSV());
        this.dayMassWater = Float.parseFloat(productCompDto.getDayMassWater());
        this.nightMassWater = Float.parseFloat(productCompDto.getNightMassWater());
        this.metanDay = Float.parseFloat(productCompDto.getMetanDay());
        this.metanNight = Float.parseFloat(productCompDto.getMetanNight());
        this.uniqueId_Product = productEntity.get_uniqueId();
this.productEntity = productEntity;
        this.allDayEntity = allDayEntity;
    }

    public ProductComputationlyEntity(ProductComputationlyDto productCompDto,AllDayEntity allDayEntity) {
        this.dayMass = Float.parseFloat(productCompDto.getDayMass());
        this.nightMass = Float.parseFloat(productCompDto.getNightMass());
        this.dayMassSV = Float.parseFloat(productCompDto.getDayMass());
        this.nightMassSV = Float.parseFloat(productCompDto.getNightMassSV());
        this.dayMassWater = Float.parseFloat(productCompDto.getDayMassWater());
        this.nightMassWater = Float.parseFloat(productCompDto.getNightMassWater());
        this.metanDay = Float.parseFloat(productCompDto.getMetanDay());
        this.metanNight = Float.parseFloat(productCompDto.getMetanNight());
        this.uniqueId_Product = Integer.parseInt(productCompDto.getUniqueId_Product());

        this.allDayEntity = allDayEntity;
    }

    public void resetProductComputationlyEntity(ProductComputationlyDto productCompDto,AllDayEntity allDayEntity) {
        this.dayMass = Float.parseFloat(productCompDto.getDayMass());
        this.nightMass = Float.parseFloat(productCompDto.getNightMass());
        this.dayMassSV = Float.parseFloat(productCompDto.getDayMass());
        this.nightMassSV = Float.parseFloat(productCompDto.getNightMassSV());
        this.dayMassWater = Float.parseFloat(productCompDto.getDayMassWater());
        this.nightMassWater = Float.parseFloat(productCompDto.getNightMassWater());
        this.metanDay = Float.parseFloat(productCompDto.getMetanDay());
        this.metanNight = Float.parseFloat(productCompDto.getMetanNight());
     //   this.uniqueId_Product = Integer.parseInt(productCompDto.getUniqueId_Product());

        this.allDayEntity = allDayEntity;
    }


    public ProductComputationlyEntity() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public float getDayMass() {
        return dayMass;
    }

    public void setDayMass(float dayMass) {
        this.dayMass = dayMass;
    }

    public float getNightMass() {
        return nightMass;
    }

    public void setNightMass(float nightMass) {
        this.nightMass = nightMass;
    }

    public float getDayMassSV() {
        return dayMassSV;
    }

    public void setDayMassSV(float dayMassSV) {
        this.dayMassSV = dayMassSV;
    }

    public float getNightMassSV() {
        return nightMassSV;
    }

    public void setNightMassSV(float nightMassSV) {
        this.nightMassSV = nightMassSV;
    }

    public float getDayMassWater() {
        return dayMassWater;
    }

    public void setDayMassWater(float dayMassWater) {
        this.dayMassWater = dayMassWater;
    }

    public float getNightMassWater() {
        return nightMassWater;
    }

    public void setNightMassWater(float nightMassWater) {
        this.nightMassWater = nightMassWater;
    }

    public float getMetanDay() {
        return metanDay;
    }

    public void setMetanDay(float metanDay) {
        this.metanDay = metanDay;
    }

    public float getMetanNight() {
        return metanNight;
    }

    public void setMetanNight(float metanNight) {
        this.metanNight = metanNight;
    }

    public int getUniqueId_Product() {
        return uniqueId_Product;
    }

    public void setUniqueId_Product(int uniqueId_Product) {
        this.uniqueId_Product = uniqueId_Product;
    }



    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }
}
