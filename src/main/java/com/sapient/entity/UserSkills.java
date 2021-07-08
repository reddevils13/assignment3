package com.sapient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_skills")
public class UserSkills {
	@Column(name="user_id")
	private int userId;
	@Column(name="skill_id")
	private int skillID;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSkillID() {
		return skillID;
	}
	public void setSkillID(int skillID) {
		this.skillID = skillID;
	}
	@Override
	public String toString() {
		return "UserSkills [userId=" + userId + ", skillID=" + skillID + "]";
	}
	
}
