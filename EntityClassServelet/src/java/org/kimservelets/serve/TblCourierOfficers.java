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
@Table(name = "tbl_courier_officers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCourierOfficers.findAll", query = "SELECT t FROM TblCourierOfficers t"),
    @NamedQuery(name = "TblCourierOfficers.findByCid", query = "SELECT t FROM TblCourierOfficers t WHERE t.cid = :cid"),
    @NamedQuery(name = "TblCourierOfficers.findByOfficerName", query = "SELECT t FROM TblCourierOfficers t WHERE t.officerName = :officerName"),
    @NamedQuery(name = "TblCourierOfficers.findByOffPwd", query = "SELECT t FROM TblCourierOfficers t WHERE t.offPwd = :offPwd"),
    @NamedQuery(name = "TblCourierOfficers.findByAddress", query = "SELECT t FROM TblCourierOfficers t WHERE t.address = :address"),
    @NamedQuery(name = "TblCourierOfficers.findByEmail", query = "SELECT t FROM TblCourierOfficers t WHERE t.email = :email"),
    @NamedQuery(name = "TblCourierOfficers.findByPhNo", query = "SELECT t FROM TblCourierOfficers t WHERE t.phNo = :phNo"),
    @NamedQuery(name = "TblCourierOfficers.findByOffice", query = "SELECT t FROM TblCourierOfficers t WHERE t.office = :office"),
    @NamedQuery(name = "TblCourierOfficers.findByRegDate", query = "SELECT t FROM TblCourierOfficers t WHERE t.regDate = :regDate")})
public class TblCourierOfficers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cid")
    private Integer cid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "officer_name")
    private String officerName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "off_pwd")
    private String offPwd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "address")
    private String address;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "ph_no")
    private String phNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "office")
    private String office;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reg_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regDate;

    public TblCourierOfficers() {
    }

    public TblCourierOfficers(Integer cid) {
        this.cid = cid;
    }

    public TblCourierOfficers(Integer cid, String officerName, String offPwd, String address, String email, String phNo, String office, Date regDate) {
        this.cid = cid;
        this.officerName = officerName;
        this.offPwd = offPwd;
        this.address = address;
        this.email = email;
        this.phNo = phNo;
        this.office = office;
        this.regDate = regDate;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getOffPwd() {
        return offPwd;
    }

    public void setOffPwd(String offPwd) {
        this.offPwd = offPwd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
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
        if (!(object instanceof TblCourierOfficers)) {
            return false;
        }
        TblCourierOfficers other = (TblCourierOfficers) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kimservelets.serve.TblCourierOfficers[ cid=" + cid + " ]";
    }
    
}
