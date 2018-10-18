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
	@Lob
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

	public String getTaskNotes() {
		return taskNotes;
	}

	public Day getDay() {
		return day;
	}

	public Timeslot getTimeslot() {
		return timeslot;
	}

	@Override
	public String toString() {
		return taskName;
	}

}
