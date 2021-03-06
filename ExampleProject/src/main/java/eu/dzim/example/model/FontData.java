package eu.dzim.example.model;

import java.util.Locale;

import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FontData {
	
	private double size = 12;
	private FontWeight weight = FontWeight.NORMAL;
	private FontPosture posture = FontPosture.REGULAR;
	
	public FontData() {
		// sonar
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public FontWeight getWeight() {
		return weight;
	}
	
	public void setWeight(FontWeight weight) {
		this.weight = weight;
	}
	
	public FontPosture getPosture() {
		return posture;
	}
	
	public void setPosture(FontPosture posture) {
		this.posture = posture;
	}
	
	@Override
	public String toString() {
		return String.format(Locale.ROOT, "FontData[size=%.2f, weight=%s, posture=%s]", size, weight, posture);
	}
}
