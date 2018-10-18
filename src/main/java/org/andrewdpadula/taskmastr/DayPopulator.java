package org.andrewdpadula.taskmastr;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DayPopulator implements CommandLineRunner {
	@Resource
	private DayRepository dayRepo;
	@Resource
	private TimeslotRepository timeslotRepo;
	@Resource
	private TaskRepository taskRepo;

	public DayPopulator() {

	}

	@Override
	public void run(String... args) throws Exception {
		Day monday = dayRepo.save(new Day("Monday", true, null, "I hate Mondays!"));
		Day tuesday = dayRepo.save(new Day("Tuesday", true, null, "I also hate Tuesdays!"));
		Day wednesday = dayRepo.save(new Day("Wednesday", true, null, "It's hump day!"));
		Day thursday = dayRepo.save(new Day("Thursday", true, null, "Thursday."));
		Day friday = dayRepo.save(new Day("Friday", true, null, "The week ends at last."));
		Day saturday = dayRepo.save(new Day("Saturday", true, null, "Alright for fightin'."));
		Day sunday = dayRepo.save(new Day("Sunday", true, null, "Day seven."));
	}

}
