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
public class GroupMembers implements Serializable {

    private static final long serialVersionUID = 1020103459;

    private Integer id;
    private String  username;
    private Long    groupId;

    public GroupMembers() {}

    public GroupMembers(GroupMembers value) {
        this.id = value.id;
        this.username = value.username;
        this.groupId = value.groupId;
    }

    public GroupMembers(
        Integer id,
        String  username,
        Long    groupId
    ) {
        this.id = id;
        this.username = username;
        this.groupId = groupId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GroupMembers (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(groupId);

        sb.append(")");
        return sb.toString();
    }
}
