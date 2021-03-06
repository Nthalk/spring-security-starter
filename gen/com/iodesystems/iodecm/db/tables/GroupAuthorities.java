/**
 * This class is generated by jOOQ
 */
package com.iodesystems.iodecm.db.tables;


import com.iodesystems.iodecm.db.Keys;
import com.iodesystems.iodecm.db.Public;
import com.iodesystems.iodecm.db.tables.records.GroupAuthoritiesRecord;

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
public class GroupAuthorities extends TableImpl<GroupAuthoritiesRecord> {

    private static final long serialVersionUID = -1409721951;

    /**
     * The reference instance of <code>public.group_authorities</code>
     */
    public static final GroupAuthorities GROUP_AUTHORITIES = new GroupAuthorities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupAuthoritiesRecord> getRecordType() {
        return GroupAuthoritiesRecord.class;
    }

    /**
     * The column <code>public.group_authorities.group_id</code>.
     */
    public final TableField<GroupAuthoritiesRecord, Long> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.group_authorities.authority</code>.
     */
    public final TableField<GroupAuthoritiesRecord, String> AUTHORITY = createField("authority", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>public.group_authorities</code> table reference
     */
    public GroupAuthorities() {
        this("group_authorities", null);
    }

    /**
     * Create an aliased <code>public.group_authorities</code> table reference
     */
    public GroupAuthorities(String alias) {
        this(alias, GROUP_AUTHORITIES);
    }

    private GroupAuthorities(String alias, Table<GroupAuthoritiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupAuthorities(String alias, Table<GroupAuthoritiesRecord> aliased, Field<?>[] parameters) {
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
    public List<ForeignKey<GroupAuthoritiesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GroupAuthoritiesRecord, ?>>asList(Keys.GROUP_AUTHORITIES__FK_GROUP_AUTHORITIES_GROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupAuthorities as(String alias) {
        return new GroupAuthorities(alias, this);
    }

    /**
     * Rename this table
     */
    public GroupAuthorities rename(String name) {
        return new GroupAuthorities(name, null);
    }
}
