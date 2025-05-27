package com.java.collection.core;

import java.io.*;
import java.util.*;

public class ArrayListObjectExample {

	List<Course> coursesList = null;

	public static void main(String[] args) throws IOException {

		ArrayListObjectExample arrayListObjectExample = new ArrayListObjectExample();
		arrayListObjectExample.initCourse();
		arrayListObjectExample.getAllCourses();

		arrayListObjectExample.addCourse(new Course("c-112", "DB Fundamental", "150 Hrs", "SD", "Offline", 60, 25000.0,	20, 20000.5, "DB fundamental for all."));
		
		System.out.println("====\nAll courses after adding one course");
		arrayListObjectExample.getAllCourses();
		
		System.out.println("====\\nGet Course by Id ============");
		Course courseByid = arrayListObjectExample.getCourseByid("c-105");
		System.out.println("Course by Id  :" + courseByid);
		
		
		System.out.println("====\nUpdate Course by Id ============");
		arrayListObjectExample.updateCourse(new Course("c-105", "Spring Security", "200 Hrs", "SD", "Online", 100, 25000.0, 30, 17500.5, "Spring Security for Spring java personal."));
		arrayListObjectExample.getAllCourses();
		
		System.out.println("====\nDelete Course by Id ============");
		System.out.println("Deleted : " +arrayListObjectExample.deleteCourseById("c-105"));
		arrayListObjectExample.getAllCourses();
		
		
	}

	//Add course
	private void addCourse(Course course) {
		coursesList.add(course);
	}

	//Get Course
	private Course getCourseByid(String courseId) {
		
		for (Course course : coursesList) {
			if(course.getCourseId().equals(courseId))
				return course;
		}
		
		return new Course();
	}
	
	//Get All course
	private List<Course> getAllCourses(){
		for (int i = 0; i < coursesList.size(); i++) {
			System.out.println(coursesList.get(i));
		}
		return coursesList;
	}
	
	//Update course
	private Course updateCourse(Course course) {
		
		for (int i = 0; i < coursesList.size(); i++) {
			if(course.getCourseId().equals(coursesList.get(i).getCourseId())) {
				coursesList.set(i, course);
				return course;
			}
		}
		return new Course();
	}
	
	//Delete course 
	private Boolean deleteCourseById(String CourseId) {
		for (int i = 0; i < coursesList.size(); i++) {
			if(CourseId.equals(coursesList.get(i).getCourseId())) {
				coursesList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	private List<Course> initCourse() {
		coursesList = new ArrayList<>();
		coursesList.addAll(Arrays.asList(
				new Course("c-101", "Java Full Stack", "500 Hrs", "SD", "Online", 500, 25000.0, 20, 20000.0, "Full java course for all."),
				new Course("c-102", "Spring Boot Course", "500 Hrs", "SD", "Online", 600, 25000.0, 20, 20000.5, "Spring Boot Course for all."),
				new Course("c-103", "Spring Boot Microservice", "200 Hrs", "SD", "Online", 250, 25000.0, 20, 20000.5, "Spring Boot Microservice for all."),
				new Course("c-104", "Hibernate", "300 Hrs", "SD", "Offline", 400, 25000.0, 20, 20000.5, "Hibernate for all."),
				new Course("c-105", "Spring Security", "200 Hrs", "SD", "Online", 100, 25000.0, 20, 20000.5, "Spring Security for all."),
				new Course("c-106", "HTML", "50 Hrs", "SD", "Online", 150, 25000.0, 20, 20000.5, "HTML for all."),
				new Course("c-107", "Javascript", "150 Hrs", "SD", "Online", 250, 25000.0, 20, 20000.5, "Javascript for all."),
				new Course("c-108", "CSS", "60 Hrs", "SD", "Offline", 50, 25000.0, 20, 20000.5, "CSS for all."),
				new Course("c-109", "Reactjs", "200 Hrs", "SD", "Online", 350, 25000.0, 20, 20000.5, "Reactjs for all."),
				new Course("c-110", "Angular", "250 Hrs", "SD", "Online", 350, 25000.0, 20, 20000.5, "Angular for all."),
				new Course("c-111", "MongoDB", "150 Hrs", "SD", "Offline", 90, 25000.0, 20, 20000.5, "MongoDB for all.")
			));
		return coursesList;
	}

}

class Course {
	private String courseId;
	private String couresName;
	private String duration;
	private String trainer;
	private String trainingMode;
	private int enrollements;
	private Double price;
	private int discount;
	private Double offerPrice;
	private String description;

	public Course() {
	}

	public Course(String courseId, String couresName, String duration, String trainer, String trainingMode,
			int enrollements, Double price, int discount, Double offerPrice, String description) {
		super();
		this.courseId = courseId;
		this.couresName = couresName;
		this.duration = duration;
		this.trainer = trainer;
		this.trainingMode = trainingMode;
		this.enrollements = enrollements;
		this.price = price;
		this.discount = discount;
		this.offerPrice = offerPrice;
		this.description = description;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCouresName() {
		return couresName;
	}

	public void setCouresName(String couresName) {
		this.couresName = couresName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getTrainingMode() {
		return trainingMode;
	}

	public void setTrainingMode(String trainingMode) {
		this.trainingMode = trainingMode;
	}

	public int getEnrollements() {
		return enrollements;
	}

	public void setEnrollements(int enrollements) {
		this.enrollements = enrollements;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", couresName=" + couresName + ", duration=" + duration + ", trainer="
				+ trainer + ", trainingMode=" + trainingMode + ", enrollements=" + enrollements + ", price=" + price
				+ ", discount=" + discount + ", offerPrice=" + offerPrice + ", description=" + description + "]";
	}

	
	

}
