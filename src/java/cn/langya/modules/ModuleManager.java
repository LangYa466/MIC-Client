package cn.langya.modules;

/*
 * @author LangYa
 * @date 2024/2/25 22:13
 */


import cn.langya.Client;
import cn.langya.events.impl.misc.EventKey;
import cn.langya.events.impl.misc.EventTick;
import com.cubk.event.annotations.EventTarget;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Getter
@Setter
public class ModuleManager {

    List<Module> modules;

    public ModuleManager() {
        // 因为这个可以异步
        modules = new CopyOnWriteArrayList<>();
        Client.eventManager.register(this);

    }

    void addModule(Module m) {
        modules.add(m);
    }

    @EventTarget
    void onK(EventKey e) {
        for (Module module : modules) {
            if(module.keyCode == e.keyCode) module.toggle();
        }
    }

    @EventTarget
    void onT(EventTick e) {
        for (Module module : modules) {
            if(module.state) Client.eventManager.register(module); else Client.eventManager.unregister(module);
        }

    }





}
