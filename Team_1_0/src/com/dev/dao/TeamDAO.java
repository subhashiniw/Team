package com.dev.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.dev.model.Team;

public class TeamDAO extends JdbcDaoSupport implements TeamDAOInt{

	public void insert(Team team) {
		String sqlStmt = "INSERT INTO TEAM (ID, NAME) VALUES(?,?)";
		getJdbcTemplate().update(sqlStmt, new Object[]{team.getId(), team.getName()});
	}
}
