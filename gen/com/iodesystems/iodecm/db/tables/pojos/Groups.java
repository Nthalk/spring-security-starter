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
public class Groups implements Serializable {

    private static final long serialVersionUID = -1578710715;

    private Integer id;
    private String  groupName;

    public Groups() {}

    public Groups(Groups value) {
        this.id = value.id;
        this.groupName = value.groupName;
    }

    public Groups(
        Integer id,
        String  groupName
    ) {
        this.id = id;
        this.groupName = groupName;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Groups (");

        sb.append(id);
        sb.append(", ").append(groupName);

        sb.append(")");
        return sb.toString();
    }
}