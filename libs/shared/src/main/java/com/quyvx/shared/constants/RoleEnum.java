package com.quyvx.shared.constants;

public enum RoleEnum {
    ADMIN_ROOT,

    MANAGER,

    USER;

    public String getValue() {
        return this.name();
    }

    public static RoleEnum getRole(String value) {
        for (RoleEnum role : RoleEnum.values()) {
            if (role.getValue().equals(value)) {
                return role;
            }
        }
        return null;
    }
}
