
public class Test2 {

	public static void main(String[] args) {
		Torch torch = new Torch();
		System.out.println("Charge:2 hours");
		torch.charge(2);
		System.out.println("First Turn On:3 hours");
		torch.turnOn(3);
		System.out.println("Second Turn On:3 hours");
		torch.turnOn(3);

	}

}

class Battery{
	public void chargeBattery(double p){
		if(this.power <1.0){
			this.power = this.power +p;			
		}
	}
	
	public boolean useBattery(double p){
		if(this.power >= p){
			this.power = this.power - p;
			return true;			
		}
		else {
			this.power = 0.0;
			return false;
		}
	}
	
	private double power = 0.0;
}

class Torch {
	public void turnOn(int hours) {
		boolean usable;
		usable = this.theBattery.useBattery(hours*0.1);
		if(usable != true){
			System.out.println("No more usable,must charge!");
		}
	}

	public void charge(int hours) {
		this.theBattery.chargeBattery(hours*0.2);
	}

	private Battery theBattery = new Battery();
}