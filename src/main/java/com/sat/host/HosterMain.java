package com.sat.host;

import javax.xml.ws.Endpoint;

import com.sat.impl.IFaceFileOpsMathImpl;

public class HosterMain {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:3343/ws/wrt", new IFaceFileOpsMathImpl());
		System.out.println("Wrt ops service is ready");
	}
}
