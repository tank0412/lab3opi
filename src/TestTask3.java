package com.home.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask3 {

	@Test
	public void IsIncluded() {
    Task3.R = 10;
    Task3.mystack.push(new Double(10));
    Task3.mystack.push(new Double(10));
	Mark.Dojob();
	assertTrue(Figura.Include());

}
}
