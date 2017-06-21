package fr.insalyon.creatis.vip.java_client_data.test;

import fr.insalyon.creatis.vip.java_client_data.api.DefaultApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.insalyon.creatis.vip.java_client_data.ApiClient;;

public class TestData {
	private static Logger logger = LoggerFactory.getLogger(TestData.class);

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ApiClient testAPiclient = new ApiClient();
		testAPiclient.setBasePath("http://vip.creatis.insa-lyon.fr/vip-portal-1.21/rest");
		testAPiclient.setApiKey("8l01stauurr4dv72ahnfpncj2o");
		
		DefaultApi newDapi = new DefaultApi(testAPiclient);
		
		logger.info("test URL /path/exists, method GET, action: print platform properties");
		logger.debug("result: {}",newDapi.doesPathExists("vip://vip.creatis.insa-lyon.fr/vip/Home"));
		logger.info("****************************************");
		
		logger.info("test URL /path/directory, method GET, action: print platform properties");
		logger.debug("result: {}",newDapi.listDirectory("vip://vip.creatis.insa-lyon.fr/vip/Home"));
		logger.info("****************************************");
		
		logger.info("test URL /path, method GET, action: print platform properties");
		logger.debug("result: {}",newDapi.getPath("vip://vip.creatis.insa-lyon.fr/vip/Home"));
		logger.info("****************************************");
				
		logger.info("test URL /path/directory, method POST, action: print platform properties");
		logger.debug("result: {}",newDapi.createPath("vip://vip.creatis.insa-lyon.fr/vip/Home/popo2/"));
		logger.info("****************************************");
		
		logger.info("test URL /path, method DELETE, action: print platform properties");
		newDapi.deletePath("vip://vip.creatis.insa-lyon.fr/vip/Home/popo2");
		logger.info("****************************************");
		
		logger.info("test URL /path/content, method GET, action: print platform properties");
		logger.debug("result: {}",newDapi.downloadFile("vip://vip.creatis.insa-lyon.fr/vip/Home/31-05-2017_16:19:28/output.txt"));
		logger.info("****************************************");
	}
}
