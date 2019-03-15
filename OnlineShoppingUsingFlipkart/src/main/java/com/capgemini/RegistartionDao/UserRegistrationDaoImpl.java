package com.capgemini.RegistartionDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.capgemini.RegistartionDao.UserRegistrationDao.UserDao;
import com.capgemini.controllers.LoginController;
import com.capgemini.pojoclasses.LoginPojo;
import com.capgemini.pojoclasses.RegistrationPojo;

public class UserRegistrationDaoImpl {

	
	@Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  public void register(RegistrationPojo userRegister) {
	    String sql = "insert into UserRegistrations values(?,?,?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { userRegister.getUsername(), userRegister.getPassword(), userRegister.getFirstname(),
	    		userRegister.getLastname(), userRegister.getEmail(), userRegister.getAddress(), userRegister.getPhone() });
	    }
	    public RegistrationPojo validateUser(LoginPojo login) {
	    String sql = "select * from UserRegistrations where username='" + login.getEmail() + "' and password='" + login.getPassword()
	    + "'";
	    List<RegistrationPojo> userRegister = jdbcTemplate.query(sql, new UserMapper());
	    return (RegistrationPojo) (userRegister.size() > 0 ? userRegister.get(0) : null);
	    }
	  }
	  class UserMapper implements RowMapper<RegistrationPojo> {
	  public RegistrationPojo mapRow(ResultSet rs, int arg1) throws SQLException {
		  RegistrationPojo userRegister = new RegistrationPojo();
		  userRegister.setUsername(rs.getString("username"));
		  userRegister.setPassword(rs.getString("password"));
		  userRegister.setFirstname(rs.getString("firstname"));
		  userRegister.setLastname(rs.getString("lastname"));
		  userRegister.setEmail(rs.getString("email"));
		  userRegister.setAddress(rs.getString("address"));
		  userRegister.setPhone(rs.getInt("phone"));
	    return userRegister;
	  }
	}

