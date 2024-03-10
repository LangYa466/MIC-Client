package cn.langya.modules;

/*
 * @author LangYa
 * @date 2024/2/25 22:13
 */


import cn.langya.utils.IMinecraft;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Module extends IMinecraft {
    String name;
    boolean state;
    Category category;
    int keyCode;

    public Module(String name, Category category, int keyCode){
        this.name = name;
        this.category = category;
        this.keyCode = keyCode;
    }

    public Module(String name, Category category){
        this.name = name;
        this.category = category;
        this.keyCode = 0;
    }

    void toggle() {
        state = !state;
    }


}
