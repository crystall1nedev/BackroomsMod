package com.lumination.backrooms.client;

import com.lumination.backrooms.BackroomsMod;
import com.lumination.backrooms.BackroomsModClient;
import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

public class Discord {
    private static final DiscordRichPresence presence = new DiscordRichPresence();
    private static String currentTitle;
    private static String currentSubtitle;
    private static String currentImgKey;
    private static final DiscordEventHandlers handlers = new DiscordEventHandlers();

    private static boolean initialized = false;

    /**
     * Start Rich Presence
     */
    public static void initDiscord() {
        if (initialized) return;
        DiscordRPC.discordInitialize(BackroomsRPC.appId, handlers, true);
        BackroomsMod.print("Starting Discord");
        Discord.initialized = true;
    }

    /**
     * Set the Discord Rich Presence
     *
     * @param title    The first line of the Rich Presence
     * @param subtitle The second line of Rich Presence<br>(contains playerCount/maxPlayer)
     * @param iconKey  The icon key.<br><br><b>keys:</b><br>- async<br>- lumaa
     * @param playerCount The amount of players in the server (1 if singleplayer)<br><b>DISABLED</b>
     * @param maxPlayer The amount of max players in the server (1 if singleplayer)<br><b>DISABLED</b>
     */
    public static void setPresence(String title, String subtitle, String iconKey, int playerCount, int maxPlayer) {
        currentTitle = title;
        currentSubtitle = subtitle;
        currentImgKey = iconKey;

        presence.details = title;
        presence.state = subtitle;
        presence.smallImageKey = "lumaa";
        presence.smallImageText = "By Lumaa";
        presence.largeImageKey = iconKey;
        presence.largeImageText = "A-Sync Corporation";
        presence.startTimestamp = BackroomsModClient.start;
        presence.partySize = playerCount;
        presence.partyMax = maxPlayer;

        DiscordRPC.discordUpdatePresence(presence);
    }

    /**
     * Set the Discord Rich Presence
     *
     * @param title    The first line of the Rich Presence
     * @param subtitle The second line of Rich Presence<br>(contains playerCount/maxPlayer)
     * @param iconKey  The icon key.<br><br><b>keys:</b><br>- async<br>- lumaa
     */
    public static void setPresence(String title, String subtitle, String iconKey) {
        setPresence(title, subtitle, iconKey, 0, 0);
    }

    /**
     * Default Rich Presence if CustomLabel doesn't work
     */
    public static void setDefaultPresence() {
        setPresence("The Backrooms Mod", "By Lumaa", "async", 0, 0);
    }

    protected static DiscordRichPresence getPresence() {
        return presence;
    }

    protected static void shutdown() {
        DiscordRPC.discordShutdown();
    }
}