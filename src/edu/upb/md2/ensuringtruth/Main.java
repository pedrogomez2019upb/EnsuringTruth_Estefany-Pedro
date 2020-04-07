package edu.upb.md2.ensuringtruth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int casos=0;
	    String evaluar="";
	    casos = sc.nextInt();
	    for (int i=0 ; i<casos;i++){
	        evaluar=sc.nextLine();
			System.out.println(evaluar);
        }
    }
}
