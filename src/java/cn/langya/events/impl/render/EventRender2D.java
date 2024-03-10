package cn.langya.events.impl.render;

/*
 * @author LangYa
 * @date 2024/2/25 22:13
 */


import com.cubk.event.impl.Event;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.gui.ScaledResolution;


@Getter
@Setter
public class EventRender2D implements Event {
    ScaledResolution sr;
    float partialTicks;

    public EventRender2D(ScaledResolution sr, float partialTicks) {
        this.sr = sr;
        this.partialTicks = partialTicks;
    }
}
