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
@Table(name = "tbl_courier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCourier.findAll", query = "SELECT t FROM TblCourier t"),
    @NamedQuery(name = "TblCourier.findByCid", query = "SELECT t FROM TblCourier t WHERE t.cid = :cid"),
    @NamedQuery(name = "TblCourier.findByConsNo", query = "SELECT t FROM TblCourier t WHERE t.consNo = :consNo"),
    @NamedQuery(name = "TblCourier.findByShipName", query = "SELECT t FROM TblCourier t WHERE t.shipName = :shipName"),
    @NamedQuery(name = "TblCourier.findByPhone", query = "SELECT t FROM TblCourier t WHERE t.phone = :phone"),
    @NamedQuery(name = "TblCourier.findBySAdd", query = "SELECT t FROM TblCourier t WHERE t.sAdd = :sAdd"),
    @NamedQuery(name = "TblCourier.findByRevName", query = "SELECT t FROM TblCourier t WHERE t.revName = :revName"),
    @NamedQuery(name = "TblCourier.findByRPhone", query = "SELECT t FROM TblCourier t WHERE t.rPhone = :rPhone"),
    @NamedQuery(name = "TblCourier.findByRAdd", query = "SELECT t FROM TblCourier t WHERE t.rAdd = :rAdd"),
    @NamedQuery(name = "TblCourier.findByType", query = "SELECT t FROM TblCourier t WHERE t.type = :type"),
    @NamedQuery(name = "TblCourier.findByWeight", query = "SELECT t FROM TblCourier t WHERE t.weight = :weight"),
    @NamedQuery(name = "TblCourier.findByInviceNo", query = "SELECT t FROM TblCourier t WHERE t.inviceNo = :inviceNo"),
    @NamedQuery(name = "TblCourier.findByQty", query = "SELECT t FROM TblCourier t WHERE t.qty = :qty"),
    @NamedQuery(name = "TblCourier.findByBookMode", query = "SELECT t FROM TblCourier t WHERE t.bookMode = :bookMode"),
    @NamedQuery(name = "TblCourier.findByFreight", query = "SELECT t FROM TblCourier t WHERE t.freight = :freight"),
    @NamedQuery(name = "TblCourier.findByMode", query = "SELECT t FROM TblCourier t WHERE t.mode = :mode"),
    @NamedQuery(name = "TblCourier.findByPickDate", query = "SELECT t FROM TblCourier t WHERE t.pickDate = :pickDate"),
    @NamedQuery(name = "TblCourier.findByPickTime", query = "SELECT t FROM TblCourier t WHERE t.pickTime = :pickTime"),
    @NamedQuery(name = "TblCourier.findByStatus", query = "SELECT t FROM TblCourier t WHERE t.status = :status"),
    @NamedQuery(name = "TblCourier.findByComments", query = "SELECT t FROM TblCourier t WHERE t.comments = :comments"),
    @NamedQuery(name = "TblCourier.findByBookDate", query = "SELECT t FROM TblCourier t WHERE t.bookDate = :bookDate")})
public class TblCourier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cid")
    private Integer cid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cons_no")
    private String consNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ship_name")
    private String shipName;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "s_add")
    private String sAdd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "rev_name")
    private String revName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "r_phone")
    private String rPhone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "r_add")
    private String rAdd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weight")
    private double weight;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "invice_no")
    private String inviceNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qty")
    private int qty;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "book_mode")
    private String bookMode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "freight")
    private double freight;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "mode")
    private String mode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "pick_date")
    private String pickDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "pick_time")
    private String pickTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "comments")
    private String comments;
    @Basic(optional = false)
    @NotNull
    @Column(name = "book_date")
    @Temporal(TemporalType.DATE)
    private Date bookDate;

    public TblCourier() {
    }

    public TblCourier(Integer cid) {
        this.cid = cid;
    }

    public TblCourier(Integer cid, String consNo, String shipName, String phone, String sAdd, String revName, String rPhone, String rAdd, String type, double weight, String inviceNo, int qty, String bookMode, double freight, String mode, String pickDate, String pickTime, String status, String comments, Date bookDate) {
        this.cid = cid;
        this.consNo = consNo;
        this.shipName = shipName;
        this.phone = phone;
        this.sAdd = sAdd;
        this.revName = revName;
        this.rPhone = rPhone;
        this.rAdd = rAdd;
        this.type = type;
        this.weight = weight;
        this.inviceNo = inviceNo;
        this.qty = qty;
        this.bookMode = bookMode;
        this.freight = freight;
        this.mode = mode;
        this.pickDate = pickDate;
        this.pickTime = pickTime;
        this.status = status;
        this.comments = comments;
        this.bookDate = bookDate;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSAdd() {
        return sAdd;
    }

    public void setSAdd(String sAdd) {
        this.sAdd = sAdd;
    }

    public String getRevName() {
        return revName;
    }

    public void setRevName(String revName) {
        this.revName = revName;
    }

    public String getRPhone() {
        return rPhone;
    }

    public void setRPhone(String rPhone) {
        this.rPhone = rPhone;
    }

    public String getRAdd() {
        return rAdd;
    }

    public void setRAdd(String rAdd) {
        this.rAdd = rAdd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getInviceNo() {
        return inviceNo;
    }

    public void setInviceNo(String inviceNo) {
        this.inviceNo = inviceNo;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getBookMode() {
        return bookMode;
    }

    public void setBookMode(String bookMode) {
        this.bookMode = bookMode;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getPickDate() {
        return pickDate;
    }

    public void setPickDate(String pickDate) {
        this.pickDate = pickDate;
    }

    public String getPickTime() {
        return pickTime;
    }

    public void setPickTime(String pickTime) {
        this.pickTime = pickTime;
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

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cid != null ? cid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCourier)) {
            return false;
        }
        TblCourier other = (TblCourier) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kimservelets.serve.TblCourier[ cid=" + cid + " ]";
    }
    
}
