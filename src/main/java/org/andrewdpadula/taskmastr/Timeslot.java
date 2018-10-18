package org.andrewdpadula.taskmastr;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Timeslot {
	@Id
	@GeneratedValue
	private long timeslotId;
	private String timeslotName;
	@Lob
	private String timeslotNotes;

	@OneToMany(mappedBy = "timeslot")
	@JsonIgnore
	private Collection<Task> tasks;

	public Timeslot(String timeslotName, String timeslotNotes, Collection<Task> tasks) {
		this.timeslotName = timeslotName;
		this.timeslotNotes = timeslotNotes;
		this.tasks = tasks;
	}

	public Timeslot() {
	}

	@ManyToOne
	@JsonIgnore
	private Day day;

	public long getTimeslotId() {
		return timeslotId;
	}

	public String getTimeslotName() {
		return timeslotName;
	}

	public String getTimeslotNotes() {
		return timeslotNotes;
	}

	public Collection<Task> getTasks() {
		return tasks;
	}

	public Day getDay() {
		return day;
	}

	@Override
	public String toString() {
		return timeslotName;
	}

}
