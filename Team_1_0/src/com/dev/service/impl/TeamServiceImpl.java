package com.dev.service.impl;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.dao.PlayerDAO;
import com.dev.dao.TeamDAO;
import com.dev.model.Player;
import com.dev.model.Team;
import com.dev.service.TeamService;

public class TeamServiceImpl implements TeamService {

	private TeamDAO teamDAO;
	private PlayerDAO playerDAO;
	private Team team;
	
	public TeamDAO getTeamDAO() {
		
		return teamDAO;
	}
	
//	public void setTeamDAO(TeamDAO teamDAO) {
//		this.teamDAO = teamDAO;
//	}
	
	public PlayerDAO getPlayerDAO() {
		return playerDAO;
	}
	
//	public void setPlayerDAO(PlayerDAO playerDAO) {
//		this.playerDAO = playerDAO;
//	}

	public void addPlayersToTeam(List<Player> playerList) throws Exception{
		try(ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("spring-config.xml")) {
			TeamDAO teamdao = (TeamDAO)context.getBean("teamDAOProxy");
			teamdao.insert(getTeam());
			PlayerDAO playerdao = (PlayerDAO)context.getBean("playerDAOProxy");
			//teamdao.insert(getTeam());
			System.out.println(team.getName());
			playerdao.insert(playerList.get(0));
			throw new Exception("thrown exception from team service....!!");
		}
		//add players to the team
	}
	
	
	
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public Team getTeam() {
		return team;
	}
}
