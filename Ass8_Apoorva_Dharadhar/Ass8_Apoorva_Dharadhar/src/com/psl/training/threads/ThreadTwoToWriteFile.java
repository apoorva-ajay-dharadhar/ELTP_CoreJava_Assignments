package com.psl.training.threads;

public class ThreadTwoToWriteFile extends Thread{
	WritingToFile fw=new WritingToFile();
	//PrintValOnConsole pv=new PrintValOnConsole();
	ThreadTwoToWriteFile(WritingToFile fw)
	{
		this.fw=fw;
	}
	public void run()
	{
		fw.WriteTo();
	}
	
	/*ThreadTwoToWriteFile(PrintValOnConsole pv)
	{
		this.pv=pv;
	}
	public void run()
	{
		pv.printTable(100);
	}*/
}
