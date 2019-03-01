package foo;
import javax.servlet.http.*;
import java.io.*;

public class Person {
	private String name;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}