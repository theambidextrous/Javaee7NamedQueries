/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kimservelets.serve;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Blade
 */
@Entity
@Table(name = "tbl_offices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblOffices.findAll", query = "SELECT t FROM TblOffices t"),
    @NamedQuery(name = "TblOffices.findById", query = "SELECT t FROM TblOffices t WHERE t.id = :id"),
    @NamedQuery(name = "TblOffices.findByOffName", query = "SELECT t FROM TblOffices t WHERE t.offName = :offName"),
    @NamedQuery(name = "TblOffices.findByAddress", query = "SELECT t FROM TblOffices t WHERE t.address = :address"),
    @NamedQuery(name = "TblOffices.findByCity", query = "SELECT t FROM TblOffices t WHERE t.city = :city"),
    @NamedQuery(name = "TblOffices.findByPhNo", query = "SELECT t FROM TblOffices t WHERE t.phNo = :phNo"),
    @NamedQuery(name = "TblOffices.findByOfficeTime", query = "SELECT t FROM TblOffices t WHERE t.officeTime = :officeTime"),
    @NamedQuery(name = "TblOffices.findByContactPerson", query = "SELECT t FROM TblOffices t WHERE t.contactPerson = :contactPerson")})
public class TblOffices implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "off_name")
    private String offName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 230)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ph_no")
    private String phNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "office_time")
    private String officeTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "contact_person")
    private String contactPerson;

    public TblOffices() {
    }

    public TblOffices(Integer id) {
        this.id = id;
    }

    public TblOffices(Integer id, String offName, String address, String city, String phNo, String officeTime, String contactPerson) {
        this.id = id;
        this.offName = offName;
        this.address = address;
        this.city = city;
        this.phNo = phNo;
        this.officeTime = officeTime;
        this.contactPerson = contactPerson;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOffName() {
        return offName;
    }

    public void setOffName(String offName) {
        this.offName = offName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(String officeTime) {
        this.officeTime = officeTime;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
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
        if (!(object instanceof TblOffices)) {
            return false;
        }
        TblOffices other = (TblOffices) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kimservelets.serve.TblOffices[ id=" + id + " ]";
    }
    
}
