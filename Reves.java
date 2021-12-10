package com.texto;


public class Reves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringUsed = "Hola este es un texto";
		System.out.println(stringUsed);
		StringBuilder stringBuild = new StringBuilder(stringUsed);
		stringUsed = stringBuild.reverse().toString();
		System.out.println(stringUsed);
	}

}
