package com.psl.training.threads;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	PrintValOnConsole pv1=new PrintValOnConsole();
		
		WritingToFile writeFile=new WritingToFile();
		ThreadOneToWriteFile one=new ThreadOneToWriteFile(writeFile);
		ThreadTwoToWriteFile two=new ThreadTwoToWriteFile(writeFile);
	/*	ThreadOneToWriteFile one=new ThreadOneToWriteFile(pv1);
		ThreadTwoToWriteFile two=new ThreadTwoToWriteFile(pv1);*/
		one.start();
		two.start();
		
	}

}
