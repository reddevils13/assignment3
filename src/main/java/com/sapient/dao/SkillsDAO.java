package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class SkillsDAO {
	public boolean insertSkills(Skills skills) throws Exception {

		Connection connection = Connectivity.getConnection();

		String query = "Insert into student values(?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1,skills.getSkillId());
		preparedStatement.setString(2, skills.getSkillName());

		preparedStatement.executeUpdate();
		return true;
	}
}
