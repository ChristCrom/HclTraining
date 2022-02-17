package com.chris.utility;
import com.chris.auto.*;

import lombok.Setter;

@Setter
public class UtilityClass {

	Vehicle v;
	public void output() {
		v.speed();
	}
	
}
