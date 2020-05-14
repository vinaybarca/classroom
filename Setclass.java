import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Setclass{
	public static void main(String[] args){
		Teacher phipps = new Teacher("Phipps");
		List<Students> roster = new ArrayList<Students>();
		roster.add(new Students("jon"));
		roster.add(new Students("ben"));

	/*	List<Classroom> aphy112 = new ArrayList<Classroom>();
		aphy112.add(new Classroom("aphy112", phipps, roster)); */
System.out.print(roster);


	}
}