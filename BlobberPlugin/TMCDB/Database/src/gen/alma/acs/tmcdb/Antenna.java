package alma.acs.tmcdb;
// Generated Jan 25, 2018 5:26:44 PM by Hibernate Tools 4.3.1.Final


import alma.hibernate.util.StringEnumUserType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

/**
 * Antenna generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`ANTENNA`"
)
@TypeDef(name="AntennaType", typeClass=StringEnumUserType.class,
   parameters={ @Parameter(name="enumClassName", value="alma.acs.tmcdb.AntennaType") })
public class Antenna extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer baseElementId;
     protected BaseElement baseElement;
     protected String antennaName;
     protected AntennaType antennaType;
     protected Double dishDiameter;
     protected Long commissionDate;
     protected Double XPosition;
     protected Double YPosition;
     protected Double ZPosition;
     protected Double XPositionErr;
     protected Double YPositionErr;
     protected Double ZPositionErr;
     protected Double XOffset;
     protected Double YOffset;
     protected Double ZOffset;
     protected Long posObservationTime;
     protected String posExecBlockUID;
     protected Integer posScanNumber;
     protected String comments;
     protected Double delay;
     protected Double delayError;
     protected Long delObservationTime;
     protected String delExecBlockUID;
     protected Integer delScanNumber;
     protected Double XDelayRef;
     protected Double YDelayRef;
     protected Double ZDelayRef;
     protected Integer LOOffsettingIndex;
     protected Integer walshSeq;
     protected Integer caiBaseline;
     protected Integer caiAca;
     protected Boolean locked;
     protected Boolean increaseVersion;
     protected Integer currentVersion;
     protected String who;
     protected String changeDesc;
     protected Boolean delayBLLocked;
     protected Boolean delayBLIncreaseVersion;
     protected Integer delayBLCurrentVersion;
     protected String delayBLWho;
     protected String delayBLChangeDesc;
     private Set<Holography> holographiesForReferenceantenna = new HashSet<Holography>(0);
     private Set<AntennaToPad> antennaToPads = new HashSet<AntennaToPad>(0);
     private Set<FEDelay> FEDelays = new HashSet<FEDelay>(0);
     private Set<LODelay> LODelays = new HashSet<LODelay>(0);
     private Set<IFDelay> IFDelays = new HashSet<IFDelay>(0);
     private Set<AntennaEfficiency> antennaEfficiencies = new HashSet<AntennaEfficiency>(0);
     protected AcaCorrDelays acaCorrDelays;
     private Set<ReceiverQuality> receiverQualities = new HashSet<ReceiverQuality>(0);
     private Set<FocusModel> focusModels = new HashSet<FocusModel>(0);
     private Set<Array> arrays = new HashSet<Array>(0);
     private Set<PointingModel> pointingModels = new HashSet<PointingModel>(0);
     private Set<Holography> holographiesForAntennaid = new HashSet<Holography>(0);
     private Set<AntennaToFrontEnd> antennaToFrontEnds = new HashSet<AntennaToFrontEnd>(0);

    public Antenna() {
    }
   
       @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="baseElement"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="`BASEELEMENTID`", unique=true, nullable=false)
    public Integer getBaseElementId() {
        return this.baseElementId;
    }
    
    public void setBaseElementId(Integer baseElementId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("baseElementId", this.baseElementId, this.baseElementId = baseElementId);
        else
            this.baseElementId = baseElementId;
    }


@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public BaseElement getBaseElement() {
        return this.baseElement;
    }
    
    public void setBaseElement(BaseElement baseElement) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("baseElement", this.baseElement, this.baseElement = baseElement);
        else
            this.baseElement = baseElement;
    }


    
    @Column(name="`ANTENNANAME`", length=128)
    public String getAntennaName() {
        return this.antennaName;
    }
    
    public void setAntennaName(String antennaName) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("antennaName", this.antennaName, this.antennaName = antennaName);
        else
            this.antennaName = antennaName;
    }


    
    @Column(name="`ANTENNATYPE`", nullable=false, length=16777216)
	@Type(type="AntennaType")
    public AntennaType getAntennaType() {
        return this.antennaType;
    }
    
    public void setAntennaType(AntennaType antennaType) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("antennaType", this.antennaType, this.antennaType = antennaType);
        else
            this.antennaType = antennaType;
    }


    
    @Column(name="`DISHDIAMETER`", nullable=false, precision=64, scale=0)
    public Double getDishDiameter() {
        return this.dishDiameter;
    }
    
    public void setDishDiameter(Double dishDiameter) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("dishDiameter", this.dishDiameter, this.dishDiameter = dishDiameter);
        else
            this.dishDiameter = dishDiameter;
    }


    
    @Column(name="`COMMISSIONDATE`", nullable=false)
    public Long getCommissionDate() {
        return this.commissionDate;
    }
    
    public void setCommissionDate(Long commissionDate) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("commissionDate", this.commissionDate, this.commissionDate = commissionDate);
        else
            this.commissionDate = commissionDate;
    }


    
    @Column(name="`XPOSITION`", nullable=false, precision=64, scale=0)
    public Double getXPosition() {
        return this.XPosition;
    }
    
    public void setXPosition(Double XPosition) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("XPosition", this.XPosition, this.XPosition = XPosition);
        else
            this.XPosition = XPosition;
    }


    
    @Column(name="`YPOSITION`", nullable=false, precision=64, scale=0)
    public Double getYPosition() {
        return this.YPosition;
    }
    
    public void setYPosition(Double YPosition) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("YPosition", this.YPosition, this.YPosition = YPosition);
        else
            this.YPosition = YPosition;
    }


    
    @Column(name="`ZPOSITION`", nullable=false, precision=64, scale=0)
    public Double getZPosition() {
        return this.ZPosition;
    }
    
    public void setZPosition(Double ZPosition) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("ZPosition", this.ZPosition, this.ZPosition = ZPosition);
        else
            this.ZPosition = ZPosition;
    }


    
    @Column(name="`XPOSITIONERR`", precision=64, scale=0)
    public Double getXPositionErr() {
        return this.XPositionErr;
    }
    
    public void setXPositionErr(Double XPositionErr) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("XPositionErr", this.XPositionErr, this.XPositionErr = XPositionErr);
        else
            this.XPositionErr = XPositionErr;
    }


    
    @Column(name="`YPOSITIONERR`", precision=64, scale=0)
    public Double getYPositionErr() {
        return this.YPositionErr;
    }
    
    public void setYPositionErr(Double YPositionErr) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("YPositionErr", this.YPositionErr, this.YPositionErr = YPositionErr);
        else
            this.YPositionErr = YPositionErr;
    }


    
    @Column(name="`ZPOSITIONERR`", precision=64, scale=0)
    public Double getZPositionErr() {
        return this.ZPositionErr;
    }
    
    public void setZPositionErr(Double ZPositionErr) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("ZPositionErr", this.ZPositionErr, this.ZPositionErr = ZPositionErr);
        else
            this.ZPositionErr = ZPositionErr;
    }


    
    @Column(name="`XOFFSET`", nullable=false, precision=64, scale=0)
    public Double getXOffset() {
        return this.XOffset;
    }
    
    public void setXOffset(Double XOffset) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("XOffset", this.XOffset, this.XOffset = XOffset);
        else
            this.XOffset = XOffset;
    }


    
    @Column(name="`YOFFSET`", nullable=false, precision=64, scale=0)
    public Double getYOffset() {
        return this.YOffset;
    }
    
    public void setYOffset(Double YOffset) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("YOffset", this.YOffset, this.YOffset = YOffset);
        else
            this.YOffset = YOffset;
    }


    
    @Column(name="`ZOFFSET`", nullable=false, precision=64, scale=0)
    public Double getZOffset() {
        return this.ZOffset;
    }
    
    public void setZOffset(Double ZOffset) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("ZOffset", this.ZOffset, this.ZOffset = ZOffset);
        else
            this.ZOffset = ZOffset;
    }


    
    @Column(name="`POSOBSERVATIONTIME`")
    public Long getPosObservationTime() {
        return this.posObservationTime;
    }
    
    public void setPosObservationTime(Long posObservationTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("posObservationTime", this.posObservationTime, this.posObservationTime = posObservationTime);
        else
            this.posObservationTime = posObservationTime;
    }


    
    @Column(name="`POSEXECBLOCKUID`", length=100)
    public String getPosExecBlockUID() {
        return this.posExecBlockUID;
    }
    
    public void setPosExecBlockUID(String posExecBlockUID) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("posExecBlockUID", this.posExecBlockUID, this.posExecBlockUID = posExecBlockUID);
        else
            this.posExecBlockUID = posExecBlockUID;
    }


    
    @Column(name="`POSSCANNUMBER`")
    public Integer getPosScanNumber() {
        return this.posScanNumber;
    }
    
    public void setPosScanNumber(Integer posScanNumber) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("posScanNumber", this.posScanNumber, this.posScanNumber = posScanNumber);
        else
            this.posScanNumber = posScanNumber;
    }


    
    @Column(name="`COMMENTS`", length=16777216)
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("comments", this.comments, this.comments = comments);
        else
            this.comments = comments;
    }


    
    @Column(name="`DELAY`", nullable=false, precision=64, scale=0)
    public Double getDelay() {
        return this.delay;
    }
    
    public void setDelay(Double delay) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delay", this.delay, this.delay = delay);
        else
            this.delay = delay;
    }


    
    @Column(name="`DELAYERROR`", precision=64, scale=0)
    public Double getDelayError() {
        return this.delayError;
    }
    
    public void setDelayError(Double delayError) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delayError", this.delayError, this.delayError = delayError);
        else
            this.delayError = delayError;
    }


    
    @Column(name="`DELOBSERVATIONTIME`")
    public Long getDelObservationTime() {
        return this.delObservationTime;
    }
    
    public void setDelObservationTime(Long delObservationTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delObservationTime", this.delObservationTime, this.delObservationTime = delObservationTime);
        else
            this.delObservationTime = delObservationTime;
    }


    
    @Column(name="`DELEXECBLOCKUID`", length=100)
    public String getDelExecBlockUID() {
        return this.delExecBlockUID;
    }
    
    public void setDelExecBlockUID(String delExecBlockUID) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delExecBlockUID", this.delExecBlockUID, this.delExecBlockUID = delExecBlockUID);
        else
            this.delExecBlockUID = delExecBlockUID;
    }


    
    @Column(name="`DELSCANNUMBER`")
    public Integer getDelScanNumber() {
        return this.delScanNumber;
    }
    
    public void setDelScanNumber(Integer delScanNumber) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delScanNumber", this.delScanNumber, this.delScanNumber = delScanNumber);
        else
            this.delScanNumber = delScanNumber;
    }


    
    @Column(name="`XDELAYREF`", precision=64, scale=0)
    public Double getXDelayRef() {
        return this.XDelayRef;
    }
    
    public void setXDelayRef(Double XDelayRef) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("XDelayRef", this.XDelayRef, this.XDelayRef = XDelayRef);
        else
            this.XDelayRef = XDelayRef;
    }


    
    @Column(name="`YDELAYREF`", precision=64, scale=0)
    public Double getYDelayRef() {
        return this.YDelayRef;
    }
    
    public void setYDelayRef(Double YDelayRef) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("YDelayRef", this.YDelayRef, this.YDelayRef = YDelayRef);
        else
            this.YDelayRef = YDelayRef;
    }


    
    @Column(name="`ZDELAYREF`", precision=64, scale=0)
    public Double getZDelayRef() {
        return this.ZDelayRef;
    }
    
    public void setZDelayRef(Double ZDelayRef) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("ZDelayRef", this.ZDelayRef, this.ZDelayRef = ZDelayRef);
        else
            this.ZDelayRef = ZDelayRef;
    }


    
    @Column(name="`LOOFFSETTINGINDEX`", nullable=false)
    public Integer getLOOffsettingIndex() {
        return this.LOOffsettingIndex;
    }
    
    public void setLOOffsettingIndex(Integer LOOffsettingIndex) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("LOOffsettingIndex", this.LOOffsettingIndex, this.LOOffsettingIndex = LOOffsettingIndex);
        else
            this.LOOffsettingIndex = LOOffsettingIndex;
    }


    
    @Column(name="`WALSHSEQ`", nullable=false)
    public Integer getWalshSeq() {
        return this.walshSeq;
    }
    
    public void setWalshSeq(Integer walshSeq) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("walshSeq", this.walshSeq, this.walshSeq = walshSeq);
        else
            this.walshSeq = walshSeq;
    }


    
    @Column(name="`CAIBASELINE`")
    public Integer getCaiBaseline() {
        return this.caiBaseline;
    }
    
    public void setCaiBaseline(Integer caiBaseline) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("caiBaseline", this.caiBaseline, this.caiBaseline = caiBaseline);
        else
            this.caiBaseline = caiBaseline;
    }


    
    @Column(name="`CAIACA`")
    public Integer getCaiAca() {
        return this.caiAca;
    }
    
    public void setCaiAca(Integer caiAca) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("caiAca", this.caiAca, this.caiAca = caiAca);
        else
            this.caiAca = caiAca;
    }


    
    @Column(name="`LOCKED`")
    public Boolean getLocked() {
        return this.locked;
    }
    
    public void setLocked(Boolean locked) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("locked", this.locked, this.locked = locked);
        else
            this.locked = locked;
    }


    
    @Column(name="`INCREASEVERSION`")
    public Boolean getIncreaseVersion() {
        return this.increaseVersion;
    }
    
    public void setIncreaseVersion(Boolean increaseVersion) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("increaseVersion", this.increaseVersion, this.increaseVersion = increaseVersion);
        else
            this.increaseVersion = increaseVersion;
    }


    
    @Column(name="`CURRENTVERSION`")
    public Integer getCurrentVersion() {
        return this.currentVersion;
    }
    
    public void setCurrentVersion(Integer currentVersion) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("currentVersion", this.currentVersion, this.currentVersion = currentVersion);
        else
            this.currentVersion = currentVersion;
    }


    
    @Column(name="`WHO`", length=128)
    public String getWho() {
        return this.who;
    }
    
    public void setWho(String who) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("who", this.who, this.who = who);
        else
            this.who = who;
    }


    
    @Column(name="`CHANGEDESC`", length=16777216)
    public String getChangeDesc() {
        return this.changeDesc;
    }
    
    public void setChangeDesc(String changeDesc) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("changeDesc", this.changeDesc, this.changeDesc = changeDesc);
        else
            this.changeDesc = changeDesc;
    }


    
    @Column(name="`DELAYBLLOCKED`")
    public Boolean getDelayBLLocked() {
        return this.delayBLLocked;
    }
    
    public void setDelayBLLocked(Boolean delayBLLocked) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delayBLLocked", this.delayBLLocked, this.delayBLLocked = delayBLLocked);
        else
            this.delayBLLocked = delayBLLocked;
    }


    
    @Column(name="`DELAYBLINCREASEVERSION`")
    public Boolean getDelayBLIncreaseVersion() {
        return this.delayBLIncreaseVersion;
    }
    
    public void setDelayBLIncreaseVersion(Boolean delayBLIncreaseVersion) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delayBLIncreaseVersion", this.delayBLIncreaseVersion, this.delayBLIncreaseVersion = delayBLIncreaseVersion);
        else
            this.delayBLIncreaseVersion = delayBLIncreaseVersion;
    }


    
    @Column(name="`DELAYBLCURRENTVERSION`")
    public Integer getDelayBLCurrentVersion() {
        return this.delayBLCurrentVersion;
    }
    
    public void setDelayBLCurrentVersion(Integer delayBLCurrentVersion) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delayBLCurrentVersion", this.delayBLCurrentVersion, this.delayBLCurrentVersion = delayBLCurrentVersion);
        else
            this.delayBLCurrentVersion = delayBLCurrentVersion;
    }


    
    @Column(name="`DELAYBLWHO`", length=128)
    public String getDelayBLWho() {
        return this.delayBLWho;
    }
    
    public void setDelayBLWho(String delayBLWho) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delayBLWho", this.delayBLWho, this.delayBLWho = delayBLWho);
        else
            this.delayBLWho = delayBLWho;
    }


    
    @Column(name="`DELAYBLCHANGEDESC`", length=16777216)
    public String getDelayBLChangeDesc() {
        return this.delayBLChangeDesc;
    }
    
    public void setDelayBLChangeDesc(String delayBLChangeDesc) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("delayBLChangeDesc", this.delayBLChangeDesc, this.delayBLChangeDesc = delayBLChangeDesc);
        else
            this.delayBLChangeDesc = delayBLChangeDesc;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="antennaByReferenceantenna")
    public Set<Holography> getHolographiesForReferenceantenna() {
        return this.holographiesForReferenceantenna;
    }
    
    public void setHolographiesForReferenceantenna(Set<Holography> holographiesForReferenceantenna) {    
    	this.holographiesForReferenceantenna = holographiesForReferenceantenna;
    }

	public void addHolographiesForReferenceantenna(Set<Holography> elements) {
		if( this.holographiesForReferenceantenna != null )
			for(Iterator<Holography> it = elements.iterator(); it.hasNext(); )
				addHolographyToHolographiesForReferenceantenna((Holography)it.next());
	}

	public void addHolographyToHolographiesForReferenceantenna(Holography element) {
		if( !this.holographiesForReferenceantenna.contains(element) ) {
			this.holographiesForReferenceantenna.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<AntennaToPad> getAntennaToPads() {
        return this.antennaToPads;
    }
    
    public void setAntennaToPads(Set<AntennaToPad> antennaToPads) {    
    	this.antennaToPads = antennaToPads;
    }

	public void addAntennaToPads(Set<AntennaToPad> elements) {
		if( this.antennaToPads != null )
			for(Iterator<AntennaToPad> it = elements.iterator(); it.hasNext(); )
				addAntennaToPadToAntennaToPads((AntennaToPad)it.next());
	}

	public void addAntennaToPadToAntennaToPads(AntennaToPad element) {
		if( !this.antennaToPads.contains(element) ) {
			this.antennaToPads.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<FEDelay> getFEDelays() {
        return this.FEDelays;
    }
    
    public void setFEDelays(Set<FEDelay> FEDelays) {    
    	this.FEDelays = FEDelays;
    }

	public void addFEDelays(Set<FEDelay> elements) {
		if( this.FEDelays != null )
			for(Iterator<FEDelay> it = elements.iterator(); it.hasNext(); )
				addFEDelayToFEDelays((FEDelay)it.next());
	}

	public void addFEDelayToFEDelays(FEDelay element) {
		if( !this.FEDelays.contains(element) ) {
			this.FEDelays.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<LODelay> getLODelays() {
        return this.LODelays;
    }
    
    public void setLODelays(Set<LODelay> LODelays) {    
    	this.LODelays = LODelays;
    }

	public void addLODelays(Set<LODelay> elements) {
		if( this.LODelays != null )
			for(Iterator<LODelay> it = elements.iterator(); it.hasNext(); )
				addLODelayToLODelays((LODelay)it.next());
	}

	public void addLODelayToLODelays(LODelay element) {
		if( !this.LODelays.contains(element) ) {
			this.LODelays.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<IFDelay> getIFDelays() {
        return this.IFDelays;
    }
    
    public void setIFDelays(Set<IFDelay> IFDelays) {    
    	this.IFDelays = IFDelays;
    }

	public void addIFDelays(Set<IFDelay> elements) {
		if( this.IFDelays != null )
			for(Iterator<IFDelay> it = elements.iterator(); it.hasNext(); )
				addIFDelayToIFDelays((IFDelay)it.next());
	}

	public void addIFDelayToIFDelays(IFDelay element) {
		if( !this.IFDelays.contains(element) ) {
			this.IFDelays.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<AntennaEfficiency> getAntennaEfficiencies() {
        return this.antennaEfficiencies;
    }
    
    public void setAntennaEfficiencies(Set<AntennaEfficiency> antennaEfficiencies) {    
    	this.antennaEfficiencies = antennaEfficiencies;
    }

	public void addAntennaEfficiencies(Set<AntennaEfficiency> elements) {
		if( this.antennaEfficiencies != null )
			for(Iterator<AntennaEfficiency> it = elements.iterator(); it.hasNext(); )
				addAntennaEfficiencyToAntennaEfficiencies((AntennaEfficiency)it.next());
	}

	public void addAntennaEfficiencyToAntennaEfficiencies(AntennaEfficiency element) {
		if( !this.antennaEfficiencies.contains(element) ) {
			this.antennaEfficiencies.add(element);
		}
	}


@OneToOne(fetch=FetchType.LAZY, mappedBy="antenna")
    public AcaCorrDelays getAcaCorrDelays() {
        return this.acaCorrDelays;
    }
    
    public void setAcaCorrDelays(AcaCorrDelays acaCorrDelays) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("acaCorrDelays", this.acaCorrDelays, this.acaCorrDelays = acaCorrDelays);
        else
            this.acaCorrDelays = acaCorrDelays;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<ReceiverQuality> getReceiverQualities() {
        return this.receiverQualities;
    }
    
    public void setReceiverQualities(Set<ReceiverQuality> receiverQualities) {    
    	this.receiverQualities = receiverQualities;
    }

	public void addReceiverQualities(Set<ReceiverQuality> elements) {
		if( this.receiverQualities != null )
			for(Iterator<ReceiverQuality> it = elements.iterator(); it.hasNext(); )
				addReceiverQualityToReceiverQualities((ReceiverQuality)it.next());
	}

	public void addReceiverQualityToReceiverQualities(ReceiverQuality element) {
		if( !this.receiverQualities.contains(element) ) {
			this.receiverQualities.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<FocusModel> getFocusModels() {
        return this.focusModels;
    }
    
    public void setFocusModels(Set<FocusModel> focusModels) {    
    	this.focusModels = focusModels;
    }

	public void addFocusModels(Set<FocusModel> elements) {
		if( this.focusModels != null )
			for(Iterator<FocusModel> it = elements.iterator(); it.hasNext(); )
				addFocusModelToFocusModels((FocusModel)it.next());
	}

	public void addFocusModelToFocusModels(FocusModel element) {
		if( !this.focusModels.contains(element) ) {
			this.focusModels.add(element);
		}
	}


@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ANTENNATOARRAY", catalog="PUBLIC", joinColumns = { 
        @JoinColumn(name="ANTENNAID", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="ARRAYID", nullable=false, updatable=false) })
    public Set<Array> getArrays() {
        return this.arrays;
    }
    
    public void setArrays(Set<Array> arrays) {    
    	this.arrays = arrays;
    }

	public void addArrays(Set<Array> elements) {
		if( this.arrays != null )
			for(Iterator<Array> it = elements.iterator(); it.hasNext(); )
				addArrayToArrays((Array)it.next());
	}

	public void addArrayToArrays(Array element) {
		if( !this.arrays.contains(element) ) {
			this.arrays.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<PointingModel> getPointingModels() {
        return this.pointingModels;
    }
    
    public void setPointingModels(Set<PointingModel> pointingModels) {    
    	this.pointingModels = pointingModels;
    }

	public void addPointingModels(Set<PointingModel> elements) {
		if( this.pointingModels != null )
			for(Iterator<PointingModel> it = elements.iterator(); it.hasNext(); )
				addPointingModelToPointingModels((PointingModel)it.next());
	}

	public void addPointingModelToPointingModels(PointingModel element) {
		if( !this.pointingModels.contains(element) ) {
			this.pointingModels.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antennaByAntennaid")
    public Set<Holography> getHolographiesForAntennaid() {
        return this.holographiesForAntennaid;
    }
    
    public void setHolographiesForAntennaid(Set<Holography> holographiesForAntennaid) {    
    	this.holographiesForAntennaid = holographiesForAntennaid;
    }

	public void addHolographiesForAntennaid(Set<Holography> elements) {
		if( this.holographiesForAntennaid != null )
			for(Iterator<Holography> it = elements.iterator(); it.hasNext(); )
				addHolographyToHolographiesForAntennaid((Holography)it.next());
	}

	public void addHolographyToHolographiesForAntennaid(Holography element) {
		if( !this.holographiesForAntennaid.contains(element) ) {
			this.holographiesForAntennaid.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="antenna")
    public Set<AntennaToFrontEnd> getAntennaToFrontEnds() {
        return this.antennaToFrontEnds;
    }
    
    public void setAntennaToFrontEnds(Set<AntennaToFrontEnd> antennaToFrontEnds) {    
    	this.antennaToFrontEnds = antennaToFrontEnds;
    }

	public void addAntennaToFrontEnds(Set<AntennaToFrontEnd> elements) {
		if( this.antennaToFrontEnds != null )
			for(Iterator<AntennaToFrontEnd> it = elements.iterator(); it.hasNext(); )
				addAntennaToFrontEndToAntennaToFrontEnds((AntennaToFrontEnd)it.next());
	}

	public void addAntennaToFrontEndToAntennaToFrontEnds(AntennaToFrontEnd element) {
		if( !this.antennaToFrontEnds.contains(element) ) {
			this.antennaToFrontEnds.add(element);
		}
	}





}


