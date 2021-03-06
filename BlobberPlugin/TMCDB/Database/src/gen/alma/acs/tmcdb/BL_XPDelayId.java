package alma.acs.tmcdb;
// Generated Jan 25, 2018 5:26:44 PM by Hibernate Tools 4.3.1.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BL_XPDelayId generated by hbm2java
 */
@SuppressWarnings("serial")
@Embeddable
public class BL_XPDelayId  implements java.io.Serializable {


     private Integer version;
     private Long modTime;
     private BL_XPDelayOp operation;
     private Integer XPDelayId;

    public BL_XPDelayId() {
    }
   


    @Column(name="`VERSION`", nullable=false)
    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {    
    	this.version = version;
    }



    @Column(name="`MODTIME`", nullable=false)
    public Long getModTime() {
        return this.modTime;
    }
    
    public void setModTime(Long modTime) {    
    	this.modTime = modTime;
    }



    @Column(name="`OPERATION`", nullable=false, length=1)
    public BL_XPDelayOp getOperation() {
        return this.operation;
    }
    
    public void setOperation(BL_XPDelayOp operation) {    
    	this.operation = operation;
    }



    @Column(name="`XPDELAYID`", nullable=false)
    public Integer getXPDelayId() {
        return this.XPDelayId;
    }
    
    public void setXPDelayId(Integer XPDelayId) {    
    	this.XPDelayId = XPDelayId;
    }



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BL_XPDelayId) ) return false;
		 BL_XPDelayId castOther = ( BL_XPDelayId ) other;

		 return ( (this.getVersion()==castOther.getVersion()) || ( this.getVersion()!=null && castOther.getVersion()!=null && this.getVersion().equals(castOther.getVersion()) ) )
 && ( (this.getModTime()==castOther.getModTime()) || ( this.getModTime()!=null && castOther.getModTime()!=null && this.getModTime().equals(castOther.getModTime()) ) )
 && ( (this.getOperation()==castOther.getOperation()) || ( this.getOperation()!=null && castOther.getOperation()!=null && this.getOperation().equals(castOther.getOperation()) ) )
 && ( (this.getXPDelayId()==castOther.getXPDelayId()) || ( this.getXPDelayId()!=null && castOther.getXPDelayId()!=null && this.getXPDelayId().equals(castOther.getXPDelayId()) ) );
   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getVersion() == null ? 0 : this.getVersion().hashCode() );
         result = 37 * result + ( getModTime() == null ? 0 : this.getModTime().hashCode() );
         result = 37 * result + ( getOperation() == null ? 0 : this.getOperation().hashCode() );
         result = 37 * result + ( getXPDelayId() == null ? 0 : this.getXPDelayId().hashCode() );
         return result;
   }


}


