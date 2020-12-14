package tu.cit.examples.kafkaapi.schemas;

import com.opencsv.bean.CsvBindByName;

public class ModelGpsData {
    @CsvBindByName
	private String orderNumber;
    @CsvBindByName
	private String orderId;
    @CsvBindByName
	private String mopeventHeaderInId;
    @CsvBindByName
	private String geoX;
    @CsvBindByName
	private String geoY;
    @CsvBindByName
	private String truckId;
    @CsvBindByName
	private String truckPlateNo;
    @CsvBindByName
	private String ctlCreTs;
	
	public ModelGpsData() {
		
	}
	


	public ModelGpsData(String orderNumber, String orderId, String mopeventHeaderInId, String geoX, String geoY,
			String truckId, String truckPlateNo, String ctlCreTs) {
		super();
		this.orderNumber = orderNumber;
		this.orderId = orderId;
		this.mopeventHeaderInId = mopeventHeaderInId;
		this.geoX = geoX;
		this.geoY = geoY;
		this.truckId = truckId;
		this.truckPlateNo = truckPlateNo;
		this.ctlCreTs = ctlCreTs;
	}



	public String getCtlCreTs() {
		return ctlCreTs;
	}



	public void setCtlCreTs(String ctlCreTs) {
		this.ctlCreTs = ctlCreTs;
	}



	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getMopeventHeaderInId() {
		return mopeventHeaderInId;
	}
	public void setMopeventHeaderInId(String mopeventHeaderInId) {
		this.mopeventHeaderInId = mopeventHeaderInId;
	}
	public String getGeoX() {
		return geoX;
	}
	public void setGeoX(String geoX) {
		this.geoX = geoX;
	}
	public String getGeoY() {
		return geoY;
	}
	public void setGeoY(String geoY) {
		this.geoY = geoY;
	}
	public String getTruckId() {
		return truckId;
	}
	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}
	public String getTruckPlateNo() {
		return truckPlateNo;
	}
	public void setTruckPlateNo(String truckPlateNo) {
		this.truckPlateNo = truckPlateNo;
	}



	@Override
	public String toString() {
		return "OrderDetails [orderNumber=" + orderNumber + ", orderId=" + orderId + ", mopeventHeaderInId="
				+ mopeventHeaderInId + ", geoX=" + geoX + ", geoY=" + geoY + ", truckId=" + truckId + ", truckPlateNo="
				+ truckPlateNo + ", ctlCreTs=" + ctlCreTs + "]";
	}

}
