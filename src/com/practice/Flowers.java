package com.practice;

public  abstract class Flowers {
	public String type;
	public Flowers(String type) {
		this.type=type;
	}
	public abstract void bloom();
	

}class Tulip extends Flowers{
	public Tulip(String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type+" blooms in March");
		
	}
}
class Rose extends Flowers{
	public Rose(String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type+" blooms in June ");
		
	}
}
class Sunflower extends Flowers{

	public Sunflower(String type) {
		super(type);
		
	}

	@Override
	public void bloom() {
		System.out.println(type+" blooms in September");
		
	}
	
}