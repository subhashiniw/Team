package com.dev.dao;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.dev.model.Player;

public class PlayerDAO extends JdbcDaoSupport{

	public void insert(Player player) throws Exception{
		String sqlStmt = "INSERT INTO PLAYER (ID, NAME, DOB, AGE) VALUES(?,?,?,?)";
		if (player.getDob() == null) {
			throw new Exception("Date of birth is not provided");
		}
		int age = Period.between(player.getDob(), LocalDate.now()).getYears();
		getJdbcTemplate().update(sqlStmt, new Object[]{player.getId(), player.getName(), player.getDob(), age});
	}
}
