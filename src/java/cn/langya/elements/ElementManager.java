package cn.langya.elements;

/*
 * @author LangYa
 * @date 2024/2/25 22:13
 */


import cn.langya.Client;
import cn.langya.events.impl.render.EventRender2D;
import cn.langya.utils.IMinecraft;
import com.cubk.event.annotations.EventTarget;
import org.lwjgl.opengl.GL11;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ElementManager extends IMinecraft {

    List<Element> elements;

    public ElementManager() {
        elements = new CopyOnWriteArrayList<>();
        Client.eventManager.register(this);
    }

    @EventTarget
    void onR2D(EventRender2D e) {
        mc.fontRendererObj.drawString(Client.name,0,0,-1);

        for (Element element : elements) {
            GL11.glPopMatrix();
            element.draw();
            GL11.glPushMatrix();
        }
    }
}
