/**
 * This class is generated by jOOQ
 */
package com.iodesystems.iodecm.db.tables.records;


import com.iodesystems.iodecm.db.tables.Authorities;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class AuthoritiesRecord extends TableRecordImpl<AuthoritiesRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1730373140;

    /**
     * Setter for <code>public.authorities.username</code>.
     */
    public void setUsername(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.authorities.username</code>.
     */
    public String getUsername() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.authorities.authority</code>.
     */
    public void setAuthority(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.authorities.authority</code>.
     */
    public String getAuthority() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Authorities.AUTHORITIES.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Authorities.AUTHORITIES.AUTHORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAuthority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthoritiesRecord value1(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthoritiesRecord value2(String value) {
        setAuthority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthoritiesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthoritiesRecord
     */
    public AuthoritiesRecord() {
        super(Authorities.AUTHORITIES);
    }

    /**
     * Create a detached, initialised AuthoritiesRecord
     */
    public AuthoritiesRecord(String username, String authority) {
        super(Authorities.AUTHORITIES);

        set(0, username);
        set(1, authority);
    }
}
