package com.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helpers.QRCodeGenerator;


@Controller
public class ProductController {
	

	@RequestMapping(value = "qrcode/{id}",method = RequestMethod.GET)
	public 	void qrcode(@PathVariable("id") String id,HttpServletResponse response)
	throws Exception{
		response.setContentType("image/png");
		OutputStream outputStream=response.getOutputStream();
		outputStream.write(QRCodeGenerator.generateQRCodeImage(id, 500, 500));
		outputStream.flush();
		outputStream.close();
		 
	}
	
	@RequestMapping(value = "barcode/{id}",method = RequestMethod.GET)
	public void barcode(@PathVariable("id") String id,HttpServletResponse response)
	throws Exception{
		response.setContentType("image/png");
		OutputStream outputStream=response.getOutputStream();
		outputStream.write(QRCodeGenerator.generateBarCodeImage(id, 500, 500));
		outputStream.flush();
		outputStream.close();
		 
	}
	
	

}
