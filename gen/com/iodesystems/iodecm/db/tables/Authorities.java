/**
 * This class is generated by jOOQ
 */
package com.iodesystems.iodecm.db.tables;


import com.iodesystems.iodecm.db.Keys;
import com.iodesystems.iodecm.db.Public;
import com.iodesystems.iodecm.db.tables.records.AuthoritiesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Authorities extends TableImpl<AuthoritiesRecord> {

    private static final long serialVersionUID = 1018796041;

    /**
     * The reference instance of <code>public.authorities</code>
     */
    public static final Authorities AUTHORITIES = new Authorities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthoritiesRecord> getRecordType() {
        return AuthoritiesRecord.class;
    }

    /**
     * The column <code>public.authorities.username</code>.
     */
    public final TableField<AuthoritiesRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>public.authorities.authority</code>.
     */
    public final TableField<AuthoritiesRecord, String> AUTHORITY = createField("authority", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>public.authorities</code> table reference
     */
    public Authorities() {
        this("authorities", null);
    }

    /**
     * Create an aliased <code>public.authorities</code> table reference
     */
    public Authorities(String alias) {
        this(alias, AUTHORITIES);
    }

    private Authorities(String alias, Table<AuthoritiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Authorities(String alias, Table<AuthoritiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AuthoritiesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AuthoritiesRecord, ?>>asList(Keys.AUTHORITIES__FK_AUTHORITIES_USERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Authorities as(String alias) {
        return new Authorities(alias, this);
    }

    /**
     * Rename this table
     */
    public Authorities rename(String name) {
        return new Authorities(name, null);
    }
}