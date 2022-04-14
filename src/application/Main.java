package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.DefaultEditorKit.CopyAction;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Main {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDoubles = Arrays.asList(3.14,6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts,myObjs);
		printList(myObjs);
		copy(myDoubles,myObjs);
		printList(myObjs);
		
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> target) {
		for (Number number : source) {
			target.add(number);
		}		
	}
	
	public static void printList(List<?> list) {
		for (Object object : list) {
			System.out.print(object + ",");
		}
		System.out.println("");
	}
}