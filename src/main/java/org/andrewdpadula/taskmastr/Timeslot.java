package org.andrewdpadula.taskmastr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Timeslot {
	@Id
	@GeneratedValue
	private long timeslotId;
}
