/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kimservelets.serve;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Blade
 */
@Entity
@Table(name = "tbl_courier_track")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCourierTrack.findAll", query = "SELECT t FROM TblCourierTrack t"),
    @NamedQuery(name = "TblCourierTrack.findById", query = "SELECT t FROM TblCourierTrack t WHERE t.id = :id"),
    @NamedQuery(name = "TblCourierTrack.findByCid", query = "SELECT t FROM TblCourierTrack t WHERE t.cid = :cid"),
    @NamedQuery(name = "TblCourierTrack.findByConsNo", query = "SELECT t FROM TblCourierTrack t WHERE t.consNo = :consNo"),
    @NamedQuery(name = "TblCourierTrack.findByCurrentCity", query = "SELECT t FROM TblCourierTrack t WHERE t.currentCity = :currentCity"),
    @NamedQuery(name = "TblCourierTrack.findByStatus", query = "SELECT t FROM TblCourierTrack t WHERE t.status = :status"),
    @NamedQuery(name = "TblCourierTrack.findByComments", query = "SELECT t FROM TblCourierTrack t WHERE t.comments = :comments"),
    @NamedQuery(name = "TblCourierTrack.findByBkTime", query = "SELECT t FROM TblCourierTrack t WHERE t.bkTime = :bkTime")})
public class TblCourierTrack implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cid")
    private int cid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cons_no")
    private String consNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "current_city")
    private String currentCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "comments")
    private String comments;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bk_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bkTime;

    public TblCourierTrack() {
    }

    public TblCourierTrack(Integer id) {
        this.id = id;
    }

    public TblCourierTrack(Integer id, int cid, String consNo, String currentCity, String status, String comments, Date bkTime) {
        this.id = id;
        this.cid = cid;
        this.consNo = consNo;
        this.currentCity = currentCity;
        this.status = status;
        this.comments = comments;
        this.bkTime = bkTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getBkTime() {
        return bkTime;
    }

    public void setBkTime(Date bkTime) {
        this.bkTime = bkTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCourierTrack)) {
            return false;
        }
        TblCourierTrack other = (TblCourierTrack) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kimservelets.serve.TblCourierTrack[ id=" + id + " ]";
    }
    
}
