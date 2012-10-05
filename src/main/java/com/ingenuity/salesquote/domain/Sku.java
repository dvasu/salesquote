package com.ingenuity.salesquote.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
public class Sku {

    @NotNull
    @Column(unique = true)
    private String name;

    private BigDecimal price;

    private int term;

    @ManyToOne
    private Category category;
}
