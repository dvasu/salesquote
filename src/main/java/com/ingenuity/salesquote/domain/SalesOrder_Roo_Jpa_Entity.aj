// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ingenuity.salesquote.domain;

import com.ingenuity.salesquote.domain.SalesOrder;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect SalesOrder_Roo_Jpa_Entity {
    
    declare @type: SalesOrder: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long SalesOrder.id;
    
    @Version
    @Column(name = "version")
    private Integer SalesOrder.version;
    
    public Long SalesOrder.getId() {
        return this.id;
    }
    
    public void SalesOrder.setId(Long id) {
        this.id = id;
    }
    
    public Integer SalesOrder.getVersion() {
        return this.version;
    }
    
    public void SalesOrder.setVersion(Integer version) {
        this.version = version;
    }
    
}
