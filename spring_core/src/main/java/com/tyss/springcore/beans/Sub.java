package com.tyss.springcore.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Sub extends Super {
	@Override
	protected ArrayList<String> method(String a) throws IOException {
		System.out.println("subclass");
		return null;
	}
}
