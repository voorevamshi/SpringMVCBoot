package com.vmc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="COUNTRIES")
public class Country implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3930298322076833514L;
	@Id
    @GeneratedValue
    @Column(name="COUNTRYNO")
    private Integer countryNo;
    @Column(name="COUNTRY")
    @NotEmpty(message="Country name is mandatory")
    private String countryName;

    

    public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Integer getCountryNo() {
        return countryNo;
    }
    public void setCountryNo(Integer countryNo) {
        this.countryNo = countryNo;
    }
}
