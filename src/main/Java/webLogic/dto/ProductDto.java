package webLogic.dto;

import java.io.Serializable;

/**
 * Created by yansolo on 16.08.2018.
 */
public class ProductDto implements Serializable {

    private String uniqueProd_id;
    private String name;
    private String coffSV;
    private String coffWater;
    private String coffMetana;
    private String valueGas;


    public String getUniqueProd_id() {
        return uniqueProd_id;
    }

    public void setUniqueProd_id(String uniqueProd_id) {
        this.uniqueProd_id = uniqueProd_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffSV() {
        return coffSV;
    }

    public void setCoffSV(String coffSV) {
        this.coffSV = coffSV;
    }

    public String getCoffWater() {
        return coffWater;
    }

    public void setCoffWater(String coffWater) {
        this.coffWater = coffWater;
    }

    public String getCoffMetana() {
        return coffMetana;
    }

    public void setCoffMetana(String coffMetana) {
        this.coffMetana = coffMetana;
    }

    public String getValueGas() {
        return valueGas;
    }

    public void setValueGas(String valueGas) {
        this.valueGas = valueGas;
    }
}
