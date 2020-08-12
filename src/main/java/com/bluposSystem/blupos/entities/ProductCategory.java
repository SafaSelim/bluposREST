package com.bluposSystem.blupos.entities;

import javax.persistence.*;

@Entity
@Table(name="product_category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROD_CAT_ID")
    private int prodCatId;

    @Column(name = "PROD_CAT_NAME")
    private String prodCatName;

    @Column(name = "DESC")
    private String desc;

    public ProductCategory(ProductCategory prodCat) {
        this.prodCatId = prodCat.prodCatId;
        this.prodCatName = prodCat.prodCatName;
        this.desc = prodCat.desc;
    }

    public ProductCategory() {

    }

    public int getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(int prodCatId) {
        this.prodCatId = prodCatId;
    }

    public String getProdCatName() {
        return prodCatName;
    }

    public void setProdCatName(String prodCatName) {
        this.prodCatName = prodCatName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
