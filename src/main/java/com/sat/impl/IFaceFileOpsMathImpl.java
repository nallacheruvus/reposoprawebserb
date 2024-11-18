package com.sat.impl;

import com.sat.cls.fut.FileUtilClsCust;
import com.sat.inte.IFaceFileOpsMath;

import java.io.IOException;

import javax.jws.*;


@WebService(endpointInterface = "com.sat.inte.IFaceFileOpsMath")
public class IFaceFileOpsMathImpl implements IFaceFileOpsMath {
	FileUtilClsCust cust=new FileUtilClsCust();
	
	public String wrtLogs() {
		return cust.wrtLogs();
	}

	public String wrtSqrts() {
		return cust.wrtSqrts();
	}

	public String wrtCustStr(String cont, String fname) {
		return cust.wrtCustStr(fname,cont);
	}

	public String readFi() throws IOException {
		return cust.readFi();
	}
}
