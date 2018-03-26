package alma.acs.tmcdb;
// Generated Jan 25, 2018 5:26:44 PM by Hibernate Tools 4.3.1.Final


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * PointingModelCoeff generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`POINTINGMODELCOEFF`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`POINTINGMODELID`", "`COEFFNAME`"})
)
public class PointingModelCoeff extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer pointingModelCoeffId;
     protected PointingModel pointingModel;
     protected String coeffName;
     protected Double coeffValue;
     private Set<PointingModelCoeffOffset> pointingModelCoeffOffsets = new HashSet<PointingModelCoeffOffset>(0);

    public PointingModelCoeff() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="PointiMC_seq")}
	)

    
    @Column(name="`POINTINGMODELCOEFFID`", unique=true, nullable=false)
    public Integer getPointingModelCoeffId() {
        return this.pointingModelCoeffId;
    }
    
    public void setPointingModelCoeffId(Integer pointingModelCoeffId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("pointingModelCoeffId", this.pointingModelCoeffId, this.pointingModelCoeffId = pointingModelCoeffId);
        else
            this.pointingModelCoeffId = pointingModelCoeffId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`POINTINGMODELID`", nullable=false)
    public PointingModel getPointingModel() {
        return this.pointingModel;
    }
    
    public void setPointingModel(PointingModel pointingModel) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("pointingModel", this.pointingModel, this.pointingModel = pointingModel);
        else
            this.pointingModel = pointingModel;
    }


    
    @Column(name="`COEFFNAME`", nullable=false, length=128)
    public String getCoeffName() {
        return this.coeffName;
    }
    
    public void setCoeffName(String coeffName) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("coeffName", this.coeffName, this.coeffName = coeffName);
        else
            this.coeffName = coeffName;
    }


    
    @Column(name="`COEFFVALUE`", nullable=false, precision=64, scale=0)
    public Double getCoeffValue() {
        return this.coeffValue;
    }
    
    public void setCoeffValue(Double coeffValue) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("coeffValue", this.coeffValue, this.coeffValue = coeffValue);
        else
            this.coeffValue = coeffValue;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="pointingModelCoeff")
    public Set<PointingModelCoeffOffset> getPointingModelCoeffOffsets() {
        return this.pointingModelCoeffOffsets;
    }
    
    public void setPointingModelCoeffOffsets(Set<PointingModelCoeffOffset> pointingModelCoeffOffsets) {    
    	this.pointingModelCoeffOffsets = pointingModelCoeffOffsets;
    }

	public void addPointingModelCoeffOffsets(Set<PointingModelCoeffOffset> elements) {
		if( this.pointingModelCoeffOffsets != null )
			for(Iterator<PointingModelCoeffOffset> it = elements.iterator(); it.hasNext(); )
				addPointingModelCoeffOffsetToPointingModelCoeffOffsets((PointingModelCoeffOffset)it.next());
	}

	public void addPointingModelCoeffOffsetToPointingModelCoeffOffsets(PointingModelCoeffOffset element) {
		if( !this.pointingModelCoeffOffsets.contains(element) ) {
			this.pointingModelCoeffOffsets.add(element);
		}
	}



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PointingModelCoeff) ) return false;
		 PointingModelCoeff castOther = ( PointingModelCoeff ) other;

		 return ( (this.getPointingModel()==castOther.getPointingModel()) || ( this.getPointingModel()!=null && castOther.getPointingModel()!=null && this.getPointingModel().equals(castOther.getPointingModel()) ) )
 && ( (this.getCoeffName()==castOther.getCoeffName()) || ( this.getCoeffName()!=null && castOther.getCoeffName()!=null && this.getCoeffName().equals(castOther.getCoeffName()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getPointingModel() == null ? 0 : this.getPointingModel().hashCode() );
         result = 37 * result + ( getCoeffName() == null ? 0 : this.getCoeffName().hashCode() );
         
         
         return result;
   }


}

