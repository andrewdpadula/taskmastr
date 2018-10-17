package org.andrewdpadula.taskmastr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private Long taskId;
	private String taskName;
	private String taskNotes;
	
	@ManyToOne
	@JsonIgnore
	private Day day;
	@ManyToOne
	@JsonIgnore
	private Timeslot timeslot;

	public Task(String taskName, String taskNotes) {
		this.taskName = taskName;
		this.taskNotes = taskNotes;
	}

	public Task() {

	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskNotes() {
		return taskNotes;
	}

	public void setTaskNotes(String taskNotes) {
		this.taskNotes = taskNotes;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Timeslot getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(Timeslot timeslot) {
		this.timeslot = timeslot;
	}
}
