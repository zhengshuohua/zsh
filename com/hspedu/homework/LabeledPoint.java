package com.hspedu.homework;

public class LabeledPoint extends point{
   private String label;

public LabeledPoint( String label,double x, double y) {
	super(x, y);
	this.label = label;
}
   
}
