package de.egladil.winkel.core;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RawMeterMeasure {

	@JsonProperty
	private String country;

	@JsonProperty
	private String siteName;

	@JsonProperty
	private String buType;

	@JsonProperty
	private String buCode;

	@JsonProperty
	private Date readingTime;

	@JsonProperty
	private String rawMeterName;

	@JsonProperty
	private String rawMeterShort;

	@JsonProperty
	private BigDecimal rawMeterValue;

	@JsonProperty
	private String rawMeterUnit;

	public RawMeterMeasure(String country, String siteName, String buType, String buCode, Date readingTime,
			String rawMeterName, String rawMeterShort, BigDecimal rawMeterValue, String rawMeterUnit) {
		super();
		this.country = country;
		this.siteName = siteName;
		this.buType = buType;
		this.buCode = buCode;
		this.readingTime = readingTime;
		this.rawMeterName = rawMeterName;
		this.rawMeterShort = rawMeterShort;
		this.rawMeterValue = rawMeterValue;
		this.rawMeterUnit = rawMeterUnit;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getBuType() {
		return buType;
	}

	public void setBuType(String buType) {
		this.buType = buType;
	}

	public String getBuCode() {
		return buCode;
	}

	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}

	public Date getReadingTime() {
		return readingTime;
	}

	public void setReadingTime(Date readingTime) {
		this.readingTime = readingTime;
	}

	public String getRawMeterName() {
		return rawMeterName;
	}

	public void setRawMeterName(String rawMeterName) {
		this.rawMeterName = rawMeterName;
	}

	public String getRawMeterShort() {
		return rawMeterShort;
	}

	public void setRawMeterShort(String rawMeterShort) {
		this.rawMeterShort = rawMeterShort;
	}

	public BigDecimal getRawMeterValue() {
		return rawMeterValue;
	}

	public void setRawMeterValue(BigDecimal rawMeterValue) {
		this.rawMeterValue = rawMeterValue;
	}

	public String getRawMeterUnit() {
		return rawMeterUnit;
	}

	public void setRawMeterUnit(String rawMeterUnit) {
		this.rawMeterUnit = rawMeterUnit;
	}

}
