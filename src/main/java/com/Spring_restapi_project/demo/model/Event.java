package com.Spring_restapi_project.demo.model;

import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Event")

public class Event{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private Long id;
	
	@Column(name = "event_type")
	private String eventType;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "no_Of_Attendance")
	private int noOfAttendance;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "time")
	private Time time;
	
	@Column(name = "Evnet_Price")
	private double evemtPrice;
	
	@Column(name = "total_Amount")
	private double totAmount;
	
	@ManyToOne
	private Event_Menu event_menu;
	
	
	@ManyToOne
	private Event_customer event_customer;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hall_id",referencedColumnName="hall_id")
    private Hall hall;
	
	
	
	@OneToMany(mappedBy="event")
	private List<StaffEvent> staffevents;



	public Event() {
		super();
	}



	public Event(long id, String eventType, String description, int noOfAttendance, String date, Time time,
			double evemtPrice, double totAmount, Event_Menu event_menu, Event_customer event_customer, Hall hall,
			List<StaffEvent> staffevents) {
		super();
		this.id = id;
		this.eventType = eventType;
		this.description = description;
		this.noOfAttendance = noOfAttendance;
		this.date = date;
		this.time = time;
		this.evemtPrice = evemtPrice;
		this.totAmount = totAmount;
		this.event_menu = event_menu;
		this.event_customer = event_customer;
		this.hall = hall;
		this.staffevents = staffevents;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setEventType(String eventType) {
		this.eventType = eventType;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public void setNoOfAttendance(int noOfAttendance) {
		this.noOfAttendance = noOfAttendance;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public void setTime(Time time) {
		this.time = time;
	}



	public void setEvemtPrice(double evemtPrice) {
		this.evemtPrice = evemtPrice;
	}



	public void setTotAmount(double totAmount) {
		this.totAmount = totAmount;
	}



	public void setEvent_menu(Event_Menu event_menu) {
		this.event_menu = event_menu;
	}



	public void setEvent_customer(Event_customer event_customer) {
		this.event_customer = event_customer;
	}



	public void setHall(Hall hall) {
		this.hall = hall;
	}



	public void setStaffevents(List<StaffEvent> staffevents) {
		this.staffevents = staffevents;
	}



	public long getId() {
		return id;
	}



	public String getEventType() {
		return eventType;
	}



	public String getDescription() {
		return description;
	}



	public int getNoOfAttendance() {
		return noOfAttendance;
	}



	public String getDate() {
		return date;
	}



	public Time getTime() {
		return time;
	}



	public double getEvemtPrice() {
		return evemtPrice;
	}



	public double getTotAmount() {
		return totAmount;
	}



	public Event_Menu getEvent_menu() {
		return event_menu;
	}



	public Event_customer getEvent_customer() {
		return event_customer;
	}



	public Hall getHall() {
		return hall;
	}



	public List<StaffEvent> getStaffevents() {
		return staffevents;
	}
	
	
	
	
	
}


