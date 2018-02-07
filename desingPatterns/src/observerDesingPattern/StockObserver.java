package observerDesingPattern;

public class StockObserver implements Observer {

	private double googlePrice;
	private double faceBookPrice;
	private double ibmPrice;
	
	private static int observerIdToken = 0;
	private int observerId; 
	
	private Subject stockGrabber;
	
	
	public StockObserver(Subject stockGrabber) {
		super();
		this.stockGrabber = stockGrabber;
		observerId = ++observerIdToken;
		stockGrabber.register(this);
		System.out.println("New Observer Created with id:  "+ observerId);
	}


	@Override
	public void update(double googlePrice, double faceBookPrice, double ibmPrice) {
		this.googlePrice = googlePrice;
		this.faceBookPrice = faceBookPrice;
		this.ibmPrice = ibmPrice;
		
		printPrice();
		
	}


	private void printPrice() {
		System.out.println("Observer: " + observerId);
		System.out.println("Google Price:  "+this.googlePrice);
		System.out.println("FaceBook Price:  "+this.faceBookPrice);
		System.out.println("IBM Price:  "+this.ibmPrice);
	}

}
