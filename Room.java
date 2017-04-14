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
@Table(name = "ROOM", catalog = "", schema = "LOCALHOST2")
@NamedQueries({
    @NamedQuery(name = "Room.findAll", query = "SELECT r FROM Room r")
    , @NamedQuery(name = "Room.findByRoomId", query = "SELECT r FROM Room r WHERE r.roomId = :roomId")
    , @NamedQuery(name = "Room.findByRoomNo", query = "SELECT r FROM Room r WHERE r.roomNo = :roomNo")
    , @NamedQuery(name = "Room.findByRoomOccupancy", query = "SELECT r FROM Room r WHERE r.roomOccupancy = :roomOccupancy")
    , @NamedQuery(name = "Room.findByRoomType", query = "SELECT r FROM Room r WHERE r.roomType = :roomType")
    , @NamedQuery(name = "Room.findByRoomPrice", query = "SELECT r FROM Room r WHERE r.roomPrice = :roomPrice")
    , @NamedQuery(name = "Room.findByRoomDesc", query = "SELECT r FROM Room r WHERE r.roomDesc = :roomDesc")
    , @NamedQuery(name = "Room.findByHotelId", query = "SELECT r FROM Room r WHERE r.hotelId = :hotelId")})
public class Room implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ROOM_ID")
    private BigDecimal roomId;
    @Column(name = "ROOM_NO")
    private BigInteger roomNo;
    @Column(name = "ROOM_OCCUPANCY")
    private BigInteger roomOccupancy;
    @Column(name = "ROOM_TYPE")
    private String roomType;
    @Column(name = "ROOM_PRICE")
    private BigDecimal roomPrice;
    @Column(name = "ROOM_DESC")
    private String roomDesc;
    @Column(name = "HOTEL_ID")
    private BigInteger hotelId;

    public Room() {
    }

    public Room(BigDecimal roomId) {
        this.roomId = roomId;
    }

    public BigDecimal getRoomId() {
        return roomId;
    }

    public void setRoomId(BigDecimal roomId) {
        BigDecimal oldRoomId = this.roomId;
        this.roomId = roomId;
        changeSupport.firePropertyChange("roomId", oldRoomId, roomId);
    }

    public BigInteger getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(BigInteger roomNo) {
        BigInteger oldRoomNo = this.roomNo;
        this.roomNo = roomNo;
        changeSupport.firePropertyChange("roomNo", oldRoomNo, roomNo);
    }

    public BigInteger getRoomOccupancy() {
        return roomOccupancy;
    }

    public void setRoomOccupancy(BigInteger roomOccupancy) {
        BigInteger oldRoomOccupancy = this.roomOccupancy;
        this.roomOccupancy = roomOccupancy;
        changeSupport.firePropertyChange("roomOccupancy", oldRoomOccupancy, roomOccupancy);
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        String oldRoomType = this.roomType;
        this.roomType = roomType;
        changeSupport.firePropertyChange("roomType", oldRoomType, roomType);
    }

    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(BigDecimal roomPrice) {
        BigDecimal oldRoomPrice = this.roomPrice;
        this.roomPrice = roomPrice;
        changeSupport.firePropertyChange("roomPrice", oldRoomPrice, roomPrice);
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        String oldRoomDesc = this.roomDesc;
        this.roomDesc = roomDesc;
        changeSupport.firePropertyChange("roomDesc", oldRoomDesc, roomDesc);
    }

    public BigInteger getHotelId() {
        return hotelId;
    }

    public void setHotelId(BigInteger hotelId) {
        BigInteger oldHotelId = this.hotelId;
        this.hotelId = hotelId;
        changeSupport.firePropertyChange("hotelId", oldHotelId, hotelId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomId != null ? roomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.roomId == null && other.roomId != null) || (this.roomId != null && !this.roomId.equals(other.roomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotelmanagementsystem.Room[ roomId=" + roomId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
