package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.MyConnection;
import model.PlayerModel;
import model.TeamModel;

public class TeamDao {
	public boolean insertTeam(TeamModel t) throws Exception {

		Connection mc=MyConnection.getConnection(); 
		PreparedStatement ps=mc.prepareStatement("insert into Team values(?,?,?,?)");
		ps.setInt(1, t.getTeam_id());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnername());
		ps.setString(4, t.getCoachname());
		return ps.execute();
	}
}
