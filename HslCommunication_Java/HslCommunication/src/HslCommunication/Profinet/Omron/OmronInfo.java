package HslCommunication.Profinet.Omron;

/**
 * 欧姆龙PLC的一般信息类
 */
public class OmronInfo {


    /**
     * 获取错误信息的字符串描述文本
     * @param err 错误码
     * @return 文本描述
     */
    public static String GetStatusDescription(int err)
    {
        switch(err)
        {
            case 0:return "通讯正常";
            case 1:return "消息头不是FINS";
            case 2: return "数据长度太长";
            case 3:return "该命令不支持";
            case 20:return "超过连接上限";
            case 21:return "指定的节点已经处于连接中";
            case 22:return "尝试去连接一个受保护的网络节点，该节点还未配置到PLC中";
            case 23:return "当前客户端的网络节点超过正常范围";
            case 24:return "当前客户端的网络节点已经被使用";
            case 25:return "所有的网络节点已经被使用";
            default:return "未知错误";
        }
    }
}
