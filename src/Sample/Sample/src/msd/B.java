package msd;

import csd.A;

class B {
	public void bar()
	{
		A a = new A(); //error

		a.x = 20; //error
		a.foo(); //error
	}
}