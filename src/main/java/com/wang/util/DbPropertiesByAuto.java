package com.wang.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * @author wanghe
 *
 */
@Component
public class DbPropertiesByAuto {
	
	@Value("${all.datasource.maxActive}")
	public  int maxActive;
	
	@Value("${oracle.datasource.url}")
	public  String oracleurl;
	
	@Value("${oracle.datasource.username}")
	public  String oracleusername;
	
	@Value("${oracle.datasource.password}")
	public  String oraclepwd;
	
	@Value("${oracle.datasource.driver}")
	public  String oracledirver;
	

}
