package com.sathya.productapp;

import java.sql.Date;

public class Product {
	private String proId;
	private String proName;
	private double proPrice;
	private String proBrand;
	private String proMadeIn;
	private Date proMfgDate;
	private Date proExpDate;
	private byte[] proImage;
	private byte[] proaudio;
	private byte[] provideo;
	
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProMadeIn() {
		return proMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		this.proMadeIn = proMadeIn;
	}
	public Date getProMfgDate() {
		return proMfgDate;
	}
	public void setProMfgDate(Date proMfgDate) {
		this.proMfgDate = proMfgDate;
	}
	public Date getProExpDate() {
		return proExpDate;
	}
	public void setProExpDate(Date proExpDate) {
		this.proExpDate = proExpDate;
	}
	public byte[] getProImage() {
		return proImage;
	}
	public void setProImage(byte[] proImage) {
		this.proImage = proImage;
	}
	
	public byte[] getProaudio() {
		return proaudio;
	}
	public void setProaudio(byte[] proaudio) {
		this.proaudio = proaudio;
	}
	public byte[] getProvideo() {
		return provideo;
	}
	public void setProvideo(byte[] provideo) {
		this.provideo = provideo;
	}
}
