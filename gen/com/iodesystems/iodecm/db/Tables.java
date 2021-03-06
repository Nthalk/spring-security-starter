/**
 * This class is generated by jOOQ
 */
package com.iodesystems.iodecm.db;


import com.iodesystems.iodecm.db.tables.AclClass;
import com.iodesystems.iodecm.db.tables.AclEntry;
import com.iodesystems.iodecm.db.tables.AclObjectIdentity;
import com.iodesystems.iodecm.db.tables.AclSid;
import com.iodesystems.iodecm.db.tables.Authorities;
import com.iodesystems.iodecm.db.tables.GroupAuthorities;
import com.iodesystems.iodecm.db.tables.GroupMembers;
import com.iodesystems.iodecm.db.tables.Groups;
import com.iodesystems.iodecm.db.tables.SchemaVersion;
import com.iodesystems.iodecm.db.tables.Users;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.acl_class</code>.
     */
    public static final AclClass ACL_CLASS = com.iodesystems.iodecm.db.tables.AclClass.ACL_CLASS;

    /**
     * The table <code>public.acl_entry</code>.
     */
    public static final AclEntry ACL_ENTRY = com.iodesystems.iodecm.db.tables.AclEntry.ACL_ENTRY;

    /**
     * The table <code>public.acl_object_identity</code>.
     */
    public static final AclObjectIdentity ACL_OBJECT_IDENTITY = com.iodesystems.iodecm.db.tables.AclObjectIdentity.ACL_OBJECT_IDENTITY;

    /**
     * The table <code>public.acl_sid</code>.
     */
    public static final AclSid ACL_SID = com.iodesystems.iodecm.db.tables.AclSid.ACL_SID;

    /**
     * The table <code>public.authorities</code>.
     */
    public static final Authorities AUTHORITIES = com.iodesystems.iodecm.db.tables.Authorities.AUTHORITIES;

    /**
     * The table <code>public.group_authorities</code>.
     */
    public static final GroupAuthorities GROUP_AUTHORITIES = com.iodesystems.iodecm.db.tables.GroupAuthorities.GROUP_AUTHORITIES;

    /**
     * The table <code>public.group_members</code>.
     */
    public static final GroupMembers GROUP_MEMBERS = com.iodesystems.iodecm.db.tables.GroupMembers.GROUP_MEMBERS;

    /**
     * The table <code>public.groups</code>.
     */
    public static final Groups GROUPS = com.iodesystems.iodecm.db.tables.Groups.GROUPS;

    /**
     * The table <code>public.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = com.iodesystems.iodecm.db.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>public.users</code>.
     */
    public static final Users USERS = com.iodesystems.iodecm.db.tables.Users.USERS;
}
