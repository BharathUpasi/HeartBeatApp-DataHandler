//just for debug
//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//LocalDateTime now = LocalDateTime.now();
//System.out.println(dtf.format(now));
//////////////////////////////////////////////////////////////
//now = LocalDateTime.now();
//System.out.println(dtf.format(now));
/////////////////////////////////////////
package com.herbeat.api;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class HerBeatApp 
{
	
	static Logger logger = Logger.getLogger(HerBeatApp.class);
	
	public static void main(String[] args) 
	{
		try
		{
			ExecutorService threadPool = Executors.newFixedThreadPool(90);
			ArrayList<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
			
			ThreadDispatcher dispatcher = new ThreadDispatcher(threadPool);
			listOfLists = dispatcher.dispatchWork();
			
			threadPool.shutdown();
			try 
			{
				threadPool.awaitTermination(50000000, TimeUnit.MILLISECONDS);
				
			} 
			catch (InterruptedException e) 
			{
				logger.error("Exception while waiting for threads!", e);
			}
			
			if(threadPool.isTerminated())
			{
				(new MoveProcessedFiles(listOfLists)).moveFiles();
			}
			logger.info("Done.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//logger.error(e);
		}

	}

}
