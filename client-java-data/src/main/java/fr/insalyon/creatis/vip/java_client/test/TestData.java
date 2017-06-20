package fr.insalyon.creatis.vip.java_client.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.insalyon.creatis.vip.java_client.*;
import fr.insalyon.creatis.vip.java_client.api.*;
import fr.insalyon.creatis.vip.java_client.model.*;

public class TestData {
	private static Logger logger = LoggerFactory.getLogger(TestData.class);
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ApiClient testAPiclient = new ApiClient();
		testAPiclient.setBasePath("http://vip.creatis.insa-lyon.fr:4040/rest-test/rest");
		testAPiclient.setApiKey("8l01stauurr4dv72ahnfpncj2o");
		
		DefaultApi newDapi = new DefaultApi(testAPiclient);
		
		logger.info("test URL /path, method GET, action: print the path");
		logger.debug("result: {}",newDapi.getPath("vip://vip.creatis.insa-lyon.fr/vip/Home"));
		System.out.println("****************************************");
		
		logger.info("test URL /exists, method GET, action: print a boolean which say if it exists or not");
		logger.debug("result: {}",newDapi.doesPathExists("vip://vip.creatis.insa-lyon.fr/vip/Home"));
		System.out.println("****************************************");
		
		logger.info("test URL /directory, method GET, action: print list of the contained paths");
		logger.debug("result: {}",newDapi.listDirectory("vip://vip.creatis.insa-lyon.fr/vip/Home"));
		System.out.println("****************************************");
		
		logger.info("test URL /directory, method POST, action: print the created path");
		logger.debug("result: {}",newDapi.createPath("vip://vip.creatis.insa-lyon.fr/vip/Home/123"));
		System.out.println("****************************************");
		
		logger.info("test URL /path, method DELETE, action: delete the path");
		newDapi.deletePath("vip://vip.creatis.insa-lyon.fr/vip/Home/123");
		System.out.println("****************************************");
		
		logger.info("test URL /content, method GET, action: print the downloaded file");
		logger.debug("result: {}",newDapi.downloadFile("vip://vip.creatis.insa-lyon.fr/vip/Home/31-05-2017_16:19:28/output.txt"));
		System.out.println("****************************************");
		
		logger.info("test URL /content, method PUT, action: print the uploaded path");
		UploadData data = new UploadData();
		data.setUri("vip://vip.creatis.insa-lyon.fr/vip/Home/popo");
		data.setPathContent("/home/alikari/test");
		logger.debug("result: {}",newDapi.uploadFile(data));
		System.out.println("****************************************");
	}

}
