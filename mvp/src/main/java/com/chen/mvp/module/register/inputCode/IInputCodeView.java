package com.chen.mvp.module.register.inputCode;

import com.chen.mvp.bean.BaseInfo;
import com.chen.mvp.module.base.IBaseView;

/**
 * Created by long on 17-4-7.
 */

public interface IInputCodeView extends IBaseView{

    /**
     * 显示用户信息
     * @param info
     */
    void loadInfo(BaseInfo info);

}
