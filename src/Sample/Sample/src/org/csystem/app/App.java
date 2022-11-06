/*-----------------------------------------------------------------------------------------------------------------------
	Car, Driver, Engine, Plane, Pilot sınıfları ve aralarındaki ilişkiler
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		CarFactory carFactory = new CarFactory();
		PlaneFactory planeFactory = new PlaneFactory();

		Car car = carFactory.getCar(1, "Porsche");
		Plane plane = planeFactory.getPlane("TK2208", 3);

		car.run();
		System.out.println("---------------------------------------------");
		plane.fly();
	}
}

class CarFactory {
	//...
	public Car getCar(int id, String brand)
	{
		Driver driver = new Driver(1, "Ali Serçe");

		driver.setRating(3);

		Car car = new Car(driver);

		car.setId(id);
		car.setBrand(brand);

		return car;
	}
}

class PlaneFactory {
	//...

	public Plane getPlane(String id, int engineCount)
	{
		Pilot [] pilots = {new Pilot(1, "Kaan Aslan", 100000), new Pilot(2, "Oğuz Karan", 50000), new Pilot(3, "Güray Sönmez", 20000)};

		return new Plane(id, pilots, engineCount);
	}
}

class Plane {
	private String m_id;
	private Pilot [] m_pilots;
	private Engine[] m_engines;

	public void startEngines()
	{
		for (Engine engine : m_engines)
			engine.startEngine();
	}

	public void accelerateEngines()
	{
		for (Engine engine : m_engines)
			engine.accelerateEngine();
	}

	public void slowEngines()
	{
		for (Engine engine : m_engines)
			engine.slowEngine();
	}

	public void stopEngines()
	{
		for (Engine engine : m_engines)
			engine.stopEngine();
	}

	private void displayInfo()
	{
		System.out.printf("Plane id:%s%n", m_id);
		System.out.println("Pilots:");
		for (Pilot pilot : m_pilots)
			System.out.printf("%d pilot:%s%n", pilot.getTitle(), pilot.getName());
	}

	public Plane(String id, Pilot[] pilots, int engineCount)
	{
		m_id = id;
		m_pilots = pilots;
		m_engines = new Engine[engineCount];

		for (int i = 0; i < engineCount; ++i)
			m_engines[i] = new Engine(/*...*/);
	}


	public void fly()
	{
		displayInfo();
		startEngines();
		accelerateEngines();
		//...
		System.out.println("flying");
		//...

		slowEngines();
		stopEngines();
	}
}

class Car {
	private int m_id;
	private String m_brand;
	private Engine m_engine;
	private Driver m_driver;

	public Car(Driver driver/*...*/)
	{
		m_driver = driver;
		m_engine = new Engine(/*...*/);
		//...
	}

	public int getId()
	{
		return m_id;
	}

	public void setId(int id)
	{

		//...
		m_id = id;
	}

	public String getBrand()
	{
		return m_brand;
	}

	public void setBrand(String brand)
	{
		//...
		m_brand = brand;
	}

	public Driver getDriver()
	{
		return m_driver;
	}

	public void setDriver(Driver driver)
	{
		//...
		m_driver = driver;
	}

	public void brake()
	{
		//...

		m_engine.slowEngine();

		//...
	}

	public void run()
	{
		System.out.printf("%s drives that car:%s%n", m_driver.getName(), m_id + " " + m_brand);
		System.out.printf("Driver status:%s%n", m_driver.toString());
		m_engine.startEngine();
		m_engine.accelerateEngine();
		//...
		System.out.println("Running");
		//...
		brake();
		m_engine.stopEngine();
	}
}

class Engine {
	//...

	public void startEngine()
	{
		System.out.println("Start engine");
	}

	public void accelerateEngine()
	{
		System.out.println("Accelerate engine");
	}

	public void slowEngine()
	{
		System.out.println("Slow engine");
	}

	public void stopEngine()
	{
		System.out.println("Stop engine");
	}
}

class Pilot {
	private int m_title;
	private String m_name;
	private int m_flightDuration;
	//...

	public Pilot(int title, String name, int flightDuration)
	{
		m_title = title;
		m_name = name;
		m_flightDuration = flightDuration;
	}

	public int getTitle()
	{
		return m_title;
	}

	public void setTitle(int title)
	{
		//...
		m_title = title;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public int getFlightDuration()
	{
		//...
		return m_flightDuration;
	}

	public void setFlightDuration(int flightDuration)
	{
		m_flightDuration = flightDuration;
	}
}

class Driver {
	private int m_id;
	private String m_name;
	private int m_rating;
	//...


	public Driver(int id, String name)
	{
		m_id = id;
		m_name = name;
	}

	public int getId()
	{
		return m_id;
	}

	public void setId(int id)
	{
		m_id = id;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public int getRating()
	{
		return m_rating;
	}

	public void setRating(int rating)
	{
		m_rating = rating;
	}

	public String toString()
	{
		return String.format("[%d]%s -> %d star%s", m_id, m_name, m_rating, m_rating == 1 || m_rating == 0 ? "" : "s");
	}
}