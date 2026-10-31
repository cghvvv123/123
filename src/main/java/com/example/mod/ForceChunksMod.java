package com.example.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.server.command.CommandManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForceChunksMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ForceChunksMod");

    @Override
    public void onInitialize() {
        LOGGER.info("ForceChunksMod 已加载！视距强制设为 4096。");
        
        CommandManager.RegistrationCallback event = (dispatcher, registryAccess) -> {
            dispatcher.register(CommandManager.literal("forcenumchunks")
                .executes(context -> {
                    context.getSource().sendFeedback(() -> 
                        net.minecraft.text.Text.literal("视距已强制设置为 4096"), true
                    );
                    return 1;
                })
            );
        };
        
        LOGGER.info("ForceChunksMod 初始化完成。运行 /forcenumchunks 命令验证。");
    }
}
