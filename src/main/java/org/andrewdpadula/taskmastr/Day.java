package org.andrewdpadula.taskmastr;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Day {
	@Id
	@GeneratedValue
	private long dayId;
	private String dayName;
	private boolean isAWeekday;
	private String dayImage;
	private String dayNotes;

	@OneToMany(mappedBy = "day")
	private Collection<Timeslot> timeslots;

	@OneToMany(mappedBy = "day")
	private Collection<Task> tasks;

	public Day() {

	}

	public Day(String dayName, boolean isAWeekday, String dayImage, String dayNotes) {
		this.dayName = dayName;
		this.isAWeekday = isAWeekday;
		this.dayImage = dayImage;
		this.dayNotes = dayNotes;
	}

	public long getDayId() {
		return dayId;
	}

	public void setDayId(long dayId) {
		this.dayId = dayId;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public boolean isAWeekday() {
		return isAWeekday;
	}

	public void setAWeekday(boolean isAWeekday) {
		this.isAWeekday = isAWeekday;
	}

	public String getDayImage() {
		return dayImage;
	}

	public void setDayImage(String dayImage) {
		this.dayImage = dayImage;
	}

	public String getDayNotes() {
		return dayNotes;
	}

	public void setDayNotes(String dayNotes) {
		this.dayNotes = dayNotes;
	}

	@Override
	public String toString() {
		return "Day: " + dayName;
	}
}
