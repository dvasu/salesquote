// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ingenuity.salesquote.domain;

import com.ingenuity.salesquote.domain.Quote;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Quote_Roo_Jpa_Entity {
    
    declare @type: Quote: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Quote.id;
    
    @Version
    @Column(name = "version")
    private Integer Quote.version;
    
    public Long Quote.getId() {
        return this.id;
    }
    
    public void Quote.setId(Long id) {
        this.id = id;
    }
    
    public Integer Quote.getVersion() {
        return this.version;
    }
    
    public void Quote.setVersion(Integer version) {
        this.version = version;
    }
    
}
