package com.project.citycontrol.api.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "cities")
public class Cities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	
	@Column(name = "ibge_id")
	@JsonProperty("ibge_id")
	private String ibgeId;
	
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "capital")
	private Boolean capital;
	
	@Column(name = "lon")
	private String lon;
	
	@Column(name = "lat")
	private String lat;
	
	@JsonProperty("no_accents")
	@Column(name = "no_accents")
	private String noAccents;
	
	@JsonProperty("alternative_names")
	@Column(name = "alternative_names")
	private String alternativeNames;
	
	@Column(name = "microregion")
	private String microregion;
	
	@Column(name = "mesoregion")
	private String mesoregion;

	public String getIbgeId() {
		return ibgeId;
	}

	public void setIbgeId(String ibgeId) {
		this.ibgeId = ibgeId;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getCapital() {
		return capital;
	}

	public void setCapital(Boolean capital) {
		this.capital = capital;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getNoAccents() {
		return noAccents;
	}

	public void setNoAccents(String noAccents) {
		this.noAccents = noAccents;
	}

	public String getAlternativeNames() {
		return alternativeNames;
	}

	public void setAlternativeNames(String alternativeNames) {
		this.alternativeNames = alternativeNames;
	}

	public String getMicroregion() {
		return microregion;
	}

	public void setMicroregion(String microregion) {
		this.microregion = microregion;
	}

	public String getMesoregion() {
		return mesoregion;
	}

	public void setMesoregion(String mesoregion) {
		this.mesoregion = mesoregion;
	}

	public UUID getUuid() {
		return uuid;
	}

	@Override
	public String toString() {
		return "CsvCities [uuid=" + uuid + ", ibgeId=" + ibgeId + ", uf=" + uf + ", name=" + name + ", capital="
				+ capital + ", lon=" + lon + ", lat=" + lat + ", noAccents=" + noAccents + ", alternativeNames="
				+ alternativeNames + ", microregion=" + microregion + ", mesoregion=" + mesoregion + "]";
	}
	
	
}
