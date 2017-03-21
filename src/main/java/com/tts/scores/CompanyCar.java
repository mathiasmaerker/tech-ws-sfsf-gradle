package com.tts.scores;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CompanyCar {
	
	public enum CarColors{
		METALLIC_BLACK,
		METALLIC_SILVER,
		WHITE,
		RED
	}

	public enum CarStatus{
		DAMAGED,
		BEYOND_REPAIR,
		GOOD
		
	}

	
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String sfId;

    @Column
    private String vendor;
    
    @Column
    private String carType;
    
    @Enumerated
    private CarColors color;
    
    @Enumerated
    private CarStatus carStatus;
    

	public String getSfId() {
		return sfId;
	}

	public void setSfId(String sfId) {
		this.sfId = sfId;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public CarColors getColor() {
		return color;
	}

	public void setColor(CarColors color) {
		this.color = color;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public CarStatus getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(CarStatus carStatus) {
		this.carStatus = carStatus;
	}
}
