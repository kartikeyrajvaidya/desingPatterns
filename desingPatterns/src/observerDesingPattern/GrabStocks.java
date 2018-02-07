package observerDesingPattern;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber  stockGrabber = new StockGrabber();
		StockObserver stockObserver = new StockObserver(stockGrabber);
		
		stockGrabber.setFaceBookPrice(123);
		stockGrabber.setGooglePrice(2324);
		stockGrabber.setIbmPrice(4231);
		
		
		

	}

}
