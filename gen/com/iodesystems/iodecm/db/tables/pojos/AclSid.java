/**
 * This class is generated by jOOQ
 */
package com.iodesystems.iodecm.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AclSid implements Serializable {

    private static final long serialVersionUID = -2026476161;

    private Long    id;
    private Boolean principal;
    private String  sid;

    public AclSid() {}

    public AclSid(AclSid value) {
        this.id = value.id;
        this.principal = value.principal;
        this.sid = value.sid;
    }

    public AclSid(
        Long    id,
        Boolean principal,
        String  sid
    ) {
        this.id = id;
        this.principal = principal;
        this.sid = sid;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AclSid (");

        sb.append(id);
        sb.append(", ").append(principal);
        sb.append(", ").append(sid);

        sb.append(")");
        return sb.toString();
    }
}
