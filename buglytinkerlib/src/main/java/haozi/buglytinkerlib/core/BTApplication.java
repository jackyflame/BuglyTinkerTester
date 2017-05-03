package haozi.buglytinkerlib.core;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by Android Studio.
 * ProjectName: shenbian_android_cloud_speaker
 * Author: yh
 * Date: 2017/5/3
 * Time: 11:39
 */

public class BTApplication extends TinkerApplication {

    public BTApplication() {
        //参数1：tinkerFlags 表示Tinker支持的类型 dex only、library only or all suuport，default: TINKER_ENABLE_ALL
        //参数2：delegateClassName Application代理类 这里填写你自定义的ApplicationLike
        //参数3：loaderClassName Tinker的加载器，使用默认即可
        //参数4：tinkerLoadVerifyFlag 加载dex或者lib是否验证md5，默认为false
        super(ShareConstants.TINKER_ENABLE_ALL, "haozi.buglytinkerlib.core.BTApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }

}
