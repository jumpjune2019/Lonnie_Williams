//Lonnie Williams
//Jump Training

import java.awt.*;
import java.io.*;
import java.util.Scanner;

// An enumeration of the colors of a traffic light.
enum TrafficLightColor {
	RED, GREEN, YELLOW
}

class TrafficLightSimulator implements Runnable {
	private Thread thrd; // bolds the thread that runs the simulation
	private TrafficLightColor tlc; // holds the current traffic light color
	boolean stop = false; // set to true to stop the simulation
	
	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;		
		thrd = new Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		thrd = new Thread(this);
		thrd.start();
		
	}
	
	// Starts up the light.
	public void run() {
		while(!stop) {
			try {
				switch(tlc) {
					case GREEN:
						System.out.println("The light is Green - Go!");
						Thread.sleep(5000); 
						break;
					case YELLOW:
						System.out.println("The light is Yellow - Beware!");
						Thread.sleep(2000); 
						break;
					case RED:
						System.out.println("The light is Red - Stop!");
						Thread.sleep(3000); 
						break;
				}
			} catch(InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	
	//Changes the color of the traffic light.
	synchronized void changeColor() {
		switch(tlc) {
			case RED:
				tlc = TrafficLightColor.GREEN;
				break;
			case YELLOW:
				tlc = TrafficLightColor.RED;
				break;
			case GREEN:
				tlc = TrafficLightColor.YELLOW;
		}
		notify(); 
	}
	
	// Waits until a light change occurs.
	synchronized void waitForChange() {
		try {
			wait(); 
		} catch(InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	// Returns current color.
	TrafficLightColor getColor() {
		return tlc;
	}
	
	// Stops the traffic light.
	void cancel() {
		stop = true;
	}
}
	
public class TrafficLight {
	//Main or base method of program
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Traffic Light Simulator is a Go!");
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		
		for(int i=0; i < 5; i++) {
			t1.waitForChange();
		}
		t1.cancel();
	}
  }