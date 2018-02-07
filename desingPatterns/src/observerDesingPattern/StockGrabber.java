package observerDesingPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {


	public StockGrabber() {
		observer = new ArrayList<Observer>();
	}

	private ArrayList<Observer> observer;

	private double googlePrice;
	private double faceBookPrice;
	private double ibmPrice;

	@Override
	public void register(Observer newObserver) {
		observer.add(newObserver);

	}

	@Override
	public void unRegister(Observer deleteObserver) {
		int index = observer.indexOf(deleteObserver);

		System.out.println("deleted index" + index);

		observer.remove(index);

	}

	@Override
	public void notifyObserver() {

		for (Observer ob : observer) {
			ob.update(googlePrice, faceBookPrice, ibmPrice);
		}

	}

	public double getGooglePrice() {
		return googlePrice;
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver() ;
	}

	public double getFaceBookPrice() {
		return faceBookPrice;
	}

	public void setFaceBookPrice(double faceBookPrice) {
		
		this.faceBookPrice = faceBookPrice;
		notifyObserver() ;
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver() ;
	}


}
