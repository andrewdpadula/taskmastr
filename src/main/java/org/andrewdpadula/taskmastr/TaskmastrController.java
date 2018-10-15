package org.andrewdpadula.taskmastr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskmastrController {

	@Autowired
	public DayRepository dayRepo;

	@Autowired
	public TimeslotRepository timeslotRepo;
	
	@Autowired
	public TaskRepository taskRepo;

	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/days")
	public String getDays(Model model) {
		model.addAttribute("days", dayRepo.findAll());
		return "days";
	}

	@RequestMapping("/days/{dayName}")
	public String getDay(@PathVariable(name = "dayName") String dayName, Model model) {
		model.addAttribute("day", dayRepo.findByName(dayName));
		return "day";
	}

	@RequestMapping("/days/{dayName}/timeslots/{timeslotId}")
	public String getTimeslot(@PathVariable(name = "dayName") String dayName, 
			@PathVariable(name = "timeslotId") Long timeslotId, Model model) {
		model.addAttribute("timeslot", timeslotRepo.findOne(timeslotId));
		return "timeslot";
	}
	
	@RequestMapping("/days/{dayName}/timeslots/{timeslotId}/tasks/{taskId}")
	public String getTask(@PathVariable(name = "dayName") String dayName, 
			@PathVariable(name = "timeslotId") Long timeslotId, 
			@PathVariable(name = "taskId") Long taskId, Model model) {
		model.addAttribute("task", taskRepo.findOne(taskId));
		return "task";
	}
	
}
