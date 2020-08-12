package com.bluposSystem.blupos.entities;

import javax.persistence.*;

@Entity
@Table(name="product_unit")
public class ProductUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="UNIT_ID")
    private int unitId;

    @Column(name="UNIT_NAME")
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
