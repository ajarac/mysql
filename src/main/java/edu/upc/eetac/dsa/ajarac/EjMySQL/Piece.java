package edu.upc.eetac.dsa.ajarac.EjMySQL;

public class Piece {
	private String name;
	private int code;

	public Piece(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	public Piece (){
		this.name = "";
		this.code = 0;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
