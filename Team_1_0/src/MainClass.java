import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.model.Player;
import com.dev.model.Team;
import com.dev.service.TeamService;


public class MainClass {
	//private final Logger logger 	   = Logger.getLogger(MainClass.class);
	public static void main(String[] args) {
		Team aTeam = new Team("T1", "A");
		Player player1 = new Player("P1", "x1", LocalDate.of(1990, 05, 05));
		Player player2 = new Player("P2", "x2", LocalDate.of(1990, 05, 05));
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(player1);
		playerList.add(player2);
		try (ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("spring-config.xml")) {
			TeamService teamService = (TeamService)context.getBean("teamServiceProxy");
			teamService.setTeam(aTeam);
			teamService.addPlayersToTeam(playerList);
//			teamService.addPlayersToTeam(playerList);
//			throw new Exception("thrown exception from team service....!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Team bTeam = new Team("T2", "B");
		
	}
	
}
