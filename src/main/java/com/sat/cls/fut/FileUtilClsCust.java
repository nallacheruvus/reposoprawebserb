package com.sat.cls.fut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class FileUtilClsCust {

	private final String  paths="c:\\delhiofficefiles\\soprasteria\\";
	
	public String wrtLogs() {
		Calendar cal=Calendar.getInstance();
		String dt=String.valueOf(cal.getTime().getSeconds());
		String logs="";
		String status="Not Done";
		for(int i=0;i<1000;i++){
			logs+="Log("+(i+1)+")="+Math.log(i+1)+";";
		}
		try {
			wrt(paths+dt+"LogsFile.txt",logs );
			status="Done";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public String wrtSqrts() {
		Calendar cal=Calendar.getInstance();
		String dt=String.valueOf(cal.getTime().getSeconds());
		String logs="";
		String status="Not Done";
		for(int i=0;i<1000;i++){
			logs+="Sqrt("+(i+1)+")="+Math.sqrt(i+1)+";";
		}
		try {
			wrt(paths+dt+"SqrtsFile.txt",logs );
			status="Done";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public String wrtCustStr(String fname,String b) {
		String logs="";
		String status="Not Done";
		try {
			wrt(paths+fname,b );
			status="Done";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	
	private void wrt(String paths,String j) throws IOException {
		File f=new File(paths);
		FileOutputStream fos=new FileOutputStream(f);
		fos.write(j.getBytes());
		fos.flush();
		fos.close();
	}
	
	
	public String readFi() throws IOException {
		File f=new File(paths+"50LogsFile.txt");
		FileInputStream fis=new FileInputStream(f);
		String cont="";
		int i=0;
		while((i=fis.read())!=-1) {
			cont+=(char)i;
		}
		fis.close();
		return cont;
	}
	
	
}
