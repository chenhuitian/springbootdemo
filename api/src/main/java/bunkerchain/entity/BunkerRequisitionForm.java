package bunkerchain.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "bunker_requisition_form")
public class BunkerRequisitionForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
//	@OneToOne(mappedBy = "bunkerRequisitionForm", cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER)
//	private BunkerDeliveryNote bunkerDeliveryNote;
	
	private int marineFuelOilTonnesPerHour;
	
	private int marineGasTonnesPerHour;
	private boolean allowLineClearing;
	private boolean isUnderFuelQualityTesting;
	
	private String productName;
	private boolean isBlendedInAdvance;
	
	private float viscosity;
	private float density;
	private float waterContentPercentage;
	private float flashPointCelsius;
	private float sulphurContentPercentage;
	private float deliveryTemperatureCelsius;
	
	@Column(columnDefinition="TEXT")
	private String constraintDescription;
	
	private java.sql.Timestamp commencedAt;
	private java.sql.Timestamp completedAt;
	
	
	private java.sql.Timestamp cargoOfficerConfirmedAt;
	private java.sql.Timestamp chiefEngineerConfirmedAt;
	private java.sql.Timestamp surveyorConfirmedAt;
	
	private java.sql.Timestamp cargoOfficerSignedAt;
	private java.sql.Timestamp chiefEngineerSignedAt;
	private java.sql.Timestamp surveyorSignedAt;
	
	private java.sql.Timestamp cargoOfficerForConstraintConfirmedAt;
	private java.sql.Timestamp chiefEngineerForConstraintConfirmedAt;
	private java.sql.Timestamp surveyorForConstraintConfirmedAt;
	
	private java.sql.Timestamp cargoOfficerForConstraintSignedAt;
	private java.sql.Timestamp chiefEngineerForConstraintSignedAt;
	private java.sql.Timestamp surveyorForConstraintSignedAt;
	
	public BunkerRequisitionForm() {
		// TODO Auto-generated constructor stub
	}

	public int getMarineFuelOilTonnesPerHour() {
		return marineFuelOilTonnesPerHour;
	}

	public void setMarineFuelOilTonnesPerHour(int marineFuelOilTonnesPerHour) {
		this.marineFuelOilTonnesPerHour = marineFuelOilTonnesPerHour;
	}

	public int getMarineGasTonnesPerHour() {
		return marineGasTonnesPerHour;
	}

	public void setMarineGasTonnesPerHour(int marineGasTonnesPerHour) {
		this.marineGasTonnesPerHour = marineGasTonnesPerHour;
	}

	public float getDeliveryTemperatureCelsius() {
		return deliveryTemperatureCelsius;
	}

	public void setDeliveryTemperatureCelsius(float deliveryTemperatureCelsius) {
		this.deliveryTemperatureCelsius = deliveryTemperatureCelsius;
	}

	public String getConstraintDescription() {
		return constraintDescription;
	}

	public void setConstraintDescription(String constraintDescription) {
		this.constraintDescription = constraintDescription;
	}
	
	
	
	
	

}
