package me.cedric.siegegame.permissions;

public enum Permissions {

    BORDER_BYPASS("siegegame.bypass.border");

    private String permission;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}