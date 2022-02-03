package StudentException;

class IllegalRangeException extends Exception {
	public IllegalRangeException() {
		System.out.println("Student's score must be in between 0 and 100");
	}

	public String toString() {
		return "IllegalRangeException Object : Score cannot be < 0 and > 100";
	}

}
