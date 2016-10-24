/**
 * This class is generated by jOOQ
 */
package com.iodesystems.iodecm.db.tables;


import com.iodesystems.iodecm.db.Keys;
import com.iodesystems.iodecm.db.Public;
import com.iodesystems.iodecm.db.tables.records.AclSidRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class AclSid extends TableImpl<AclSidRecord> {

    private static final long serialVersionUID = -1790834248;

    /**
     * The reference instance of <code>public.acl_sid</code>
     */
    public static final AclSid ACL_SID = new AclSid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AclSidRecord> getRecordType() {
        return AclSidRecord.class;
    }

    /**
     * The column <code>public.acl_sid.id</code>.
     */
    public final TableField<AclSidRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('acl_sid_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.acl_sid.principal</code>.
     */
    public final TableField<AclSidRecord, Boolean> PRINCIPAL = createField("principal", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.acl_sid.sid</code>.
     */
    public final TableField<AclSidRecord, String> SID = createField("sid", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * Create a <code>public.acl_sid</code> table reference
     */
    public AclSid() {
        this("acl_sid", null);
    }

    /**
     * Create an aliased <code>public.acl_sid</code> table reference
     */
    public AclSid(String alias) {
        this(alias, ACL_SID);
    }

    private AclSid(String alias, Table<AclSidRecord> aliased) {
        this(alias, aliased, null);
    }

    private AclSid(String alias, Table<AclSidRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AclSidRecord, Long> getIdentity() {
        return Keys.IDENTITY_ACL_SID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AclSidRecord> getPrimaryKey() {
        return Keys.ACL_SID_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AclSidRecord>> getKeys() {
        return Arrays.<UniqueKey<AclSidRecord>>asList(Keys.ACL_SID_PKEY, Keys.UNIQUE_UK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclSid as(String alias) {
        return new AclSid(alias, this);
    }

    /**
     * Rename this table
     */
    public AclSid rename(String name) {
        return new AclSid(name, null);
    }
}
