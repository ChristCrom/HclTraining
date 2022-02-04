package com.hcl.datastructurespractice;

import java.util.*;


	class NameComparator implements Comparator<Patient> {

		public int compare(Patient o1, Patient o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	class AgeComparator implements Comparator<Patient> {

		public int compare(Patient o1, Patient o2) {
			return o1.age - o2.age;
		}
	}

	class IdComparator implements Comparator<Patient> {

		public int compare(Patient o1, Patient o2) {
			return o1.id - o2.id;
		}
	}

	class DocNameComparator implements Comparator<Doctor> {

		public int compare(Doctor o1, Doctor o2) {
			return o1.name.compareTo(o2.name);
		}

	}

	class DocIdComparator implements Comparator<Doctor> {

		public int compare(Doctor o1, Doctor o2) {
			return o1.id - o2.id;
		}

	}

	class DocSpecialityComparator implements Comparator<Doctor> {

		public int compare(Doctor o1, Doctor o2) {
			return o1.speciality.compareTo(o2.speciality);

		}

	}

class ComparatorPractice {
	public static void main(String[] args) {
		ArrayList<Patient> listP = new ArrayList<Patient>();
		listP.add(new Patient(4, "Martha", 21));
		listP.add(new Patient(2, "John", 42));
		listP.add(new Patient(6, "Chris", 101));
		listP.add(new Patient(8, "Sumit", 12));
		listP.add(new Patient(11, "Krishna", 8));

		for (Patient patient : listP) {
			System.out.println(patient.id + " " + patient.name + " " + patient.age);

		}
		System.out.println();

		Collections.sort(listP, new IdComparator());

		for (Patient patient : listP) {
			System.out.println(patient.id + " " + patient.name + " " + patient.age);
		}

		System.out.println();

		Collections.sort(listP, new AgeComparator());

		for (Patient patient : listP) {
			System.out.println(patient.id + " " + patient.name + " " + patient.age);
		}

		System.out.println();

		Collections.sort(listP, new NameComparator());

		for (Patient patient : listP) {
			System.out.println(patient.id + " " + patient.name + " " + patient.age);
		}

		
		
		ArrayList<Doctor> listD = new ArrayList<Doctor>();
		listD.add(new Doctor(4, "Mark", "Surgeon"));
		listD.add(new Doctor(2, "Johnny", "Primary"));
		listD.add(new Doctor(6, "Christian", "Primary"));
		listD.add(new Doctor(8, "Sumiten", "Chiropractor"));
		listD.add(new Doctor(11, "Krishnaaas", "Pharmacy"));
		for (Doctor doctor : listD) {
			System.out.println(doctor.id + " " + doctor.name + " " + doctor.speciality);

		}
		System.out.println();

		Collections.sort(listD, new DocIdComparator());

		for (Doctor doctor : listD) {
			System.out.println(doctor.id + " " + doctor.name + " " + doctor.speciality);
		}

		System.out.println();

		Collections.sort(listD, new DocSpecialityComparator());

		for (Doctor doctor : listD) {
			System.out.println(doctor.id + " " + doctor.name + " " + doctor.speciality);
		}

		System.out.println();

		Collections.sort(listD, new DocNameComparator());

		for (Doctor doctor : listD) {
			System.out.println(doctor.id + " " + doctor.name + " " + doctor.speciality);
		}

	}

}
