public class CarInfo {
	private String carModel;
    private int price;
    private int MSRP;
    private int tax;
    
    public void setModelInfo(String model) {
        this.carModel = model;

        switch (model.toLowerCase()) {
            case "x3":
                this.price = 30000;
                this.MSRP = 35000; 
                break;
            case "x5":
                this.price = 50000;
                this.MSRP = 55000; 
                break;
            case "x7":
                this.price = 70000;
                this.MSRP = 100000; 
                break;
        }
    }
    
    
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMSRP() {
		return MSRP;
	}
	public void setMSRP(int mSRP) {
		MSRP = mSRP;
	}

}
