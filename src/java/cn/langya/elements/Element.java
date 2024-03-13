package cn.langya.elements;

/*
 * @author LangYa
 * @date 2024/2/25 22:13
 */


import cn.langya.utils.IMinecraft;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Element extends IMinecraft {
    boolean state;
    double x,y,moveX,moveY;

    public void draw() {}


}
