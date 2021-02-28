package com.psl.training.threads;

public class ThreadOneToWriteFile extends Thread{
	WritingToFile fw=new WritingToFile();
	//PrintValOnConsole pv=new PrintValOnConsole();
	
	ThreadOneToWriteFile(WritingToFile fw)
	{
		this.fw=fw;
	}
	public void run(){  
		fw.WriteTo();
		}  
	/*ThreadOneToWriteFile(PrintValOnConsole pv)
	{
		this.pv=pv;
	}
	public void run()
	{
		pv.printTable(5);
	}*/

}
