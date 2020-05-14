import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Students extends Classroom{
	private String names;

	public Students(String names){
		this.names = names;

	}

public String getname(){
		return this.names;
	}
	public void setname(String name){
		this.names = name;
	}
	public String toString() { 
        return this.names; 
    }


}