package com.c4labz.pakkuman2.stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {

	int[][] mapArray;
	int[][] defaultMapArray ={
			{1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1},
			};
	
	public Map(int level){
//		readLevel(level);
//		checkMapSize();
//		checkMapCoherence();
		mapArray = defaultMapArray;
		load();
	}
	
	private void readLevel(int level) {
		
		String mapLocation = "./assets/level-"+level+".map";
		File file = new File(mapLocation);
		
		readFile(file);
		
		
		
		
	}

	private char[][] readFile(File file) {
		
		int line = 0;
		int column = 0;
		String wholeMap[];
		ArrayList<String> tempLevel = null;
		char[][] level;
		
		try{
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNextLine()){
				tempLevel.add(scanner.nextLine());
				tempLevel.toArray();
			}
			
		} catch (Exception e){}
		
		
		return level;
	}

	public Map(){
		this(1);
	}

	private void load(){
		for(int x=0; x<mapArray.length;x++){
			for(int y=0; y<mapArray[x].length;x++){
				switch(mapArray[x][y]){
				case 0:{
					
				}
				case 1:{
					
				}
				case 2:{
					
				}
				case 3:{
					
				}
				}
			}
		}
	}

	private void checkMapCoherence() {
		// TODO Auto-generated method stub
		
	}

	private void checkMapSize() {
		// TODO Auto-generated method stub
		
	}
}
