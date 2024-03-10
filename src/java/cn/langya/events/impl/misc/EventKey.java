package cn.langya.events.impl.misc;

/*
 * @author LangYa
 * @date 2024/2/25 22:13
 */


import com.cubk.event.impl.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventKey implements Event {
    public int keyCode;

    public EventKey(int keyCode) {
        this.keyCode = keyCode;
    }
}
