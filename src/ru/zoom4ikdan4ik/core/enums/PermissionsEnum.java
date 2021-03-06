package ru.zoom4ikdan4ik.core.enums;

import org.bukkit.command.CommandSender;
import ru.zoom4ikdan4ik.core.api.interfaces.enums.IPermissions;
import ru.zoom4ikdan4ik.core.interfaces.IBase;

public enum PermissionsEnum implements IPermissions, IBase {
    RELOAD("zd.core." + CommandsEnum.RELOAD.getSubCommand().toLowerCase()),
    SCRIPT("zd.core." + CommandsEnum.SCRIPT.getSubCommand().toLowerCase()),
    UNIX("zd.core." + CommandsEnum.UNIX.getSubCommand().toLowerCase()),
    ID("zd.core." + CommandsEnum.ID.getSubCommand().toLowerCase());

    private String permission;

    PermissionsEnum(final String permission) {
        this.permission = permission;
    }

    @Override
    public final String getName() {
        return this.name();
    }

    @Override
    public final String getPermission() {
        return this.permission;
    }

    @Override
    public final void setPermission(final String permission) {
        this.permission = permission;
    }

    @Override
    public final boolean hasPermission(final CommandSender commandSender) {
        return commandSender.hasPermission(this.permission);
    }
}
