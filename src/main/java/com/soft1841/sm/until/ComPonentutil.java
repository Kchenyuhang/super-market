package com.soft1841.sm.until;
/**
 * @auther 柳磊磊
 *2018 12.26
 */

import javafx.scene.control.Button;

public class ComPonentutil{
    //根据传入的文字和主题返回一个按钮
    public static Button getButton(String text, String theme){
        Button button = new Button ( text );
        button.getStyleClass ().add ( theme );
        return button;
    }
}

