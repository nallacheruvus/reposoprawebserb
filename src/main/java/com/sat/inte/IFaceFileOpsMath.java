package com.sat.inte;

import java.io.IOException;

import javax.jws.*;

/***
 * This is a web service which allows users to perform file ops of certain types
 * namely writing logs,writing sqrts,writing custom strings
 * and reading the files that we have written
 * @author Satish
 *
 */
@WebService
public interface IFaceFileOpsMath {
	@WebMethod
	public String wrtLogs();
	@WebMethod
	public String wrtSqrts();
	@WebMethod
	public String wrtCustStr(String cont,String fname);
	@WebMethod
	public String readFi()  throws IOException;
}
