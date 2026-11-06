package top.gregtao.xibaopp.util;

import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;

public class RenderHelper {
    public static void renderStretchTexture(DrawContext context, int width, int height, int light, Identifier source) {
        // Draw the full texture (uv 0..1) stretched over the whole screen, tinted by light.
        // textureWidth/Height and u/v region (256, 256) yield uv 0..1 regardless of the actual image size.
        context.drawTexture(RenderPipelines.GUI_TEXTURED, source,
                0, 0, 0.0F, 0.0F, width, height, 256, 256, 256, 256,
                0xFF000000 | light << 16 | light << 8 | light);
    }

    public static void renderParticle(DrawContext context, int x, int y, int width, int height, Identifier source) {
        context.drawTexture(RenderPipelines.GUI_TEXTURED, source,
                x, y, 0.0F, 0.0F, width, height, 256, 256, 256, 256, 0xFFFFFFFF);
    }
}
