package com.dev.service;


import java.util.List;

import com.dev.dao.PlayerDAO;
import com.dev.dao.TeamDAO;
import com.dev.model.Player;
import com.dev.model.Team;

public interface TeamService {

	
	public TeamDAO getTeamDAO() ;
	
	public PlayerDAO getPlayerDAO() ;
	
	public void addPlayersToTeam(List<Player> playerList) throws Exception;
	public void setTeam(Team team) ;
	
	public Team getTeam() ;
}
