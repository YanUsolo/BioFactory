package webLogic.entity;

import org.apache.commons.codec.StringEncoder;
import webLogic.dto.ProductDto;

import javax.persistence.*;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;

/**
 * Created by yansolo on 16.08.2018.
 */
@Entity
@Table(name = "feedstock")
public class ProductEntity implements Serializable {

    @Id
    @Column(name = "feedstock_id",updatable = true,insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @Column(name = "feedstock_uniqueId")
    private int _uniqueId;

    @Column(name = "feedstock_name")
    private String _name;

    @Column(name = "feedstock_coeffDryMatter")
    private Float _coffSV;

    @Column(name = "feedstock_coeffWater")
    private float _coffWater;

    @Column(name = "feedstock_coeffMetana")
    private Float _coffMetana ;

    @Column(name = "feedstock_valueGas")
    private float _valueGas;



    public ProductEntity() {

    }

    public ProductEntity(int _uniqueId, String _name, float _coffSV, float _coffWater, float _coffMetana, float _valueGas) {
        this._uniqueId = _uniqueId;
        this._name = _name;
        this._coffSV = _coffSV;
        this._coffWater = _coffWater;
        this._coffMetana = _coffMetana;
        this._valueGas = _valueGas;
    }
    public ProductEntity(String uniqueProd_id, String name, String coffSV, String coffWater, String coffMetana, String valueGas) {
        this._uniqueId = Integer.parseInt(uniqueProd_id);
        this._name = name;
        this._coffSV = Float.parseFloat(coffSV);
        this._coffWater = Float.parseFloat(coffWater);
        this._coffMetana = Float.parseFloat(coffMetana);
        this._valueGas = Float.parseFloat(valueGas);
    }

    public ProductEntity(ProductDto productDto) throws Exception
    {
        this._uniqueId = Integer.parseInt(productDto.getUniqueProd_id());
       // this._name = productDto.getName();
       // this._name = new String(productDto.getName().getBytes("UTF-8"),"UTF-8");
        this._name = productDto.getName();
        this._coffSV = Float.parseFloat(productDto.getCoffSV());
        this._coffWater = Float.parseFloat(productDto.getCoffWater());
        this._coffMetana = Float.parseFloat(productDto.getCoffMetana());
        this._valueGas = Float.parseFloat(productDto.getValueGas());
    }

    public void resetProductEntity(ProductDto productDto) {
        this._uniqueId = Integer.parseInt(productDto.getUniqueProd_id());

        byte[] b = "Силос".getBytes(StandardCharsets.UTF_8);
        String s = new String(b, StandardCharsets.UTF_8);
        this._name =productDto.getName();
       // this._name =productDto.getName();
      //  this._name = s;
        this._coffSV = Float.parseFloat(productDto.getCoffSV());
        this._coffWater = Float.parseFloat(productDto.getCoffWater());
        this._coffMetana = Float.parseFloat(productDto.getCoffMetana());
        this._valueGas = Float.parseFloat(productDto.getValueGas());

    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public float get_coffSV() {
        return _coffSV;
    }

    public void set_coffSV(float _coffSV) {
        this._coffSV = _coffSV;
    }

    public float get_coffWater() {
        return _coffWater;
    }

    public void set_coffWater(float _coffWater) {
        this._coffWater = _coffWater;
    }

    public float get_coffMetana() {
        return _coffMetana;
    }

    public void set_coffMetana(float _coffMetana) {
        this._coffMetana = _coffMetana;
    }

    public float get_valueGas() {
        return _valueGas;
    }

    public void set_valueGas(float _valueGas) {
        this._valueGas = _valueGas;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "_id=" + _id +
                ", _uniqueId=" + _uniqueId +
                ", _name='" + _name + '\'' +
                ", _coffSV=" + _coffSV +
                ", _coffWater=" + _coffWater +
                ", _coffMetana=" + _coffMetana +
                ", _valueGas=" + _valueGas +
                '}';
    }

    public int get_uniqueId() {
        return _uniqueId;
    }

    public void set_uniqueId(int _uniqueId) {
        this._uniqueId = _uniqueId;
    }
}
