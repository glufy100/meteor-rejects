package anticope.rejects;

import anticope.rejects.commands.*;
import anticope.rejects.gui.hud.RadarHud;
import anticope.rejects.gui.themes.rounded.MeteorRoundedGuiTheme;
import anticope.rejects.modules.*;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.gui.GuiThemes;
import meteordevelopment.meteorclient.systems.Systems;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeteorRejectsAddon extends MeteorAddon {
    public static final Logger LOG = LoggerFactory.getLogger("Rejects");
    public static final Category Automation = new Category("Automation", Items.REDSTONE.getDefaultStack());
    public static final Category Build = new Category("Build", Items.BRICKS.getDefaultStack());
    public static final HudGroup HUD_GROUP = new HudGroup("Rejects");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Rejects Addon");

        // Modules
        Modules modules = Modules.get();
        modules.add(new AimAssist());
        modules.add(new AntiBot());
        modules.add(new AntiCrash());
        modules.add(new AntiSpawnpoint());
        modules.add(new AntiVanish());
        modules.add(new ArrowDmg());
        modules.add(new AutoBedTrap());
        modules.add(new AutoCraft());
        modules.add(new AutoExtinguish());
        modules.add(new AutoFarm());
        modules.add(new AutoGrind());
        modules.add(new AutoLogin());
        modules.add(new AutoPot());
        modules.add(new AutoSoup());
        modules.add(new AutoTNT());
        modules.add(new AutoWither());
        modules.add(new BoatGlitch());
        modules.add(new BlockIn());
        modules.add(new BoatPhase());
        modules.add(new Boost());
        modules.add(new BungeeCordSpoof());
        modules.add(new ChatBot());
        modules.add(new ChestAura());
        modules.add(new ChorusExploit());
        modules.add(new ColorSigns());
        modules.add(new Confuse());
        modules.add(new CoordLogger());
        modules.add(new CustomPackets());
        modules.add(new ExtraElytra());
        modules.add(new FullFlight());
        modules.add(new GamemodeNotifier());
        modules.add(new GhostMode());
        modules.add(new Glide());
        modules.add(new ItemGenerator());
        modules.add(new InteractionMenu());
        modules.add(new Jetpack());
        modules.add(new KnockbackPlus());
        modules.add(new LawnBot());
        modules.add(new Lavacast());
        modules.add(new MossBot());
        modules.add(new NewChunks());
        modules.add(new NoJumpDelay());
        modules.add(new ObsidianFarm());
        modules.add(new OreSim());
        modules.add(new PacketFly());
        modules.add(new Painter());
        modules.add(new Rendering());
        modules.add(new RoboWalk());
        modules.add(new ShieldBypass());
        modules.add(new SilentDisconnect());
        modules.add(new SkeletonESP());
        modules.add(new SoundLocator());
        modules.add(new TreeAura());
        modules.add(new VehicleOneHit());
        modules.add(new AutoEnchant());
        modules.add(new AutoRename());

        modules.add(new AirstrikePlus());
        modules.add(new AnHero());
        modules.add(new AutoCommand());
        modules.add(new AutoDisplays());
        modules.add(new AutoDrop());
        modules.add(new AutoLavaCaster());
        modules.add(new AutoMountain());
        modules.add(new AutoScoreboard());
        modules.add(new AutoStaircase());
        modules.add(new AutoTitles());
        modules.add(new BaseFinder());
        modules.add(new BlockListMineCommand());
        modules.add(new BoatKill());
        modules.add(new BookAndQuillDupe());
        modules.add(new BoomPlus());
        modules.add(new ExplosionAura());
        modules.add(new FlightAntikick());
        modules.add(new HandOfGod());
        modules.add(new HoleAndTunnelAndStairsESP());
        modules.add(new InstaMineNuker());
        modules.add(new InstantKill());
        modules.add(new InstaSafetyBox());        
        modules.add(new LavaAura());
        modules.add(new MaceKill());
        modules.add(new NbtEditor());
        modules.add(new NewerNewChunks());
        modules.add(new OPplayerTPmodule());
        modules.add(new OPServerKillModule());
        modules.add(new RedstoneNuker());
        modules.add(new ShulkerDupe());
        modules.add(new StorageLooter());
        modules.add(new Teleport());
        modules.add(new TPFly());
        modules.add(new TrailMaker());

        modules.add(new AfkLogout());
        modules.add(new AutoCenter());
        modules.add(new AutoWalkHIG());
        modules.add(new AxisViewer());
        modules.add(new HighwayBuilderHIG());
        modules.add(new HighwayTools());
        modules.add(new HotbarManager());
        modules.add(new LiquidFillerHIG());
        modules.add(new OffhandManager());
        modules.add(new ScaffoldHIG());
        modules.add(new AxisBorer());
        modules.add(new NegNegBorer());
        modules.add(new NegPosBorer());
        modules.add(new PosNegBorer());
        modules.add(new PosPosBorer());

        // Commands
        Commands.add(new CenterCommand());
        Commands.add(new ClearChatCommand());
        Commands.add(new GhostCommand());
        Commands.add(new GiveCommand());
        Commands.add(new HeadsCommand());
        Commands.add(new KickCommand());
        Commands.add(new LocateCommand());
        Commands.add(new PanicCommand());
        Commands.add(new ReconnectCommand());
        Commands.add(new ServerCommand());
        Commands.add(new SaveSkinCommand());
        Commands.add(new SeedCommand());
        Commands.add(new SetBlockCommand());
        Commands.add(new SetVelocityCommand());
        Commands.add(new TeleportCommand());
        Commands.add(new TerrainExport());
        Commands.add(new WorldInfoCommand());
        Commands.add(new ViewNbtCommand());
        Commands.add(new AutoVclipCommand());
        Commands.add(new AutoVaultClipCommand());
        Commands.add(new NewChunkCounter());
        Commands.add(new GarbageCleanerCommand());
        Commands.add(new LavaTimeCalculator());
        Commands.add(new CasterTimer());

        // HUD
        Hud hud = Systems.get(Hud.class);
        hud.register(RadarHud.INFO);

        // Themes
        GuiThemes.add(new MeteorRoundedGuiTheme());
    }


    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(Automation);
        Modules.registerCategory(Build);
    }
    

    @Override
    public String getWebsite() {
        return "https://github.com/AntiCope/meteor-rejects";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("AntiCope", "meteor-rejects");
    }

    @Override
    public String getCommit() {
        String commit = FabricLoader
                .getInstance()
                .getModContainer("meteor-rejects")
                .get().getMetadata()
                .getCustomValue("github:sha")
                .getAsString();
        LOG.info(String.format("Rejects version: %s", commit));
        return commit.isEmpty() ? null : commit.trim();
    }

    public String getPackage() {
        return "anticope.rejects";
    }
}
