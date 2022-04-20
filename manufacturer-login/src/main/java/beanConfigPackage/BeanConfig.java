package beanConfigPackage;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan(basePackages={
	"connection",
	"dao",
	"dao.impl"
})
public class BeanConfig {
	
	  @Bean public DataSource dataSource() { 
		  System.out.println("=============== dataSource: ApplicationConfiguration =======================");
	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	  dataSource.setUrl("jdbc:mysql://localhost:3306/manufacturer");
	  dataSource.setUsername("Admin");
	  dataSource.setPassword("Admin");
	  return dataSource; 
	  }
	  
	  @Bean public JdbcTemplate jdbcTemplate(DataSource dataSource) { return new
	  JdbcTemplate(dataSource); }
	 
	
}
