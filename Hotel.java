/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Hitman
 */
@Entity
@Table(name = "HOTEL", catalog = "", schema = "LOCALHOST1")
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
    , @NamedQuery(name = "Hotel.findByHotelId", query = "SELECT h FROM Hotel h WHERE h.hotelId = :hotelId")
    , @NamedQuery(name = "Hotel.findByHotelName", query = "SELECT h FROM Hotel h WHERE h.hotelName = :hotelName")
    , @NamedQuery(name = "Hotel.findByHotelType", query = "SELECT h FROM Hotel h WHERE h.hotelType = :hotelType")
    , @NamedQuery(name = "Hotel.findByHotelConstYear", query = "SELECT h FROM Hotel h WHERE h.hotelConstYear = :hotelConstYear")
    , @NamedQuery(name = "Hotel.findByHotelCountry", query = "SELECT h FROM Hotel h WHERE h.hotelCountry = :hotelCountry")
    , @NamedQuery(name = "Hotel.findByHotelCity", query = "SELECT h FROM Hotel h WHERE h.hotelCity = :hotelCity")
    , @NamedQuery(name = "Hotel.findByHotelAddress", query = "SELECT h FROM Hotel h WHERE h.hotelAddress = :hotelAddress")
    , @NamedQuery(name = "Hotel.findByHotelContact", query = "SELECT h FROM Hotel h WHERE h.hotelContact = :hotelContact")
    , @NamedQuery(name = "Hotel.findByHotelEmail", query = "SELECT h FROM Hotel h WHERE h.hotelEmail = :hotelEmail")})
public class Hotel implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "HOTEL_ID")
    private BigDecimal hotelId;
    @Column(name = "HOTEL_NAME")
    private String hotelName;
    @Column(name = "HOTEL_TYPE")
    private String hotelType;
    @Column(name = "HOTEL_CONST_YEAR")
    private BigInteger hotelConstYear;
    @Column(name = "HOTEL_COUNTRY")
    private String hotelCountry;
    @Column(name = "HOTEL_CITY")
    private String hotelCity;
    @Column(name = "HOTEL_ADDRESS")
    private String hotelAddress;
    @Column(name = "HOTEL_CONTACT")
    private BigInteger hotelContact;
    @Column(name = "HOTEL_EMAIL")
    private String hotelEmail;

    public Hotel() {
    }

    public Hotel(BigDecimal hotelId) {
        this.hotelId = hotelId;
    }

    public BigDecimal getHotelId() {
        return hotelId;
    }

    public void setHotelId(BigDecimal hotelId) {
        BigDecimal oldHotelId = this.hotelId;
        this.hotelId = hotelId;
        changeSupport.firePropertyChange("hotelId", oldHotelId, hotelId);
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        String oldHotelName = this.hotelName;
        this.hotelName = hotelName;
        changeSupport.firePropertyChange("hotelName", oldHotelName, hotelName);
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        String oldHotelType = this.hotelType;
        this.hotelType = hotelType;
        changeSupport.firePropertyChange("hotelType", oldHotelType, hotelType);
    }

    public BigInteger getHotelConstYear() {
        return hotelConstYear;
    }

    public void setHotelConstYear(BigInteger hotelConstYear) {
        BigInteger oldHotelConstYear = this.hotelConstYear;
        this.hotelConstYear = hotelConstYear;
        changeSupport.firePropertyChange("hotelConstYear", oldHotelConstYear, hotelConstYear);
    }

    public String getHotelCountry() {
        return hotelCountry;
    }

    public void setHotelCountry(String hotelCountry) {
        String oldHotelCountry = this.hotelCountry;
        this.hotelCountry = hotelCountry;
        changeSupport.firePropertyChange("hotelCountry", oldHotelCountry, hotelCountry);
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        String oldHotelCity = this.hotelCity;
        this.hotelCity = hotelCity;
        changeSupport.firePropertyChange("hotelCity", oldHotelCity, hotelCity);
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        String oldHotelAddress = this.hotelAddress;
        this.hotelAddress = hotelAddress;
        changeSupport.firePropertyChange("hotelAddress", oldHotelAddress, hotelAddress);
    }

    public BigInteger getHotelContact() {
        return hotelContact;
    }

    public void setHotelContact(BigInteger hotelContact) {
        BigInteger oldHotelContact = this.hotelContact;
        this.hotelContact = hotelContact;
        changeSupport.firePropertyChange("hotelContact", oldHotelContact, hotelContact);
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        String oldHotelEmail = this.hotelEmail;
        this.hotelEmail = hotelEmail;
        changeSupport.firePropertyChange("hotelEmail", oldHotelEmail, hotelEmail);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hotelId != null ? hotelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.hotelId == null && other.hotelId != null) || (this.hotelId != null && !this.hotelId.equals(other.hotelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotelmanagementsystem.Hotel[ hotelId=" + hotelId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
