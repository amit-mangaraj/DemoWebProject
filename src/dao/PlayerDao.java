package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.MyConnection;
import model.PlayerModel;

public class PlayerDao {
	public boolean insertPlayer(PlayerModel p) throws Exception {

		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("insert into Player values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayer_id());
		ps.setString(2, p.getPname());
		ps.setString(3, p.getSkills());
		ps.setDate(4, p.getDateofBirth());
		ps.setInt(5, p.getRuns());
		ps.setInt(6, p.getWickets());
		ps.setInt(7, p.getNoOfMatches());
		ps.setString(8, p.getNationality());
		ps.setInt(9,p.getTeamid());

		return ps.execute();
	}
	
}
