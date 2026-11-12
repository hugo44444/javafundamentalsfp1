package oopmodeling.universe;

public class CelestialBody {

	public double mass;

	private float radius;

	public String name;

	public CelestialBody(double mass, float radius, String name) {
		super();
		this.mass = mass;
		this.radius = radius;
		this.name = name;
	}

	public CelestialBody() {
		super();
	}

}
