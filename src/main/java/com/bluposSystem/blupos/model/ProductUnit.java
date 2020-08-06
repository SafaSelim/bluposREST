package com.bluposSystem.blupos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int unitId;

    private String unitName;

    public ProductUnit(ProductUnit prodUnit) {
        this.unitId = prodUnit.unitId;
        this.unitName = prodUnit.unitName;
    }

    public ProductUnit() {

    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
