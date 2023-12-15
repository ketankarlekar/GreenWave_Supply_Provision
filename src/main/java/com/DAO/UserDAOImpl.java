package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDAOImpl implements UserDAO {
	private Connection conn;

	public UserDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean userRegister(User us) {

		boolean f = false;
		try {
			String sql = "Insert into user(fname, lname, email, password) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, us.getFname());
			ps.setString(2, us.getLname());
			ps.setString(3, us.getEmail());
			ps.setString(4, us.getPassword());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return f;
	}

	@Override
	public User login(String email, String password) {

		User us = null;

		boolean f = false;
		try {
			String sql = "Select * from user where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				us = new User();
				us.setId(rs.getInt(1));
				us.setFname(rs.getString(2));
				us.setLname(rs.getString(3));
				us.setEmail(rs.getString(4));
				us.setPassword(rs.getString(5));
				


			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		return us;

	}

}
