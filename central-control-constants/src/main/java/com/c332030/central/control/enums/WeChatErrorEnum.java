package com.c332030.central.control.enums;

import java.util.Map;
import java.util.Optional;

import com.c332030.central.control.enums.base.CCErrorTypeEnum;
import com.c332030.central.control.enums.base.ICCErrorEnum;
import com.c332030.util.data.CEnumUtils;

/**
 * <p>
 * Description: WeChatErrorEnum
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
public enum WeChatErrorEnum implements ICCErrorEnum<Integer> {

    BUSY(-1, "系统繁忙"),
    _0("请求成功"),
    _40001("获取 access_token 时 AppSecret 错误，或者 access_token 无效。请开发者认真比对 AppSecret 的正确性，或查看是否正在为恰当的公众号调用接口"
        , CCErrorTypeEnum.TOKEN_EXPIRE),
    _40002("不合法的凭证类型"),
    _40003("不合法的 OpenID ，请开发者确认 OpenID （该用户）是否已关注公众号，或是否是其他公众号的 OpenID"),
    _40004("不合法的媒体文件类型"),
    _40005("不合法的文件类型"),
    _40006("不合法的文件大小"),
    _40007("不合法的媒体文件 id"),
    _40008("不合法的消息类型"),
    _40009("不合法的图片文件大小"),
    _40010("不合法的语音文件大小"),
    _40011("不合法的视频文件大小"),
    _40012("不合法的缩略图文件大小"),
    _40013("不合法的 AppID ，请开发者检查 AppID 的正确性，避免异常字符，注意大小写"),
    _40014("不合法的 access_token ，请开发者认真比对 access_token 的有效性（如是否过期），或查看是否正在为恰当的公众号调用接口"
        , CCErrorTypeEnum.TOKEN_EXPIRE),
    _40015("不合法的菜单类型"),
    _40016("不合法的按钮个数"),
    _40017("不合法的按钮类型"),
    _40018("不合法的按钮名字长度"),
    _40019("不合法的按钮 KEY 长度"),
    _40020("不合法的按钮 URL 长度"),
    _40021("不合法的菜单版本号"),
    _40022("不合法的子菜单级数"),
    _40023("不合法的子菜单按钮个数"),
    _40024("不合法的子菜单按钮类型"),
    _40025("不合法的子菜单按钮名字长度"),
    _40026("不合法的子菜单按钮 KEY 长度"),
    _40027("不合法的子菜单按钮 URL 长度"),
    _40028("不合法的自定义菜单使用用户"),
    _40029("无效的 oauth_code"),
    _40030("不合法的 refresh_token"),
    _40031("不合法的 openid 列表"),
    _40032("不合法的 openid 列表长度"),
    _40033("不合法的请求字符，不能包含 \\uxxxx 格式的字符"),
    _40035("不合法的参数"),
    _40038("不合法的请求格式"),
    _40039("不合法的 URL 长度"),
    _40048("无效的url"),
    _40050("不合法的分组 id"),
    _40051("分组名字不合法"),
    _40060("删除单篇图文时，指定的 article_idx 不合法"),
    _40117("分组名字不合法"),
    _40118("media_id 大小不合法"),
    _40119("button 类型错误"),
    _40120("子 button 类型错误"),
    _40121("不合法的 media_id 类型"),
    _40125("无效的appsecret"),
    _40132("微信号不合法"),
    _40137("不支持的图片格式"),
    _40155("请勿添加其他公众号的主页链接"),
    _40163("oauth_code已使用"),
    _41001("缺少 access_token 参数", CCErrorTypeEnum.TOKEN_EMPTY),
    _41002("缺少 appid 参数"),
    _41003("缺少 refresh_token 参数"),
    _41004("缺少 secret 参数"),
    _41005("缺少多媒体文件数据"),
    _41006("缺少 media_id 参数"),
    _41007("缺少子菜单数据"),
    _41008("缺少 oauth code"),
    _41009("缺少 openid"),
    _42001("access_token 超时，请检查 access_token 的有效期，请参考基础支持 - 获取 access_token 中，对 access_token 的详细机制说明"
        , CCErrorTypeEnum.TOKEN_EXPIRE),
    _42002("refresh_token 超时"),
    _42003("oauth_code 超时"),
    _42007("用户修改微信密码， accesstoken 和 refreshtoken 失效，需要重新授权"
        , CCErrorTypeEnum.TOKEN_EXPIRE),
    _43001("需要 GET 请求"),
    _43002("需要 POST 请求"),
    _43003("需要 HTTPS 请求"),
    _43004("需要接收者关注"),
    _43005("需要好友关系"),
    _43019("需要将接收者从黑名单中移除"),
    _44001("多媒体文件为空"),
    _44002("POST 的数据包为空"),
    _44003("图文消息内容为空"),
    _44004("文本消息内容为空"),
    _45001("多媒体文件大小超过限制"),
    _45002("消息内容超过限制"),
    _45003("标题字段超过限制"),
    _45004("描述字段超过限制"),
    _45005("链接字段超过限制"),
    _45006("图片链接字段超过限制"),
    _45007("语音播放时间超过限制"),
    _45008("图文消息超过限制"),
    _45009("接口调用超过限制"),
    _45010("创建菜单个数超过限制"),
    _45011("API 调用太频繁，请稍候再试"),
    _45015("回复时间超过限制"),
    _45016("系统分组，不允许修改"),
    _45017("分组名字过长"),
    _45018("分组数量超过上限"),
    _45047("客服接口下行条数超过上限"),
    _45064("创建菜单包含未关联的小程序"),
    _45065("相同 clientmsgid 已存在群发记录，返回数据中带有已存在的群发任务的 msgid"),
    _45066("相同 clientmsgid 重试速度过快，请间隔1分钟重试"),
    _45067("clientmsgid 长度超过限制"),
    _46001("不存在媒体数据"),
    _46002("不存在的菜单版本"),
    _46003("不存在的菜单数据"),
    _46004("不存在的用户"),
    _47001("解析 JSON/XML 内容错误"),
    _48001("api 功能未授权，请确认公众号已获得该接口，可以在公众平台官网 - 开发者中心页中查看接口权限"),
    _48002("粉丝拒收消息（粉丝在公众号选项中，关闭了 “ 接收消息 ” ）"),
    _48004("api 接口被封禁，请登录 mp.weixin.qq.com 查看详情"),
    _48005("api 禁止删除被自动回复和自定义菜单引用的素材"),
    _48006("api 禁止清零调用次数，因为清零次数达到上限"),
    _48008("没有该类型消息的发送权限"),
    _50001("用户未授权该 api"),
    _50002("用户受限，可能是违规后接口被封禁"),
    _50005("用户未关注公众号"),
    _61451("参数错误 (invalid parameter)"),
    _61452("无效客服账号 (invalid kf_account)"),
    _61453("客服帐号已存在 (kf_account exsited)"),
    _61454("客服帐号名长度超过限制 ( 仅允许 10 个英文字符，不包括 @ 及 @ 后的公众号的微信号 )(invalid   kf_acount length)"),
    _61455("客服帐号名包含非法字符 ( 仅允许英文 + 数字 )(illegal character in     kf_account)"),
    _61456("客服帐号个数超过限制 (10 个客服账号 )(kf_account count exceeded)"),
    _61457("无效头像文件类型 (invalid   file type)"),
    _61450("系统错误 (system error)"),
    _61500("日期格式错误"),
    _63001("部分参数为空"),
    _63002("无效的签名"),
    _65301("不存在此 menuid 对应的个性化菜单"),
    _65302("没有相应的用户"),
    _65303("没有默认菜单，不能创建个性化菜单"),
    _65304("MatchRule 信息为空"),
    _65305("个性化菜单数量受限"),
    _65306("不支持个性化菜单的帐号"),
    _65307("个性化菜单信息为空"),
    _65308("包含没有响应类型的 button"),
    _65309("个性化菜单开关处于关闭状态"),
    _65310("填写了省份或城市信息，国家信息不能为空"),
    _65311("填写了城市信息，省份信息不能为空"),
    _65312("不合法的国家信息"),
    _65313("不合法的省份信息"),
    _65314("不合法的城市信息"),
    _65316("该公众号的菜单设置了过多的域名外跳（最多跳转到 3 个域名的链接）"),
    _65317("不合法的 URL"),
    _87009("无效的签名"),
    _9001001("POST 数据参数不合法"),
    _9001002("远端服务不可用"),
    _9001003("Ticket 不合法"),
    _9001004("获取摇周边用户信息失败"),
    _9001005("获取商户信息失败"),
    _9001006("获取 OpenID 失败"),
    _9001007("上传文件缺失"),
    _9001008("上传素材的文件类型不合法"),
    _9001009("上传素材的文件尺寸不合法"),
    _9001010("上传失败"),
    _9001020("帐号不合法"),
    _9001021("已有设备激活率低于 50% ，不能新增设备"),
    _9001022("设备申请数不合法，必须为大于 0 的数字"),
    _9001023("已存在审核中的设备 ID 申请"),
    _9001024("一次查询设备 ID 数量不能超过 50"),
    _9001025("设备 ID 不合法"),
    _9001026("页面 ID 不合法"),
    _9001027("页面参数不合法"),
    _9001028("一次删除页面 ID 数量不能超过 10"),
    _9001029("页面已应用在设备中，请先解除应用关系再删除"),
    _9001030("一次查询页面 ID 数量不能超过 50"),
    _9001031("时间区间不合法"),
    _9001032("保存设备与页面的绑定关系参数错误"),
    _9001033("门店 ID 不合法"),
    _9001034("设备备注信息过长"),
    _9001035("设备申请参数不合法"),
    _9001036("查询起始值 begin 不合法"),

    ;

    /**
     * 代码
     */
    private final Integer code;

    /**
     * 描述
     */
    private final String text;

    /**
     * 描述
     */
    private final CCErrorTypeEnum errorTypeEnum;

    WeChatErrorEnum(Integer code, String text, CCErrorTypeEnum errorTypeEnum) {
        this.code = Optional.ofNullable(code).orElseGet(() -> Integer.parseInt(name().substring(1)));
        this.text = text;
        this.errorTypeEnum = errorTypeEnum;
    }

    WeChatErrorEnum(Integer code, String text) {
        this(code, text, null);
    }

    WeChatErrorEnum(String text, CCErrorTypeEnum errorTypeEnum) {
        this(null, text, errorTypeEnum);
    }

    WeChatErrorEnum(String text) {
        this(text, null);
    }

    public static final Map<Integer, WeChatErrorEnum> CODE_MAP =
        CEnumUtils.toMap(WeChatErrorEnum.class, WeChatErrorEnum::getCode);

    public static WeChatErrorEnum codeOf(Integer code) {
        return CEnumUtils.mapGet(CODE_MAP, code);
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public CCErrorTypeEnum getType() {
        return errorTypeEnum;
    }

}
