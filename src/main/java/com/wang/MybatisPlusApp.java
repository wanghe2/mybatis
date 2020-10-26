package com.wang;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisPlusApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(MybatisPlusApp.class, args);
    }
    
    public void fun(){
    	
      String sql=	new SQL() {{
    	    SELECT("P.ID, P.USERNAME, P.PASSWORD, P.FULL_NAME");
    	    SELECT("P.LAST_NAME, P.CREATED_ON, P.UPDATED_ON");
    	    FROM("PERSON P");
    	    FROM("ACCOUNT A");
    	    INNER_JOIN("DEPARTMENT D on D.ID = P.DEPARTMENT_ID");
    	    INNER_JOIN("COMPANY C on D.COMPANY_ID = C.ID");
    	    WHERE("P.ID = A.ID");
    	    WHERE("P.FIRST_NAME like ?");
    	    OR();
    	    WHERE("P.LAST_NAME like ?");
    	    GROUP_BY("P.ID");
    	    HAVING("P.LAST_NAME like ?");
    	    OR();
    	    HAVING("P.FIRST_NAME like ?");
    	    ORDER_BY("P.ID");
    	    ORDER_BY("P.FULL_NAME");
    	  }}.toString();
    	  /**
    	   * mybatis的sql语句构建器,辅助功能
    	   */
    	  sql.getBytes(); 
    }
}
