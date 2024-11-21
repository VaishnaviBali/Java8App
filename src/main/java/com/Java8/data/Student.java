package com.Java8.data;

import java.util.List;

public class Student {
		private int id;
		private String name;
		private String gender;
		private double  grade;
		private List<String> hobbies;
		
		public Student(int id, String name, String gender, double grade, List<String> hobbies) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.grade = grade;
			this.hobbies = hobbies;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public double getGrade() {
			return grade;
		}

		public void setGrade(double grade) {
			this.grade = grade;
		}

		public List<String> getHobbies() {
			return hobbies;
		}

		public void setHobbies(List<String> hobbies) {
			this.hobbies = hobbies;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", grade=" + grade + ", hobbies="
					+ hobbies + "]";
		}
		
		
}
