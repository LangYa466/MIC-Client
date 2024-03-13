package cn.langya;

/*
 * @author LangYa
 * @date 2024/2/25 22:13
 */


import cn.langya.elements.ElementManager;
import cn.langya.modules.ModuleManager;
import com.cubk.event.EventManager;
import org.lwjgl.opengl.Display;

public class Client {
    public static String name = "MIC";
    public static String version = "1.0";
    public static String author = "LangYa";

    //Manager
    public static EventManager eventManager;
    public static ModuleManager moduleManager;
    public static ElementManager elementManager;


    public static void init() {
        Display.setTitle(name);
        eventManager = new EventManager();
        moduleManager = new ModuleManager();
        elementManager = new ElementManager();
    }

    public static void stop() {

    }
}
