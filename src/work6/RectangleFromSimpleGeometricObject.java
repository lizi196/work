package work6;

public class RectangleFromSimpleGeometricObject 
	extends SimpleGeometricObject {
	 private double width;
	 private double height;
	 
	 public RectangleFromSimpleGeometricObject() {
	 }
	 
	 public RectangleFromSimpleGeometricObject(
		double width, double height) {
		this.width=width;
		this.height = height;
		}
	 public RectangleFromSimpleGeometricObject(
		double width, double height, String color, boolean filled) {
		this.width = width;
		this.height=height;
		setColor(color);
		setFilled(filled);
	 }
	 
	 /* Return width */
	 public double getWidthf(){
		 return width;
	 }
	 
	 /* Set a new width */
	 public void setWidth(double width) {
		 this.width = width;
	 }
	 
	 /* Return height*/
	 public double getHeight() {
		 return height;
	 }
	 
	 /**Return area */
	 public double getArea() {
		 return width *height;
	 }
	 
	  /** Return perimeter */
	 public double getPerimeter() {
	 return 2 *(width + height);
	 }
	 




	

}
