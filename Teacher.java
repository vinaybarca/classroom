import java.io.*;
import java.util.ArrayList;
import java.util.*;


public class Teacher extends Classroom{
	private String tname;

	public Teacher(String tname){

		this.tname = tname;

	}
	public String getname(){
		return this.tname;
	}
	public void setname(String names){
		this.tname = names;
	}
public String toString() { 
        return this.tname; 
    }
	


}