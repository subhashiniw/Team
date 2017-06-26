package com.dev.service;


import java.util.List;

import com.dev.dao.PlayerDAO;
import com.dev.dao.TeamDAO;
import com.dev.model.Player;
import com.dev.model.Team;

public class TeamService {

	private TeamDAO teamDAO;
	private PlayerDAO playerDAO;
	private Team team;
	
	public TeamDAO getTeamDAO() {
		return teamDAO;
	}
	
	public PlayerDAO getPlayerDAO() {
		return playerDAO;
	}
	
	public void addPlayersToTeam(List<Player> playerList) {
		//insert players
		//create team
		//add players to the team
	}
	
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public Team getTeam() {
		return team;
	}
}
