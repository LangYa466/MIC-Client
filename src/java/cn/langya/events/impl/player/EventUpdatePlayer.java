package cn.langya.events.impl.player;

import com.cubk.event.impl.Event;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

@Getter
@Setter
public class EventUpdatePlayer implements Event {
    EntityPlayerSP entity;
    double x,y,z;
    float yaw,pitch;
    boolean onGround;

    public EventUpdatePlayer(EntityPlayerSP entity,double x,double y,double z,float yaw,float pitch,boolean onGround){
        this.entity = entity;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
    }

    void setRotations(float yaw,float pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
        Minecraft mc = Minecraft.getMinecraft();
        mc.thePlayer.renderArmPitch = pitch;
        mc.thePlayer.renderArmYaw = yaw;
    }

}
